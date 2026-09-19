package com.example.data.remote

import android.util.Log
import com.example.BuildConfig
import com.example.data.model.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.TimeUnit

data class ChatMessage(
    val role: String, // "user" or "model"
    val text: String,
    val timestamp: Long = System.currentTimeMillis()
)

enum class AdvisorRole(val title: String, val firm: String, val systemInstruction: String) {
    MCKINSEY_PARTNER(
        "McKinsey Senior Partner",
        "Strategy & Turnaround",
        "You are a world-class McKinsey & Company Senior Partner specializing in corporate turnaround, MECE frameworks, operational restructuring, and shareholder value creation. Give crisp, structured, top-down executive advice with bullet points, quantifiable metrics, and actionable recommendations. Always maintain the analytical rigor of McKinsey and BCG."
    ),
    FORTUNE_500_CEO(
        "Fortune 500 Conglomerate CEO",
        "Global Enterprise Leadership",
        "You are a seasoned Fortune 500 CEO who has run multi-billion-dollar global conglomerates spanning hardware, software, energy, and retail. Speak from direct board-room experience on capital allocation, talent culture, investor relations, aggressive expansion, and balancing quarterly EPS with generational brand trust."
    ),
    HBS_PROFESSOR(
        "Harvard Business School Professor",
        "Strategy & Case Method",
        "You are the Michael E. Porter Professor of Business Administration at Harvard Business School. You analyze business situations through classic and modern MBA frameworks (Porter's 5 Forces, Blue Ocean, Resource-Based View, Disruptive Innovation, Platform Economics). Challenge assumptions with Socratic discussion questions and classic case study lessons."
    ),
    SUPPLY_CHAIN_CHIEF(
        "Global Chief Supply Chain Officer",
        "Logistics & Operations",
        "You are an expert Chief Supply Chain & Operations Officer with 30 years of experience managing global procurement, tier-1 vendor contracts, automated gigafactories, maritime shipping, and last-mile logistics. Give highly pragmatic, granular operational solutions on supplier concentration, working capital, inventory turns, and nearshoring."
    )
}

object GeminiService {
    private const val TAG = "GeminiService"
    private const val BASE_URL = "https://generativelanguage.googleapis.com/v1beta/models/"

    // Supported modern models per skill guidelines
    const val MODEL_PRO_HIGH_THINKING = "gemini-3.1-pro-preview"
    const val MODEL_FLASH = "gemini-3.5-flash"
    const val MODEL_FLASH_LITE = "gemini-3.1-flash-lite-preview"

    private val client = OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .build()

    private fun getApiKey(): String {
        val key = try {
            BuildConfig.GEMINI_API_KEY
        } catch (e: Throwable) {
            ""
        }
        return if (key.isNullOrBlank() || key == "MY_GEMINI_API_KEY") "" else key
    }

    fun isApiKeyConfigured(): Boolean {
        return getApiKey().isNotEmpty()
    }

    /**
     * Deep Thinking mode query using gemini-3.1-pro-preview with thinkingLevel = "high"
     * Per instructions: Do NOT set maxOutputTokens.
     */
    suspend fun analyzeWithHighThinking(
        prompt: String,
        systemInstructionText: String? = null
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = getApiKey()
        if (apiKey.isEmpty()) {
            return@withContext Result.failure(
                IllegalStateException("Gemini API key is not configured. Please add your key in the AI Studio Secrets panel.")
            )
        }

        try {
            val root = JSONObject()
            val contents = JSONArray()
            val userContent = JSONObject()
            userContent.put("role", "user")
            val parts = JSONArray()
            val textPart = JSONObject().put("text", prompt)
            parts.put(textPart)
            userContent.put("parts", parts)
            contents.put(userContent)
            root.put("contents", contents)

            if (!systemInstructionText.isNullOrBlank()) {
                val sysContent = JSONObject()
                val sysParts = JSONArray()
                sysParts.put(JSONObject().put("text", systemInstructionText))
                sysContent.put("parts", sysParts)
                root.put("systemInstruction", sysContent)
            }

            // High thinking configuration per guidelines
            val genConfig = JSONObject()
            genConfig.put("temperature", 0.7)
            val thinkingConfig = JSONObject()
            thinkingConfig.put("thinkingLevel", "high")
            genConfig.put("thinkingConfig", thinkingConfig)
            // Notice: do NOT set maxOutputTokens per user feature prompt
            root.put("generationConfig", genConfig)

            val url = "$BASE_URL$MODEL_PRO_HIGH_THINKING:generateContent?key=$apiKey"
            val body = root.toString().toRequestBody("application/json; charset=utf-8".toMediaType())
            val request = Request.Builder().url(url).post(body).build()

            val response = client.newCall(request).execute()
            val responseBody = response.body?.string().orEmpty()

            if (!response.isSuccessful) {
                Log.e(TAG, "Gemini API error: ${response.code} - $responseBody")
                return@withContext Result.failure(Exception("API Error (${response.code}): $responseBody"))
            }

            val jsonResponse = JSONObject(responseBody)
            val candidates = jsonResponse.optJSONArray("candidates")
            if (candidates != null && candidates.length() > 0) {
                val firstCandidate = candidates.getJSONObject(0)
                val contentObj = firstCandidate.optJSONObject("content")
                val partsArr = contentObj?.optJSONArray("parts")
                val textBuilder = StringBuilder()
                if (partsArr != null) {
                    for (i in 0 until partsArr.length()) {
                        val part = partsArr.getJSONObject(i)
                        if (part.has("text")) {
                            textBuilder.append(part.getString("text"))
                        }
                    }
                }
                val resultText = textBuilder.toString().trim()
                if (resultText.isNotEmpty()) {
                    return@withContext Result.success(resultText)
                }
            }
            Result.failure(Exception("Empty candidate response from model."))
        } catch (e: Exception) {
            Log.e(TAG, "Exception during analyzeWithHighThinking", e)
            Result.failure(e)
        }
    }

    /**
     * Multi-turn chat interface using Gemini with configurable model and role system instructions.
     */
    suspend fun sendChatMessage(
        history: List<ChatMessage>,
        latestUserMessage: String,
        role: AdvisorRole,
        model: String = MODEL_FLASH
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = getApiKey()
        if (apiKey.isEmpty()) {
            return@withContext Result.failure(
                IllegalStateException("Gemini API key is not configured. Please add your key in the AI Studio Secrets panel.")
            )
        }

        try {
            val root = JSONObject()
            val contents = JSONArray()

            // Append history
            for (msg in history) {
                val item = JSONObject()
                item.put("role", if (msg.role == "user") "user" else "model")
                val parts = JSONArray()
                parts.put(JSONObject().put("text", msg.text))
                item.put("parts", parts)
                contents.put(item)
            }

            // Append latest user message
            val currentTurn = JSONObject()
            currentTurn.put("role", "user")
            val currentParts = JSONArray()
            currentParts.put(JSONObject().put("text", latestUserMessage))
            currentTurn.put("parts", currentParts)
            contents.put(currentTurn)

            root.put("contents", contents)

            // System Instruction
            val sysContent = JSONObject()
            val sysParts = JSONArray()
            sysParts.put(JSONObject().put("text", role.systemInstruction))
            sysContent.put("parts", sysParts)
            root.put("systemInstruction", sysContent)

            // Generation config
            val genConfig = JSONObject()
            genConfig.put("temperature", 0.7)
            if (model == MODEL_PRO_HIGH_THINKING) {
                val thinkingConfig = JSONObject()
                thinkingConfig.put("thinkingLevel", "high")
                genConfig.put("thinkingConfig", thinkingConfig)
            }
            root.put("generationConfig", genConfig)

            val url = "$BASE_URL$model:generateContent?key=$apiKey"
            val body = root.toString().toRequestBody("application/json; charset=utf-8".toMediaType())
            val request = Request.Builder().url(url).post(body).build()

            val response = client.newCall(request).execute()
            val responseBody = response.body?.string().orEmpty()

            if (!response.isSuccessful) {
                return@withContext Result.failure(Exception("Chat API Error (${response.code}): $responseBody"))
            }

            val jsonResponse = JSONObject(responseBody)
            val candidates = jsonResponse.optJSONArray("candidates")
            val reply = candidates?.optJSONObject(0)
                ?.optJSONObject("content")
                ?.optJSONArray("parts")
                ?.optJSONObject(0)
                ?.optString("text")

            if (!reply.isNullOrBlank()) {
                Result.success(reply)
            } else {
                Result.failure(Exception("No reply generated by model."))
            }
        } catch (e: Exception) {
            Log.e(TAG, "Exception during sendChatMessage", e)
            Result.failure(e)
        }
    }

    /**
     * Video Understanding for Corporate Strategy & Operations
     * Uses gemini-3.1-pro-preview with video inlineData or video frame analysis
     */
    suspend fun analyzeVideoContent(
        videoBase64OrKeyframes: String,
        mimeType: String,
        prompt: String
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = getApiKey()
        if (apiKey.isEmpty()) {
            return@withContext Result.failure(
                IllegalStateException("Gemini API key is not configured. Please add your key in the AI Studio Secrets panel.")
            )
        }

        try {
            val root = JSONObject()
            val contents = JSONArray()
            val userContent = JSONObject()
            userContent.put("role", "user")

            val parts = JSONArray()
            // Text instructions
            val textPart = JSONObject().put("text", prompt)
            parts.put(textPart)

            // Video data part
            val inlineData = JSONObject()
            inlineData.put("mimeType", mimeType)
            inlineData.put("data", videoBase64OrKeyframes)
            val mediaPart = JSONObject().put("inlineData", inlineData)
            parts.put(mediaPart)

            userContent.put("parts", parts)
            contents.put(userContent)
            root.put("contents", contents)

            // Use gemini-3.1-pro-preview per feature requirement
            val genConfig = JSONObject()
            genConfig.put("temperature", 0.4)
            val thinkingConfig = JSONObject()
            thinkingConfig.put("thinkingLevel", "high")
            genConfig.put("thinkingConfig", thinkingConfig)
            root.put("generationConfig", genConfig)

            val url = "$BASE_URL$MODEL_PRO_HIGH_THINKING:generateContent?key=$apiKey"
            val body = root.toString().toRequestBody("application/json; charset=utf-8".toMediaType())
            val request = Request.Builder().url(url).post(body).build()

            val response = client.newCall(request).execute()
            val responseBody = response.body?.string().orEmpty()

            if (!response.isSuccessful) {
                return@withContext Result.failure(Exception("Video API Error (${response.code}): $responseBody"))
            }

            val jsonResponse = JSONObject(responseBody)
            val candidates = jsonResponse.optJSONArray("candidates")
            val reply = candidates?.optJSONObject(0)
                ?.optJSONObject("content")
                ?.optJSONArray("parts")
                ?.optJSONObject(0)
                ?.optString("text")

            if (!reply.isNullOrBlank()) {
                Result.success(reply)
            } else {
                Result.failure(Exception("No video analysis generated by model."))
            }
        } catch (e: Exception) {
            Log.e(TAG, "Exception during analyzeVideoContent", e)
            Result.failure(e)
        }
    }
}
