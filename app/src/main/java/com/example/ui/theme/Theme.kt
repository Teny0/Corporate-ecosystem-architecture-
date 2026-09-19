package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = ExecutiveGold,
    onPrimary = Navy900,
    primaryContainer = Navy700,
    onPrimaryContainer = ExecutiveGoldLight,
    secondary = CyanAccent,
    onSecondary = Navy900,
    secondaryContainer = Navy800,
    onSecondaryContainer = CyanLight,
    tertiary = PurpleStrategy,
    onTertiary = Color.White,
    background = Navy900,
    onBackground = TextPrimaryDark,
    surface = Navy800,
    onSurface = TextPrimaryDark,
    surfaceVariant = Navy700,
    onSurfaceVariant = TextSecondaryDark,
    error = RubyDanger,
    onError = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = ExecutiveGoldDark,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFFEF3C7),
    onPrimaryContainer = Color(0xFF78350F),
    secondary = CyanDark,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE0F2FE),
    onSecondaryContainer = Color(0xFF0369A1),
    tertiary = PurpleStrategy,
    onTertiary = Color.White,
    background = SlateLightBg,
    onBackground = TextPrimaryLight,
    surface = SlateLightCard,
    onSurface = TextPrimaryLight,
    surfaceVariant = Color(0xFFF1F5F9),
    onSurfaceVariant = TextSecondaryLight,
    error = RubyDanger,
    onError = Color.White
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = true, // Default to sleek executive dark mode
    dynamicColor: Boolean = false, // Keep high-contrast executive theme
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}

