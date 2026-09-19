package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import com.example.data.model.AnalysisLens
import com.example.data.model.CompanyBusinessOS
import com.example.data.repository.PreloadedCompanies
import com.example.ui.components.ExecutiveBadge
import com.example.ui.screens.ConsultantChatScreen
import com.example.ui.screens.DynamicAnalyzeDialog
import com.example.ui.screens.LevelBrowserScreen
import com.example.ui.screens.VideoAnalyzerScreen
import com.example.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                BusinessOSApp()
            }
        }
    }
}

enum class MainAppTab(val label: String, val icon: androidx.compose.ui.graphics.vector.ImageVector) {
    ECOSYSTEM_LEVELS("18 Levels", Icons.Default.AccountTree),
    VIDEO_INTEL("Video Intel", Icons.Default.VideoLibrary),
    C_SUITE_CHAT("Advisory Chat", Icons.Default.Forum)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusinessOSApp() {
    val companies: List<CompanyBusinessOS> = remember { PreloadedCompanies.getAllCompanies() }
    var selectedCompanyIndex by remember { mutableStateOf(0) }
    val currentCompany: CompanyBusinessOS = companies[selectedCompanyIndex]

    var selectedTab by remember { mutableStateOf(MainAppTab.ECOSYSTEM_LEVELS) }
    var selectedLens by remember { mutableStateOf(AnalysisLens.MANAGER) }
    var showCompanyDropdown by remember { mutableStateOf(false) }
    var showHighThinkingDialog by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "BUSINESS OPERATING SYSTEM",
                            style = MaterialTheme.typography.labelSmall,
                            color = ExecutiveGold,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 1.sp
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.clickable { showCompanyDropdown = true }
                        ) {
                            Text(
                                text = currentCompany.companyName,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimaryDark
                            )
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Switch Company",
                                tint = ExecutiveGold
                            )
                        }

                        DropdownMenu(
                            expanded = showCompanyDropdown,
                            onDismissRequest = { showCompanyDropdown = false },
                            modifier = Modifier.background(Navy800)
                        ) {
                            for ((index, comp) in companies.withIndex()) {
                                DropdownMenuItem(
                                    text = {
                                        Column {
                                            Text(
                                                text = comp.companyName,
                                                fontWeight = if (index == selectedCompanyIndex) FontWeight.Bold else FontWeight.Normal,
                                                color = if (index == selectedCompanyIndex) ExecutiveGold else TextPrimaryDark
                                            )
                                            Text(
                                                text = comp.industrySector,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = TextSecondaryDark
                                            )
                                        }
                                    },
                                    onClick = {
                                        selectedCompanyIndex = index
                                        showCompanyDropdown = false
                                    }
                                )
                            }
                        }
                    }
                },
                actions = {
                    // High Thinking Deep Dive Action Button
                    Button(
                        onClick = { showHighThinkingDialog = true },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Navy700,
                            contentColor = ExecutiveGold
                        ),
                        shape = RoundedCornerShape(20.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp),
                        modifier = Modifier.padding(end = 8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Psychology,
                            contentDescription = "High Thinking Audit",
                            tint = ExecutiveGold,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "High Thinking",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Navy900,
                    titleContentColor = TextPrimaryDark
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = Navy800,
                tonalElevation = 8.dp
            ) {
                MainAppTab.values().forEach { tab ->
                    val isSelected = tab == selectedTab
                    NavigationBarItem(
                        selected = isSelected,
                        onClick = { selectedTab = tab },
                        icon = {
                            Icon(
                                imageVector = tab.icon,
                                contentDescription = tab.label
                            )
                        },
                        label = {
                            Text(
                                text = tab.label,
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Navy900,
                            selectedTextColor = ExecutiveGold,
                            indicatorColor = ExecutiveGold,
                            unselectedIconColor = TextSecondaryDark,
                            unselectedTextColor = TextSecondaryDark
                        )
                    )
                }
            }
        },
        containerColor = Navy900
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (selectedTab) {
                MainAppTab.ECOSYSTEM_LEVELS -> {
                    LevelBrowserScreen(
                        company = currentCompany,
                        selectedLens = selectedLens,
                        onLensSelected = { selectedLens = it },
                        onTriggerDeepThinking = { showHighThinkingDialog = true }
                    )
                }
                MainAppTab.VIDEO_INTEL -> {
                    VideoAnalyzerScreen(
                        currentCompanyName = currentCompany.companyName
                    )
                }
                MainAppTab.C_SUITE_CHAT -> {
                    ConsultantChatScreen(
                        currentCompanyName = currentCompany.companyName
                    )
                }
            }

            if (showHighThinkingDialog) {
                DynamicAnalyzeDialog(
                    initialCompanyName = currentCompany.companyName,
                    onDismiss = { showHighThinkingDialog = false }
                )
            }
        }
    }
}
