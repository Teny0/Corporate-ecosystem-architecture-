package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.remote.AdvisorRole
import com.example.data.remote.ChatMessage
import com.example.data.remote.GeminiService
import com.example.ui.components.ExecutiveBadge
import com.example.ui.theme.*
import kotlinx.coroutines.launch

@Composable
fun ConsultantChatScreen(
    currentCompanyName: String,
    modifier: Modifier = Modifier
) {
    var selectedRole by remember { mutableStateOf(AdvisorRole.MCKINSEY_PARTNER) }
    var selectedModel by remember { mutableStateOf(GeminiService.MODEL_PRO_HIGH_THINKING) }

    val messages = remember {
        mutableStateListOf(
            ChatMessage(
                role = "model",
                text = "Welcome to the Executive Advisory Board. I am your Senior Strategy Consultant analyzing **$currentCompanyName**. How can we examine your operating model, capital allocation, or supply chain today?"
            )
        )
    }

    var inputText by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    val scope = rememberCoroutineScope()
    val listState = rememberLazyListState()

    val quickPrompts = listOf(
        "Evaluate capital allocation vs dividend yield",
        "How would McKinsey restructure the supply chain?",
        "Conduct an HBS cold-call case study interrogation",
        "Where are the hidden margin leaks in operations?",
        "Draft a 100-day turnaround plan"
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Navy900)
    ) {
        // Advisory Board Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = Navy800,
            tonalElevation = 3.dp
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "C-SUITE ADVISORY BOARD",
                            style = MaterialTheme.typography.labelSmall,
                            color = ExecutiveGold,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 1.sp
                        )
                        Text(
                            text = selectedRole.title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimaryDark
                        )
                    }

                    // Model Badge
                    val modelLabel = when (selectedModel) {
                        GeminiService.MODEL_PRO_HIGH_THINKING -> "3.1 Pro (Thinking)"
                        GeminiService.MODEL_FLASH -> "3.5 Flash"
                        else -> "3.1 Flash Lite"
                    }
                    ExecutiveBadge(text = modelLabel, containerColor = Navy700, contentColor = CyanAccent)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Role Selector Chips
                ScrollableTabRow(
                    selectedTabIndex = selectedRole.ordinal,
                    edgePadding = 0.dp,
                    containerColor = Color.Transparent,
                    divider = {},
                    indicator = {}
                ) {
                    AdvisorRole.values().forEach { role ->
                        val isSelected = role == selectedRole
                        Box(
                            modifier = Modifier
                                .padding(end = 6.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (isSelected) ExecutiveGold else Navy700)
                                .clickable {
                                    selectedRole = role
                                    messages.add(
                                        ChatMessage(
                                            role = "model",
                                            text = "Switched persona to **${role.title}** (${role.firm}). Let us examine $currentCompanyName from this strategic vantage point."
                                        )
                                    )
                                }
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                        ) {
                            Text(
                                text = role.title.replace("Consultant", "").replace("Professor", "Prof"),
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                color = if (isSelected) Navy900 else TextPrimaryDark
                            )
                        }
                    }
                }
            }
        }

        // Error message if any
        if (errorMessage != null) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                color = RubyDanger.copy(alpha = 0.2f),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Info, contentDescription = null, tint = RubyDanger, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = errorMessage.orEmpty(), style = MaterialTheme.typography.bodySmall, color = TextPrimaryDark, modifier = Modifier.weight(1f))
                    IconButton(onClick = { errorMessage = null }, modifier = Modifier.size(24.dp)) {
                        Icon(Icons.Default.Close, contentDescription = null, tint = TextPrimaryDark, modifier = Modifier.size(16.dp))
                    }
                }
            }
        }

        // Messages Thread
        LazyColumn(
            state = listState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(messages) { msg ->
                val isUser = msg.role == "user"
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = if (isUser) Arrangement.End else Arrangement.Start
                ) {
                    if (!isUser) {
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(ExecutiveGold),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("AI", color = Navy900, fontWeight = FontWeight.Bold, fontSize = 10.sp)
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                    Box(
                        modifier = Modifier
                            .widthIn(max = 300.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 16.dp,
                                    topEnd = 16.dp,
                                    bottomStart = if (isUser) 16.dp else 4.dp,
                                    bottomEnd = if (isUser) 4.dp else 16.dp
                                )
                            )
                            .background(if (isUser) ExecutiveGold else Navy700)
                            .border(
                                1.dp,
                                if (isUser) ExecutiveGold else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f),
                                RoundedCornerShape(16.dp)
                            )
                            .padding(12.dp)
                    ) {
                        Text(
                            text = msg.text,
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (isUser) Navy900 else TextPrimaryDark,
                            lineHeight = 20.sp
                        )
                    }
                }
            }

            if (isLoading) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(20.dp),
                            color = ExecutiveGold,
                            strokeWidth = 2.dp
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "${selectedRole.title} is formulating strategic analysis...",
                            style = MaterialTheme.typography.bodySmall,
                            color = ExecutiveGoldLight
                        )
                    }
                }
            }
        }

        // Quick prompts pills
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            items(quickPrompts) { prompt ->
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(Navy800)
                        .border(1.dp, CyanAccent.copy(alpha = 0.3f), RoundedCornerShape(16.dp))
                        .clickable {
                            inputText = prompt
                        }
                        .padding(horizontal = 10.dp, vertical = 5.dp)
                ) {
                    Text(
                        text = prompt,
                        style = MaterialTheme.typography.labelSmall,
                        color = CyanLight
                    )
                }
            }
        }

        // Input Field Bar
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = Navy800,
            tonalElevation = 6.dp
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    placeholder = { Text("Ask ${selectedRole.title}...", color = TextMutedDark, fontSize = 14.sp) },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(24.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = ExecutiveGold,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f),
                        focusedTextColor = TextPrimaryDark,
                        unfocusedTextColor = TextPrimaryDark
                    ),
                    maxLines = 3
                )
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(
                    onClick = {
                        val query = inputText.trim()
                        if (query.isNotEmpty() && !isLoading) {
                            inputText = ""
                            messages.add(ChatMessage("user", query))
                            isLoading = true
                            errorMessage = null

                            scope.launch {
                                val result = GeminiService.sendChatMessage(
                                    history = messages.dropLast(1),
                                    latestUserMessage = query,
                                    role = selectedRole,
                                    model = selectedModel
                                )
                                isLoading = false
                                result.fold(
                                    onSuccess = { reply ->
                                        messages.add(ChatMessage("model", reply))
                                    },
                                    onFailure = { err ->
                                        errorMessage = err.message ?: "Failed to generate reply."
                                        // Provide offline simulated consultant advice if API key not entered
                                        messages.add(
                                            ChatMessage(
                                                "model",
                                                "**[Executive Advisory Insight for $currentCompanyName]**\n\nAddressing '$query':\n\n1. **Core Thesis**: When examining $currentCompanyName, capital allocation must protect core high-margin cash engines while ruthlessly eliminating friction across tier-1 supplier nodes.\n2. **Strategic Action**: Institute 14-day cycle reviews and align KPI incentives with free cash flow conversion rather than top-line vanity metrics."
                                            )
                                        )
                                    }
                                )
                                listState.animateScrollToItem(messages.size - 1)
                            }
                        }
                    },
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(ExecutiveGold)
                ) {
                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = "Send",
                        tint = Navy900,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}
