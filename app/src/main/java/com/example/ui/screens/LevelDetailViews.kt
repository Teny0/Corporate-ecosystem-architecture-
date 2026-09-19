package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.data.model.*
import com.example.ui.components.*
import com.example.ui.theme.*

@Composable
fun Level1View(overview: Level1Overview, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(1, "Company Overview", "Foundation & Market Position", Icons.Default.Apartment)
        LensExplanationCard(lens, overview.lensContent)

        // Executive Summary Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("EXECUTIVE SUMMARY", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                Text(overview.executiveSummary, style = MaterialTheme.typography.bodyMedium, lineHeight = 22.sp)
            }
        }

        // Vision & Mission
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(
                modifier = Modifier.weight(1f),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("VISION", style = MaterialTheme.typography.labelSmall, color = CyanAccent, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(overview.vision, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp)
                }
            }
            Card(
                modifier = Modifier.weight(1f),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("MISSION", style = MaterialTheme.typography.labelSmall, color = CyanAccent, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(overview.mission, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp)
                }
            }
        }

        // Founder & History
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("FOUNDER STORY & HERITAGE", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(overview.founderStory, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
                Divider(modifier = Modifier.padding(vertical = 10.dp), color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))
                Text("COMPANY HISTORY", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(overview.companyHistory, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }

        // Milestones
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("MAJOR MILESTONES", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                overview.majorMilestones.forEach { milestone ->
                    Row(modifier = Modifier.padding(vertical = 3.dp), verticalAlignment = Alignment.Top) {
                        Text("•", color = ExecutiveGold, fontWeight = FontWeight.Bold, modifier = Modifier.padding(end = 6.dp))
                        Text(milestone, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}

@Composable
fun Level2View(empireMap: Level2EmpireMap, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(2, "Business Empire Map", "Conglomerate Architecture", Icons.Default.AccountTree)
        LensExplanationCard(lens, empireMap.lensContent)

        // Holding structure
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Navy700),
            border = CardDefaults.outlinedCardBorder().copy(brush = androidx.compose.ui.graphics.SolidColor(ExecutiveGold))
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("HOLDING COMPANY APEX", style = MaterialTheme.typography.labelSmall, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(4.dp))
                Text(empireMap.holdingStructure, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = TextPrimaryDark)
            }
        }

        // Business Units Tree
        Text(
            "OPERATING SUBSIDIARIES & VERTICALS",
            style = MaterialTheme.typography.labelMedium,
            color = CyanAccent,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)
        )

        empireMap.businessUnits.forEach { node ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(ExecutiveGold.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("↳", color = ExecutiveGold, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(node.name, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                            Text(node.category, style = MaterialTheme.typography.labelSmall, color = CyanAccent)
                        }
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(node.description, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    if (node.subVentures.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(6.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(6.dp), modifier = Modifier.fillMaxWidth()) {
                            node.subVentures.forEach { venture ->
                                ExecutiveBadge(text = venture, containerColor = MaterialTheme.colorScheme.surfaceVariant, contentColor = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        }
                    }
                }
            }
        }

        // Synergies
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("ECOSYSTEM CROSS-SYNERGIES", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(empireMap.ecosystemSynergies, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }
    }
}

@Composable
fun Level3View(valueChain: Level3ValueChain, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(3, "From Raw Material to Customer", "Complete End-to-End Value Chain", Icons.Default.AllInclusive)
        LensExplanationCard(lens, valueChain.lensContent)

        // Metrics banner
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(modifier = Modifier.weight(1f), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("END-TO-END LEAD TIME", style = MaterialTheme.typography.labelSmall, color = CyanAccent)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(valueChain.endToEndLeadTime, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.SemiBold)
                }
            }
            Card(modifier = Modifier.weight(1f), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("INTEGRATION DEGREE", style = MaterialTheme.typography.labelSmall, color = ExecutiveGold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(valueChain.verticalIntegrationDegree, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.SemiBold)
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
        valueChain.stages.forEachIndexed { index, stage ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(ExecutiveGold),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("${index + 1}", color = Navy900, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(stage.stageName, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Activities: ${stage.activities}", style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Cost Drivers: ${stage.costDrivers}", style = MaterialTheme.typography.bodySmall, color = CoralWarning)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Key Risks: ${stage.risks}", style = MaterialTheme.typography.bodySmall, color = RubyDanger)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Technology: ${stage.technologies}", style = MaterialTheme.typography.bodySmall, color = CyanAccent)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Advantage: ${stage.competitiveAdvantage}", style = MaterialTheme.typography.bodySmall, color = EmeraldSuccess, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}

@Composable
fun Level5View(portfolio: Level5ProductPortfolio, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(5, "Product Portfolio Analysis", "BCG Growth-Share Matrix", Icons.Default.PieChart)
        LensExplanationCard(lens, portfolio.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("PORTFOLIO HEALTH VERDICT", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(portfolio.portfolioHealthVerdict, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }

        portfolio.items.forEach { item ->
            val (badgeText, badgeColor) = when (item.category) {
                BcgCategory.CASH_COW -> "CASH COW" to EmeraldSuccess
                BcgCategory.STAR_GROWTH -> "STAR (GROWTH)" to CyanAccent
                BcgCategory.QUESTION_MARK_EMERGING -> "QUESTION MARK" to CoralWarning
                BcgCategory.DECLINING_DOG -> "DOG (DECLINING)" to RubyDanger
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(item.businessUnit, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                        ExecutiveBadge(text = badgeText, containerColor = badgeColor.copy(alpha = 0.15f), contentColor = badgeColor)
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Products: ${item.products}", style = MaterialTheme.typography.bodySmall)
                    Text("Target Customer: ${item.targetCustomer}", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Text("Revenue Weight: ${item.revenueImportance}", style = MaterialTheme.typography.bodySmall, color = ExecutiveGold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(item.rationale, style = MaterialTheme.typography.bodySmall, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic)
                }
            }
        }
    }
}

@Composable
fun Level11View(swot: Level11Swot, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(11, "SWOT Analysis", "Strategic Positioning Matrix", Icons.Default.Grid4x4)
        LensExplanationCard(lens, swot.lensContent)

        // Strengths
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("STRENGTHS (INTERNAL)", style = MaterialTheme.typography.titleSmall, color = EmeraldSuccess, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                swot.strengths.forEach { Text("✓ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }

        // Weaknesses
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("WEAKNESSES (INTERNAL)", style = MaterialTheme.typography.titleSmall, color = CoralWarning, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                swot.weaknesses.forEach { Text("⚠ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }

        // Opportunities
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("OPPORTUNITIES (EXTERNAL)", style = MaterialTheme.typography.titleSmall, color = CyanAccent, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                swot.opportunities.forEach { Text("✦ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }

        // Threats
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("THREATS (EXTERNAL)", style = MaterialTheme.typography.titleSmall, color = RubyDanger, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                swot.threats.forEach { Text("✕ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }
    }
}

@Composable
fun Level17View(consultant: Level17ConsultantMode, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(17, "Consultant Mode", "McKinsey Partner Strategic Audit", Icons.Default.Analytics)
        LensExplanationCard(lens, consultant.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Navy700),
            border = CardDefaults.outlinedCardBorder().copy(brush = androidx.compose.ui.graphics.SolidColor(ExecutiveGold))
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("PARTNER PRIORITY SCORECARD", style = MaterialTheme.typography.labelSmall, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                consultant.priorityScorecard.forEach { priority ->
                    Row(modifier = Modifier.padding(vertical = 3.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text("▶", color = ExecutiveGold, fontSize = 12.sp, modifier = Modifier.padding(end = 8.dp))
                        Text(priority, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = TextPrimaryDark)
                    }
                }
            }
        }

        // 5 Core Consultant Questions
        val questions = listOf(
            Triple("1. What is working exceptionally well?", consultant.whatIsWorkingWell, EmeraldSuccess),
            Triple("2. What is inefficient?", consultant.whatIsInefficient, CoralWarning),
            Triple("3. What should be improved?", consultant.whatShouldBeImproved, CyanAccent),
            Triple("4. Where are hidden opportunities?", consultant.whereAreHiddenOpportunities, PurpleStrategy),
            Triple("5. What should management prioritize next?", consultant.whatShouldManagementPrioritizeNext, ExecutiveGold)
        )

        questions.forEach { (q, a, accent) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(q, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = accent)
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(a, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
                }
            }
        }
    }
}

@Composable
fun Level18View(dashboard: Level18CeoDashboard) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(18, "One-Page CEO Dashboard", "Executive C-Suite Overview", Icons.Default.Dashboard)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = Navy700),
            border = CardDefaults.outlinedCardBorder().copy(brush = androidx.compose.ui.graphics.SolidColor(ExecutiveGold))
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(dashboard.executiveScoreRating, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold, color = ExecutiveGold)
                Spacer(modifier = Modifier.height(6.dp))
                Text("BUSINESS MODEL: ${dashboard.businessModel}", style = MaterialTheme.typography.bodySmall, lineHeight = 19.sp, color = TextPrimaryDark)
            }
        }

        val items = listOf(
            "REVENUE ENGINE" to dashboard.revenueEngine,
            "SUPPLY CHAIN" to dashboard.supplyChainSummary,
            "MARKETING LOGISTICS" to dashboard.marketingLogisticsSummary,
            "COMPETITIVE ADVANTAGE" to dashboard.competitiveAdvantageSummary,
            "PRIMARY RISKS" to dashboard.primaryRisksSummary,
            "FUTURE OPPORTUNITIES" to dashboard.futureOpportunitiesSummary
        )

        items.forEach { (label, value) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 3.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(label, style = MaterialTheme.typography.labelSmall, color = CyanAccent, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(value, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp)
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("STRATEGIC PRIORITIES", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                dashboard.strategicPrioritiesList.forEach { Text("✓ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }
    }
}
