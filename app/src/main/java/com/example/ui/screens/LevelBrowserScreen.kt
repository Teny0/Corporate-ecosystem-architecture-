package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import com.example.data.model.*
import com.example.ui.components.ExecutiveBadge
import com.example.ui.components.PerspectiveSelector
import com.example.ui.theme.*

@Composable
fun LevelBrowserScreen(
    company: CompanyBusinessOS,
    selectedLens: AnalysisLens,
    onLensSelected: (AnalysisLens) -> Unit,
    onTriggerDeepThinking: (String) -> Unit
) {
    var selectedLevel by remember { mutableStateOf(1) }

    val levelNames = listOf(
        "1. Overview",
        "2. Empire Map",
        "3. Value Chain",
        "4. Logistics",
        "5. Portfolio",
        "6. Customer Value",
        "7. Moats",
        "8. Financials",
        "9. Operations",
        "10. Digital Tech",
        "11. SWOT",
        "12. Risk Mgmt",
        "13. Leadership",
        "14. Competitors",
        "15. Roadmap",
        "16. MBA Case",
        "17. Consultant",
        "18. CEO Dashboard"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        // Company Executive Header
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = Navy800,
            tonalElevation = 4.dp
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = company.companyName,
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = ExecutiveGold
                        )
                        Text(
                            text = "${company.industrySector} • ${company.tickerOrCode}",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondaryDark
                        )
                    }
                    ExecutiveBadge(
                        text = company.estimatedValuation,
                        containerColor = Navy700,
                        contentColor = CyanAccent
                    )
                }
            }
        }

        // Level horizontal pill selector
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(Navy900)
                .padding(vertical = 8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(levelNames.indices.toList()) { index ->
                val levelNum = index + 1
                val isSelected = levelNum == selectedLevel
                val bgColor = if (isSelected) ExecutiveGold else Navy700
                val textColor = if (isSelected) Navy900 else TextPrimaryDark

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(bgColor)
                        .border(
                            1.dp,
                            if (isSelected) ExecutiveGold else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f),
                            RoundedCornerShape(12.dp)
                        )
                        .clickable { selectedLevel = levelNum }
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = levelNames[index],
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        color = textColor
                    )
                }
            }
        }

        // 5-Lens Perspective Selector
        PerspectiveSelector(
            selectedLens = selectedLens,
            onLensSelected = onLensSelected
        )

        // Active Level Content
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            item {
                when (selectedLevel) {
                    1 -> Level1View(company.level1, selectedLens)
                    2 -> Level2View(company.level2, selectedLens)
                    3 -> Level3View(company.level3, selectedLens)
                    4 -> Level4View(company.level4, selectedLens)
                    5 -> Level5View(company.level5, selectedLens)
                    6 -> Level6View(company.level6, selectedLens)
                    7 -> Level7View(company.level7, selectedLens)
                    8 -> Level8View(company.level8, selectedLens)
                    9 -> Level9View(company.level9, selectedLens)
                    10 -> Level10View(company.level10, selectedLens)
                    11 -> Level11View(company.level11, selectedLens)
                    12 -> Level12View(company.level12, selectedLens)
                    13 -> Level13View(company.level13, selectedLens)
                    14 -> Level14View(company.level14, selectedLens)
                    15 -> Level15View(company.level15, selectedLens)
                    16 -> Level16View(company.level16, selectedLens)
                    17 -> Level17View(company.level17, selectedLens)
                    18 -> Level18View(company.level18)
                    else -> Level1View(company.level1, selectedLens)
                }
            }
        }
    }
}
