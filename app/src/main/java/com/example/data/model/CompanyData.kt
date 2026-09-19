package com.example.data.model

// Analytical perspective lens
enum class AnalysisLens(val label: String, val subtitle: String) {
    BEGINNER("Beginner", "Plain English & Fundamental Concepts"),
    MANAGER("Business Manager", "Operations, Execution & P&L Impact"),
    MBA("MBA Professor", "Academic Frameworks & Strategic Models"),
    EXAMPLES("Real Examples", "Actual Conglomerate Cases & Field Data"),
    ACTIONABLE("Actionable Insights", "Executive Decisions & High-Impact Plays")
}

data class FiveLensContent(
    val beginner: String,
    val manager: String,
    val mba: String,
    val examples: String,
    val actionable: String
)

// LEVEL 1
data class Level1Overview(
    val companyHistory: String,
    val founderStory: String,
    val vision: String,
    val mission: String,
    val coreValues: List<String>,
    val majorMilestones: List<String>,
    val globalPresence: String,
    val revenueSources: String,
    val marketPosition: String,
    val executiveSummary: String,
    val lensContent: FiveLensContent
)

// LEVEL 2
data class EmpireNode(
    val name: String,
    val category: String,
    val description: String,
    val subVentures: List<String> = emptyList()
)

data class Level2EmpireMap(
    val holdingStructure: String,
    val businessUnits: List<EmpireNode>,
    val ecosystemSynergies: String,
    val lensContent: FiveLensContent
)

// LEVEL 3
data class ValueChainStage(
    val stageName: String,
    val activities: String,
    val costDrivers: String,
    val risks: String,
    val technologies: String,
    val competitiveAdvantage: String
)

data class Level3ValueChain(
    val stages: List<ValueChainStage>,
    val endToEndLeadTime: String,
    val verticalIntegrationDegree: String,
    val lensContent: FiveLensContent
)

// LEVEL 4
data class LogisticsElement(
    val name: String,
    val movementStrategy: String,
    val costStructure: String,
    val serviceStrategy: String,
    val customerImpact: String,
    val realWorldExample: String
)

data class Level4LogisticsEngine(
    val transportation: LogisticsElement,
    val warehousing: LogisticsElement,
    val inventoryManagement: LogisticsElement,
    val orderProcessing: LogisticsElement,
    val distributionNetwork: LogisticsElement,
    val lastMileDelivery: LogisticsElement,
    val lensContent: FiveLensContent
)

// LEVEL 5
enum class BcgCategory { CASH_COW, STAR_GROWTH, QUESTION_MARK_EMERGING, DECLINING_DOG }

data class PortfolioItem(
    val businessUnit: String,
    val products: String,
    val targetCustomer: String,
    val revenueImportance: String,
    val category: BcgCategory,
    val rationale: String
)

data class Level5ProductPortfolio(
    val items: List<PortfolioItem>,
    val portfolioHealthVerdict: String,
    val lensContent: FiveLensContent
)

// LEVEL 6
data class CustomerValueDimension(
    val dimension: String,
    val scoreOutOfTen: Int,
    val explanation: String,
    val customerSelectionReason: String
)

data class Level6CustomerValue(
    val dimensions: List<CustomerValueDimension>,
    val brandTrustRationale: String,
    val lensContent: FiveLensContent
)

// LEVEL 7
data class MoatElement(
    val pillar: String,
    val moatStrength: String, // e.g. "Widest", "High", "Medium"
    val barrierToEntry: String,
    val replicabilityChallenge: String
)

data class Level7CompetitiveAdvantage(
    val moats: List<MoatElement>,
    val ecosystemLockIn: String,
    val lensContent: FiveLensContent
)

// LEVEL 8
data class FinancialFlowStep(
    val stage: String, // Revenue Sources, Profit Drivers, Major Costs, Margins, Cash Flow
    val description: String,
    val keyMetrics: String,
    val moneyMovement: String
)

data class Level8FinancialEngine(
    val steps: List<FinancialFlowStep>,
    val howMoneyEnters: String,
    val howMoneyLeaves: String,
    val howProfitsAreCreated: String,
    val grossMarginAvg: String,
    val operatingMarginAvg: String,
    val freeCashFlowProfile: String,
    val lensContent: FiveLensContent
)

// LEVEL 9
data class OperationsPillar(
    val area: String,
    val practices: String,
    val operationalExcellenceMetric: String
)

data class Level9OperationsEngine(
    val pillars: List<OperationsPillar>,
    val overallExcellenceSummary: String,
    val lensContent: FiveLensContent
)

// LEVEL 10
data class TechPillar(
    val technology: String, // AI, Data Analytics, ERP, CRM, Automation, IoT, Cloud, Digital Platforms
    val implementation: String,
    val businessGrowthImpact: String
)

data class Level10DigitalTransformation(
    val pillars: List<TechPillar>,
    val digitalMaturityVerdict: String,
    val lensContent: FiveLensContent
)

// LEVEL 11
data class Level11Swot(
    val strengths: List<String>,
    val weaknesses: List<String>,
    val opportunities: List<String>,
    val threats: List<String>,
    val strategicImplications: String,
    val lensContent: FiveLensContent
)

// LEVEL 12
data class RiskCategory(
    val category: String, // Market, Supply, Technology, Regulatory, Financial, Reputation
    val riskDescription: String,
    val severity: String, // High, Moderate, Low
    val mitigationStrategy: String
)

data class Level12RiskManagement(
    val risks: List<RiskCategory>,
    val enterpriseRiskSummary: String,
    val lensContent: FiveLensContent
)

// LEVEL 13
data class Level13LeadershipCulture(
    val leadershipPhilosophy: String,
    val decisionMakingStyle: String,
    val employeeCulture: String,
    val talentStrategy: String,
    val governanceModel: String,
    val lensContent: FiveLensContent
)

// LEVEL 14
data class CompetitorBenchmark(
    val factor: String,
    val targetCompany: String,
    val competitor1: String,
    val competitor2: String
)

data class Level14IndustryComparison(
    val competitor1Name: String,
    val competitor2Name: String,
    val benchmarks: List<CompetitorBenchmark>,
    val winningDifferentiator: String,
    val lensContent: FiveLensContent
)

// LEVEL 15
data class GrowthHorizon(
    val horizon: String, // Short-Term (1-2 yrs), Medium-Term (3-5 yrs), Long-Term (5-10 yrs)
    val initiatives: List<String>,
    val strategicDriver: String
)

data class Level15FutureRoadmap(
    val horizons: List<GrowthHorizon>,
    val megatrendAlignment: String,
    val lensContent: FiveLensContent
)

// LEVEL 16
data class Level16MbaClassroom(
    val keyConcepts: List<String>,
    val frameworksUsed: List<String>,
    val strategicInsights: List<String>,
    val caseStudyLessons: List<String>,
    val discussionQuestions: List<String>,
    val lensContent: FiveLensContent
)

// LEVEL 17
data class Level17ConsultantMode(
    val whatIsWorkingWell: String,
    val whatIsInefficient: String,
    val whatShouldBeImproved: String,
    val whereAreHiddenOpportunities: String,
    val whatShouldManagementPrioritizeNext: String,
    val priorityScorecard: List<String>,
    val lensContent: FiveLensContent
)

// LEVEL 18
data class Level18CeoDashboard(
    val businessModel: String,
    val revenueEngine: String,
    val supplyChainSummary: String,
    val marketingLogisticsSummary: String,
    val competitiveAdvantageSummary: String,
    val primaryRisksSummary: String,
    val futureOpportunitiesSummary: String,
    val strategicPrioritiesList: List<String>,
    val executiveScoreRating: String
)

// Comprehensive Master Entity
data class CompanyBusinessOS(
    val companyName: String,
    val tickerOrCode: String,
    val industrySector: String,
    val foundedYear: String,
    val globalHeadquarters: String,
    val estimatedValuation: String,
    val executiveTagline: String,
    val level1: Level1Overview,
    val level2: Level2EmpireMap,
    val level3: Level3ValueChain,
    val level4: Level4LogisticsEngine,
    val level5: Level5ProductPortfolio,
    val level6: Level6CustomerValue,
    val level7: Level7CompetitiveAdvantage,
    val level8: Level8FinancialEngine,
    val level9: Level9OperationsEngine,
    val level10: Level10DigitalTransformation,
    val level11: Level11Swot,
    val level12: Level12RiskManagement,
    val level13: Level13LeadershipCulture,
    val level14: Level14IndustryComparison,
    val level15: Level15FutureRoadmap,
    val level16: Level16MbaClassroom,
    val level17: Level17ConsultantMode,
    val level18: Level18CeoDashboard
)
