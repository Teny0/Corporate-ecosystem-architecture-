package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.*
import com.example.ui.components.*
import com.example.ui.theme.*

@Composable
fun Level4View(logistics: Level4LogisticsEngine, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(4, "Marketing Logistics Engine", "Physical Movement & Distribution Infrastructure", Icons.Default.LocalShipping)
        LensExplanationCard(lens, logistics.lensContent)

        val elements = listOf(
            "Transportation" to logistics.transportation,
            "Warehousing" to logistics.warehousing,
            "Inventory Management" to logistics.inventoryManagement,
            "Order Processing" to logistics.orderProcessing,
            "Distribution Network" to logistics.distributionNetwork,
            "Last-Mile Delivery" to logistics.lastMileDelivery
        )

        elements.forEach { (title, elem) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(title.uppercase(), style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = ExecutiveGold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(elem.name, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Movement Strategy: ${elem.movementStrategy}", style = MaterialTheme.typography.bodySmall)
                    Text("Cost Structure: ${elem.costStructure}", style = MaterialTheme.typography.bodySmall, color = CoralWarning)
                    Text("Service Strategy: ${elem.serviceStrategy}", style = MaterialTheme.typography.bodySmall, color = CyanAccent)
                    Text("Customer Impact: ${elem.customerImpact}", style = MaterialTheme.typography.bodySmall, color = EmeraldSuccess)
                    Text("Example: ${elem.realWorldExample}", style = MaterialTheme.typography.bodySmall, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic)
                }
            }
        }
    }
}

@Composable
fun Level6View(customerValue: Level6CustomerValue, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(6, "Customer Value Creation", "The 6 Dimensions of Consumer Choice", Icons.Default.Favorite)
        LensExplanationCard(lens, customerValue.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("BRAND TRUST RATIONALE", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(customerValue.brandTrustRationale, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }

        customerValue.dimensions.forEach { dim ->
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
                        Text(dim.dimension, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                        ExecutiveBadge(text = "${dim.scoreOutOfTen}/10", containerColor = ExecutiveGold.copy(alpha = 0.2f), contentColor = ExecutiveGold)
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(dim.explanation, style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Why Customers Choose This: ${dim.customerSelectionReason}", style = MaterialTheme.typography.bodySmall, color = CyanAccent)
                }
            }
        }
    }
}

@Composable
fun Level7View(advantage: Level7CompetitiveAdvantage, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(7, "Competitive Advantage System", "Economic Moats & Defensibility", Icons.Default.Shield)
        LensExplanationCard(lens, advantage.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = Navy700),
            border = CardDefaults.outlinedCardBorder().copy(brush = androidx.compose.ui.graphics.SolidColor(ExecutiveGold))
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("ECOSYSTEM LOCK-IN EFFECT", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(advantage.ecosystemLockIn, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp, color = TextPrimaryDark)
            }
        }

        advantage.moats.forEach { moat ->
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
                        Text(moat.pillar, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                        ExecutiveBadge(text = "${moat.moatStrength} Moat", containerColor = EmeraldSuccess.copy(alpha = 0.15f), contentColor = EmeraldSuccess)
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text("Barrier to Entry: ${moat.barrierToEntry}", style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Why Competitors Struggle to Copy: ${moat.replicabilityChallenge}", style = MaterialTheme.typography.bodySmall, color = CyanAccent)
                }
            }
        }
    }
}

@Composable
fun Level8View(financial: Level8FinancialEngine, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(8, "Financial Engine", "Revenue Streams, Cost Structures & Cash Flow", Icons.Default.MonetizationOn)
        LensExplanationCard(lens, financial.lensContent)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(modifier = Modifier.weight(1f), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("GROSS MARGIN", style = MaterialTheme.typography.labelSmall, color = CyanAccent)
                    Text(financial.grossMarginAvg, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold)
                }
            }
            Card(modifier = Modifier.weight(1f), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text("OPERATING MARGIN", style = MaterialTheme.typography.labelSmall, color = ExecutiveGold)
                    Text(financial.operatingMarginAvg, style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold)
                }
            }
        }

        financial.steps.forEachIndexed { idx, step ->
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
                            Text("${idx + 1}", color = Navy900, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(step.stage, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(step.description, style = MaterialTheme.typography.bodySmall)
                    Text("Key Metrics: ${step.keyMetrics}", style = MaterialTheme.typography.bodySmall, color = CyanAccent)
                    Text("Cash Dynamics: ${step.moneyMovement}", style = MaterialTheme.typography.bodySmall, color = EmeraldSuccess)
                }
            }
        }
    }
}

@Composable
fun Level9View(operations: Level9OperationsEngine, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(9, "Operations Engine", "Manufacturing, Vendor Network & Quality Systems", Icons.Default.PrecisionManufacturing)
        LensExplanationCard(lens, operations.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("OPERATIONAL EXCELLENCE PHILOSOPHY", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(operations.overallExcellenceSummary, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }

        operations.pillars.forEach { pillar ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(pillar.area, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = CyanAccent)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(pillar.practices, style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Key Metric: ${pillar.operationalExcellenceMetric}", style = MaterialTheme.typography.bodySmall, color = EmeraldSuccess, fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}

@Composable
fun Level10View(digital: Level10DigitalTransformation, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(10, "Digital Transformation", "AI, Cloud, ERP & Industrial IoT", Icons.Default.Memory)
        LensExplanationCard(lens, digital.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("DIGITAL MATURITY VERDICT", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(digital.digitalMaturityVerdict, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }

        digital.pillars.forEach { pillar ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(pillar.technology, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = CyanAccent)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Implementation: ${pillar.implementation}", style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Growth Impact: ${pillar.businessGrowthImpact}", style = MaterialTheme.typography.bodySmall, color = EmeraldSuccess)
                }
            }
        }
    }
}

@Composable
fun Level12View(risk: Level12RiskManagement, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(12, "Risk Management", "Enterprise Risk Framework & Mitigations", Icons.Default.Warning)
        LensExplanationCard(lens, risk.lensContent)

        risk.risks.forEach { r ->
            val color = when (r.severity) {
                "Critical", "High" -> RubyDanger
                "Moderate" -> CoralWarning
                else -> EmeraldSuccess
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
                        Text(r.category, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
                        ExecutiveBadge(text = "${r.severity} Risk", containerColor = color.copy(alpha = 0.15f), contentColor = color)
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(r.riskDescription, style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Mitigation Strategy: ${r.mitigationStrategy}", style = MaterialTheme.typography.bodySmall, color = CyanAccent)
                }
            }
        }
    }
}

@Composable
fun Level13View(leadership: Level13LeadershipCulture, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(13, "Leadership & Culture", "Governance, Human Capital & Operating Principles", Icons.Default.Groups)
        LensExplanationCard(lens, leadership.lensContent)

        val items = listOf(
            "Leadership Philosophy" to leadership.leadershipPhilosophy,
            "Decision-Making Style" to leadership.decisionMakingStyle,
            "Employee Culture" to leadership.employeeCulture,
            "Talent Strategy" to leadership.talentStrategy,
            "Governance Model" to leadership.governanceModel
        )

        items.forEach { (title, desc) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = ExecutiveGold)
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(desc, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
                }
            }
        }
    }
}

@Composable
fun Level14View(comparison: Level14IndustryComparison, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(14, "Industry Comparison", "Benchmarking Against Primary Rivals", Icons.Default.CompareArrows)
        LensExplanationCard(lens, comparison.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = Navy700),
            border = CardDefaults.outlinedCardBorder().copy(brush = androidx.compose.ui.graphics.SolidColor(ExecutiveGold))
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("WINNING DIFFERENTIATOR", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(comparison.winningDifferentiator, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp, color = TextPrimaryDark)
            }
        }

        comparison.benchmarks.forEach { bm ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(bm.factor.uppercase(), style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = CyanAccent)
                    Spacer(modifier = Modifier.height(6.dp))
                    Text("Target Company: ${bm.targetCompany}", style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.SemiBold, color = ExecutiveGold)
                    Text("${comparison.competitor1Name}: ${bm.competitor1}", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    Text("${comparison.competitor2Name}: ${bm.competitor2}", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
        }
    }
}

@Composable
fun Level15View(roadmap: Level15FutureRoadmap, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(15, "Future Growth Roadmap", "Three Horizons of Strategic Expansion", Icons.Default.TrendingUp)
        LensExplanationCard(lens, roadmap.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("MEGATREND ALIGNMENT", style = MaterialTheme.typography.labelMedium, color = ExecutiveGold, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(6.dp))
                Text(roadmap.megatrendAlignment, style = MaterialTheme.typography.bodySmall, lineHeight = 20.sp)
            }
        }

        roadmap.horizons.forEach { horizon ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(horizon.horizon, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = CyanAccent)
                    Text("Strategic Driver: ${horizon.strategicDriver}", style = MaterialTheme.typography.labelSmall, color = ExecutiveGold)
                    Spacer(modifier = Modifier.height(6.dp))
                    horizon.initiatives.forEach { init ->
                        Text("• $init", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun Level16View(mba: Level16MbaClassroom, lens: AnalysisLens) {
    Column(modifier = Modifier.padding(bottom = 24.dp)) {
        LevelHeaderCard(16, "MBA Classroom Mode", "Harvard Business School Case Method & Frameworks", Icons.Default.School)
        LensExplanationCard(lens, mba.lensContent)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("KEY MBA CONCEPTS", style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = ExecutiveGold)
                Spacer(modifier = Modifier.height(6.dp))
                mba.keyConcepts.forEach { Text("◆ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("STRATEGIC FRAMEWORKS APPLIED", style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = CyanAccent)
                Spacer(modifier = Modifier.height(6.dp))
                mba.frameworksUsed.forEach { Text("✦ $it", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp)) }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Text("CASE STUDY DISCUSSION QUESTIONS", style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PurpleStrategy)
                Spacer(modifier = Modifier.height(6.dp))
                mba.discussionQuestions.forEach { Text(it, style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 3.dp), lineHeight = 19.sp) }
            }
        }
    }
}
