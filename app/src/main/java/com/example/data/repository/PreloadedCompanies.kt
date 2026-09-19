package com.example.data.repository

import com.example.data.model.*

object PreloadedCompanies {

    fun getTataGroup(): CompanyBusinessOS {
        val genericLens = FiveLensContent(
            beginner = "Tata is like a massive family of 100+ businesses making everything from salt and tea to cars, steel, software, and aircraft.",
            manager = "Operations focus on operational synergies, group-wide procurement efficiencies, and decentralized brand custodian governance.",
            mba = "Multi-business conglomerate model balancing high-margin cash-generator IT services (TCS) with capital-intensive infrastructure and automotive turnarounds.",
            examples = "TCS contributes over 70% of Tata Sons' dividends; Tata Motors transformed Jaguar Land Rover and captured 70%+ Indian EV market share.",
            actionable = "Accelerate digital and clean-energy integration across Tata Digital (Tata Neu superapp) and Agratas gigafactory battery supply chains."
        )

        return CompanyBusinessOS(
            companyName = "Tata Group",
            tickerOrCode = "TATA (Conglomerate)",
            industrySector = "Multi-Industry Conglomerate",
            foundedYear = "1868 (Jamsetji Tata)",
            globalHeadquarters = "Bombay House, Mumbai, India",
            estimatedValuation = "$365B+ Aggregate Market Cap",
            executiveTagline = "Leadership with Trust across 100+ Operating Companies in 100+ Countries",
            level1 = Level1Overview(
                companyHistory = "Founded in 1868 as a private trading firm in Mumbai, growing into India's premier industrial and technological conglomerate spanning steel, power, automotive, hospitality, and IT services.",
                founderStory = "Jamsetji Nusserwanji Tata envisioned an independent industrial India, founding Empress Mills, envisioning Tata Steel (Jamshedpur), Indian Institute of Science, and the Taj Mahal Palace Hotel.",
                vision = "To improve the quality of life of the communities we serve globally through long-term stakeholder value creation based on Leadership with Trust.",
                mission = "Pioneering sustainable business practices while delivering exceptional quality in every sector from daily staples to aerospace.",
                coreValues = listOf("Integrity", "Responsibility", "Excellence", "Pioneering", "Unity"),
                majorMilestones = listOf(
                    "1868: Jamsetji Tata starts trading company",
                    "1907: Tata Iron & Steel (Tata Steel) established in Jamshedpur",
                    "1968: Tata Consultancy Services (TCS) founded",
                    "2008: Acquisition of Jaguar Land Rover (JLR)",
                    "2022: Reacquisition and integration of Air India",
                    "2024: Launch of semiconductor fab in Dholera & Agratas battery gigafactories"
                ),
                globalPresence = "Operations in 100+ countries across 6 continents, employing over 1,000,000 people globally.",
                revenueSources = "Information Technology (TCS ~60% profits), Automotive (Tata Motors/JLR), Steel (Tata Steel), Consumer/Retail (Titan, Trent, Tata Consumer), Aerospace & Defense.",
                marketPosition = "India's largest conglomerate and one of the world's most valuable corporate brands (#1 in India, top 50 globally).",
                executiveSummary = "Tata Group is an enduring global conglomerate characterized by philanthropic majority ownership (Tata Trusts holds ~66%), immense brand trust, and a diversified portfolio linking IT services cash generation with manufacturing scale.",
                lensContent = genericLens
            ),
            level2 = Level2EmpireMap(
                holdingStructure = "Tata Sons Private Limited (Principal investment holding company, 66% held by philanthropic Tata Trusts)",
                businessUnits = listOf(
                    EmpireNode("Technology & Software", "IT Services", "Tata Consultancy Services (TCS), Tata Elxsi, Tata Digital", listOf("Cloud Migration", "AI Enterprise", "Automotive Software")),
                    EmpireNode("Automotive & Mobility", "Heavy Industry", "Tata Motors, Jaguar Land Rover, Tata AutoComp", listOf("Commercial Vehicles", "Passenger EVs", "Luxury Mobility")),
                    EmpireNode("Steel & Materials", "Basic Industries", "Tata Steel India, Tata Steel Europe, Tata Advanced Materials", listOf("Automotive Steel", "Industrial Rebar", "Special Alloys")),
                    EmpireNode("Consumer & Retail", "FMCG / Lifestyle", "Titan Company, Trent (Zudio/Westside), Tata Consumer Products, Voltas", listOf("Jewelry (Tanishq)", "Fast Fashion", "Beverages & Salt")),
                    EmpireNode("Infrastructure & Energy", "Power & EPC", "Tata Power, Tata Projects, Tata Realty & Infrastructure", listOf("Solar/Renewables", "Transmission", "Smart Grids")),
                    EmpireNode("Aviation & Logistics", "Transportation", "Air India, Air India Express, Vistara (merged)", listOf("Domestic Flights", "International Long-Haul", "Cargo Cargo"))
                ),
                ecosystemSynergies = "TCS provides digital enterprise architectures for Tata Motors EVs; Tata Steel supplies body stampings; Tata Power installs EV charging infrastructure; Tata Neu bundles consumer loyalty points across Titan, Westside, Air India, and BigBasket.",
                lensContent = genericLens
            ),
            level3 = Level3ValueChain(
                stages = listOf(
                    ValueChainStage("1. Raw Materials", "Mining iron ore & coal in captive mines (Tata Steel), agricultural tea/coffee estates", "Commodity prices, mining royalties, environmental compliance", "Geopolitical supply shocks, mining quotas", "Digital geological mapping, mechanized open-cast extractors", "Captive raw material reserves with low extraction costs"),
                    ValueChainStage("2. Procurement", "Centralized group procurement councils, vendor tiering for auto components and electronics", "Supplier concentration, currency fluctuation", "Tier-2 vendor defaults, component shortages", "SAP Ariba, blockchain supplier verification", "Massive group buying power and vendor trust"),
                    ValueChainStage("3. Manufacturing", "Blast furnaces (Tata Steel), modular EV production lines (Tata Motors Pune/Sanand)", "Labor, energy, capital equipment depreciation", "Factory retooling downtime, defect rates", "Robotics, digital twins, IoT predictive maintenance", "High domestic manufacturing density & government PLI incentives"),
                    ValueChainStage("4. Quality Control", "Tata Business Excellence Model (TBEM), Six Sigma, ISO audits across all divisions", "Testing rigs, calibration equipment, audit staff", "Recall risks, brand equity damage from failure", "AI optical inspection, acoustic resonance testing", "Unrivaled brand reputation built on reliability"),
                    ValueChainStage("5. Warehousing", "Automated distribution centers, temperature-controlled tea/salt depots", "Real estate lease rates, material handling labor", "Inventory holding obsolescence, fire/spoilage", "WMS systems, automated guided vehicles (AGVs)", "Strategic nodal warehouses near major transit hubs"),
                    ValueChainStage("6. Transportation", "Rail rakes for bulk steel/coal, dedicated fleet logistics, container shipping", "Diesel fuel prices, freight tariff rates", "Transit bottlenecks, highway strikes, weather delays", "GPS telematics, dynamic route optimization", "Long-term rail freight contracts & volume discounts"),
                    ValueChainStage("7. Distribution", "Multi-tier distributor networks covering 10M+ kirana stores, dealer franchises", "Channel margins, distributor working capital", "Credit defaults, channel inventory stuffing", "DMS (Distribution Management Systems), B2B retailer apps", "Deepest rural & urban reach across the Indian subcontinent"),
                    ValueChainStage("8. Retail / E-comm", "Tanishq showrooms, Zudio stores, Croma electronics, BigBasket, Tata Neu app", "Prime high-street store leases, digital ad spend", "Retail footfall drops, high return rates online", "Omnichannel POS, unified CRM loyalty engines", "Strong direct consumer touchpoints & loyalty integration"),
                    ValueChainStage("9. Customer Experience", "After-sales automotive service centers, customer support, lifetime relationship care", "Warranty claims, technician training, call center ops", "Negative social media escalations, churn", "Conversational AI support, real-time vehicle telematics", "Generational customer trust and highest Net Promoter Scores")
                ),
                endToEndLeadTime = "From raw iron ore extraction to delivered passenger vehicle: 18-24 days; consumer goods: 48 hours.",
                verticalIntegrationDegree = "Very High (Mining -> Steel -> Automotive Components -> Vehicle Assembly -> Showroom -> Financing via Tata Capital).",
                lensContent = genericLens
            ),
            level4 = Level4LogisticsEngine(
                transportation = LogisticsElement("Intermodal Freight", "Rail-first for heavy metals, dedicated truck fleets for consumer goods", "38% fuel, 32% vehicle maintenance, 30% tolls/tariffs", "Scheduled line-hauls with regional feeder hubs", "99.2% on-time delivery across core industrial corridors", "Tata Steel moves 20M+ tons annually via Indian Railways rakes"),
                warehousing = LogisticsElement("Tiered Hub-and-Spoke", "Central mother hubs with regional fulfillment centers for BigBasket/Croma", "Storage density costs, HVAC climate control", "Same-day dispatch for high-velocity SKUs", "Reduced stockouts by 24% across retail chains", "Automated dark stores for 15-30 minute grocery delivery in metros"),
                inventoryManagement = LogisticsElement("Just-In-Time (JIT) & VMI", "Vendor-Managed Inventory for assembly lines; safety buffers for critical chips", "Holding costs, working capital financing", "Demand-driven pull replenishment via Kanban", "Minimized factory floor inventory to 3.5 days of run rate", "Tata Motors Pune plant connects live ERP with 150 component vendors"),
                orderProcessing = LogisticsElement("Omnichannel Unified Order Hub", "Real-time synchronization between Tata Neu, Croma, and brick-and-mortar stores", "Cloud compute, API latency handling", "Sub-second order confirmation and automated batch picking", "Zero double-selling during festive flash sales", "Integrated order routing selects nearest physical store for fulfillment"),
                distributionNetwork = LogisticsElement("Deep Bharat Distribution", "Tier 1 to Tier 6 coverage linking urban malls to remote village stores", "Distributor credit incentives, freight rebates", "Weekly distributor visits and replenishment guarantees", "Ubiquitous product availability for Tata Salt and Tata Tea", "Over 2.5 million direct retail distribution touchpoints in India"),
                lastMileDelivery = LogisticsElement("Owned & Partner Last-Mile", "Electric 2-wheeler fleets for BigBasket, authorized dealer delivery for vehicles", "Labor cost per drop, failed delivery re-attempts", "Customer choice delivery time windows with SMS tracking", "Consistently high customer CSAT (>92%)", "Fleet electrification with Tata Ace EV reducing last-mile fuel cost by 60%"),
                lensContent = genericLens
            ),
            level5 = Level5ProductPortfolio(
                items = listOf(
                    PortfolioItem("Tata Consultancy Services (TCS)", "Global Enterprise IT, Cloud, AI Solutions", "Fortune 500 Enterprises worldwide", "Highest (~70% group dividends)", BcgCategory.CASH_COW, "Generates massive free cash flow funding group capital projects"),
                    PortfolioItem("Tata Motors - Commercial Vehicles", "Buses, heavy trucks, light commercial vehicles", "Logistics fleets, infrastructure contractors", "High", BcgCategory.CASH_COW, "Dominant domestic market share (~45%) with stable replacement cycles"),
                    PortfolioItem("Tata Motors - Passenger Electric Vehicles", "Nexon EV, Punch EV, Curvv EV, Tiago EV", "Eco-conscious middle class, fleet operators", "Very High Growth", BcgCategory.STAR_GROWTH, "Holds 70%+ Indian EV market share with massive growth trajectory"),
                    PortfolioItem("Trent Limited (Zudio & Westside)", "Value fast-fashion apparel & footwear", "Gen Z, young professionals, Tier 2/3 consumers", "High Growth", BcgCategory.STAR_GROWTH, "Explosive retail store expansion with rapid inventory turns"),
                    PortfolioItem("Tata Semiconductor (Dholera & Assam)", "Chips packaging (OSAT), logic foundry", "Global auto, industrial, mobile device makers", "Emerging (Long-Term)", BcgCategory.QUESTION_MARK_EMERGING, "Massive capex investment ($14B+) entering sovereign strategic chip manufacturing"),
                    PortfolioItem("Tata Neu Superapp", "Unified shopping, travel, finance digital hub", "Indian digital consumers across Tata brands", "Moderate", BcgCategory.QUESTION_MARK_EMERGING, "High customer acquisition costs requiring ongoing UX optimization and cross-sell traction")
                ),
                portfolioHealthVerdict = "Excellent balance: TCS serves as an unmatched Cash Cow engine funding capital-intensive high-growth Stars (EVs, Retail) and strategic bets (Semiconductors).",
                lensContent = genericLens
            ),
            level6 = Level6CustomerValue(
                dimensions = listOf(
                    CustomerValueDimension("Functional Value", 9, "Engineered durability, 5-star safety ratings (Tata Motors), reliable enterprise IT SLA (TCS)", "Customers trust products to work reliably under demanding conditions"),
                    CustomerValueDimension("Emotional Value", 10, "Patriotic pride, nation-building heritage, ethical stewardship", "Purchasing Tata is perceived as supporting Indian prosperity and community welfare"),
                    CustomerValueDimension("Social Value", 8, "Conspicuous sustainability through EV adoption, premium luxury with JLR & Taj Hotels", "Association with prestige and responsible environmental citizenship"),
                    CustomerValueDimension("Economic Value", 9, "Value-for-money pricing (Zudio $5-$15 clothing, affordable EVs, competitive IT pricing)", "Highest utility and longevity per dollar spent"),
                    CustomerValueDimension("Convenience Value", 8, "Omnichannel access, widespread dealership networks, integrated loyalty in Tata Neu", "Easy access to service centers and everyday consumer products across India"),
                    CustomerValueDimension("Brand Trust", 10, "150+ years of uncompromised business ethics and zero corporate bribery reputation", "In times of uncertainty, consumers default to Tata as the safest, most moral choice")
                ),
                brandTrustRationale = "Over 66% of Tata Sons' profits go to charitable trusts funding hospitals, education, and rural development, elevating Tata from a mere corporation to a national trust institution.",
                lensContent = genericLens
            ),
            level7 = Level7CompetitiveAdvantage(
                moats = listOf(
                    MoatElement("Brand Trust & Legacy", "Widest", "150+ years of non-negotiable integrity that cannot be purchased with marketing dollars", "Competitors cannot replicate century-old social contract and national reverence"),
                    MoatElement("TCS Financial Engine", "Widest", "Debt-free $25B+ revenue IT powerhouse with 25%+ operating margins", "Provides patient, low-cost internal capital buffer that purely leveraged rivals lack"),
                    MoatElement("Ecosystem Cross-Synergy", "High", "Integrated value chain from power generation to battery cells to electric vehicles", "Standalone auto or energy competitors must buy components at market markups"),
                    MoatElement("Distribution Reach", "High", "Centuries of channel relationships reaching millions of retail outlets across India", "New entrants face high distribution gatekeeper margins and fragmented retail"),
                    MoatElement("Government & Strategic Alignment", "High", "Trusted partner for critical national infrastructure, defense, aerospace, and semiconductors", "Sovereign confidence earned through unwavering public alignment")
                ),
                ecosystemLockIn = "A consumer can drive a Tata EV charged by Tata Power, wear Titan jewelry and Zudio apparel, stay at Taj Hotels, fly Air India, and purchase groceries on BigBasket, all earning Tata Neu reward coins.",
                lensContent = genericLens
            ),
            level8 = Level8FinancialEngine(
                steps = listOf(
                    FinancialFlowStep("1. Revenue Sources", "TCS ($29B), Tata Motors ($52B), Tata Steel ($28B), Titan & Consumer ($8B)", "Consolidated revenue ~$165B+ USD", "Global multi-currency inflows (USD/EUR for TCS & JLR; INR for domestic retail & steel)"),
                    FinancialFlowStep("2. Profit Drivers", "High software billing utilization (TCS), premium luxury vehicle margins (JLR Defender), jewelry markups (Tanishq)", "EBITDA margin: TCS ~26%, JLR ~16%, Titan ~11%", "Product mix shifts toward premium variants and software service contracts"),
                    FinancialFlowStep("3. Major Costs", "Employee compensation (TCS: 600K+ engineers), raw materials (steel scrap, battery cells), logistics, and manufacturing capex", "TCS employee costs ~56% of revenue; Auto COGS ~65%", "Inflationary wage pressure, commodity price swings, battery raw material spikes"),
                    FinancialFlowStep("4. Operating Margins", "Group consolidated operating margin ranges from 12% to 18% depending on commodity cycles", "TCS delivers superior steady margins softening volatile steel and auto swings", "Disciplined cost restructuring and modular platform sharing across JLR and Tata Motors"),
                    FinancialFlowStep("5. Free Cash Flow & Dividends", "Tata Sons receives ~$4B+ annual dividends from operating firms, reinvesting into clean energy, Air India, and semiconductors", "Net debt drastically reduced across Tata Motors & Tata Steel", "Strategic capital allocation cycle powering the next decade of deep tech")
                ),
                howMoneyEnters = "Money enters through global corporate IT contracts, auto showroom sales, retail consumer purchases, steel industrial shipments, and airline bookings.",
                howMoneyLeaves = "Money leaves via tech talent salaries, capital expenditures (factories, gigafactories, aircraft orders), raw material procurement, and tax payments.",
                howProfitsAreCreated = "Profits are generated by combining software IP leverage (TCS) with scale manufacturing efficiencies, premium brand pricing power, and internal supply chain synergies.",
                grossMarginAvg = "38% - 45% (blended across software, consumer goods, and heavy materials)",
                operatingMarginAvg = "14.5% consolidated",
                freeCashFlowProfile = "Robust $10B+ annual operating cash flow primarily anchored by TCS and recovering automotive free cash flow.",
                lensContent = genericLens
            ),
            level9 = Level9OperationsEngine(
                pillars = listOf(
                    OperationsPillar("Manufacturing", "World-class Lean manufacturing, modular assembly architectures, and smart robotics in Pune, Jamshedpur, and Solihull", "99.4% first-time quality pass rate"),
                    OperationsPillar("Procurement & Vendor Network", "Centralized strategic supplier alliances, vendor tiering, and joint-venture localization of critical electronics", "15% lower procurement spend via group bundling"),
                    OperationsPillar("Logistics & Network Design", "Integrated multimodal transit network linking captive mines, manufacturing plants, and regional distribution centers", "Average inventory days reduced by 18%"),
                    OperationsPillar("Technology & Automation", "Extensive deployment of SCADA, automated visual inspection, digital twins, and industrial IoT sensors", "Over 1,200 industrial robots active in automotive assembly"),
                    OperationsPillar("Quality Governance", "The proprietary Tata Business Excellence Model (TBEM) based on the Malcolm Baldrige framework applied across all group entities", "Annual TBEM assessments score operational rigor from 1 to 1000")
                ),
                overallExcellenceSummary = "Tata's operational philosophy merges Japanese Lean principles with Indian frugal engineering (Jugaad with institutional discipline) and institutionalized TBEM quality governance.",
                lensContent = genericLens
            ),
            level10 = Level10DigitalTransformation(
                pillars = listOf(
                    TechPillar("Artificial Intelligence", "TCS AI WisdomNext platform, predictive vehicle maintenance in Tata Motors, automated claims processing", "Generates $1B+ AI pipeline for TCS and optimizes vehicle reliability"),
                    TechPillar("Data Analytics & Big Data", "Unified customer graph across 120M+ users on Tata Neu to deliver hyper-personalized cross-selling", "Increased cross-brand transaction conversion by 22%"),
                    TechPillar("ERP & Supply Chain Tech", "Standardized SAP S/4HANA enterprise backbones with cloud-native supplier portals", "Real-time visibility across global multi-tier supply networks"),
                    TechPillar("Cloud & Hybrid Infrastructure", "Large-scale migration of legacy workloads to AWS, Azure, and Google Cloud managed by TCS", "35% reduction in enterprise IT infrastructure operating costs"),
                    TechPillar("IoT & Connected Mobility", "iRA connected vehicle platform in 500,000+ on-road vehicles streaming live telematics", "Enables over-the-air (OTA) updates and dynamic fleet management")
                ),
                digitalMaturityVerdict = "Advanced across B2B enterprise tech; undergoing rapid acceleration in consumer B2C digital integration via the Neu superapp.",
                lensContent = genericLens
            ),
            level11 = Level11Swot(
                strengths = listOf(
                    "Unmatched institutional brand trust and reputation for ethical business conduct",
                    "Massive free cash flow engine in TCS generating stable dividends regardless of economic cycles",
                    "Dominant market leadership in Indian Electric Vehicles (~70% share) and Commercial Vehicles",
                    "Deep vertical integration spanning basic raw materials to consumer retail endpoints",
                    "Philanthropic ownership model shielding leadership from short-term quarterly market hysteria"
                ),
                weaknesses = listOf(
                    "High capital intensity and debt overhang from past cyclical acquisitions (Steel Europe, Air India turnaround)",
                    "Sub-optimal consumer experience and initial friction in the Tata Neu superapp integration",
                    "Complexity of managing 100+ separate operating companies with independent boards and cultural silos",
                    "Historical reliance on TCS for the lion's share of holding company dividend inflows"
                ),
                opportunities = listOf(
                    "Sovereign semiconductor fabrication and packaging (OSAT) capturing global chip supply diversification",
                    "Agratas global battery gigafactories supplying in-house EVs and external global auto OEMs",
                    "Full operational integration and premium fleet revival of newly privatized Air India",
                    "Rapid retail expansion of Trent's value fashion powerhouse Zudio across Tier 2, 3, and 4 India"
                ),
                threats = listOf(
                    "Aggressive competition from agile domestic rivals (Reliance, Adani) in retail, telecom, and green energy",
                    "Geopolitical trade tariffs and carbon border adjustment mechanisms impacting European steel operations",
                    "Rapid technological obsolescence in legacy IT services driven by generative AI code automation",
                    "Fluctuations in global commodity prices (steel, coking coal, lithium, and rare earth minerals)"
                ),
                strategicImplications = "Tata must leverage TCS cash flows to aggressively capitalize on the energy transition (EVs, batteries) and sovereign high-tech (semiconductors) while completing the Air India turnaround.",
                lensContent = genericLens
            ),
            level12 = Level12RiskManagement(
                risks = listOf(
                    RiskCategory("Market Risk", "Global recession dampening enterprise IT consulting spend and luxury car demand at JLR", "High", "Diversify client base into healthcare and public sector; expand affordable mass-market EV line"),
                    RiskCategory("Supply Risk", "Dependence on Chinese suppliers for lithium-ion battery cells and critical electronic components", "High", "Invest in Agratas domestic gigafactories and domestic semiconductor fabrication in Gujarat"),
                    RiskCategory("Technology Risk", "Generative AI commoditizing standard software application maintenance and testing services", "Moderate", "Upskill 500K+ TCS engineers in generative AI and build proprietary domain-specific enterprise agents"),
                    RiskCategory("Regulatory Risk", "Stringent carbon emissions regulations and Net Zero mandates across steel and automotive plants", "Moderate", "Transition Tata Steel to green hydrogen and electric arc furnaces; invest $2B in renewable captive power"),
                    RiskCategory("Financial Risk", "Foreign currency volatility impacting multi-billion dollar export revenues and aircraft purchase commitments", "Moderate", "Comprehensive currency hedging desks and multi-currency revenue balancing"),
                    RiskCategory("Reputation Risk", "Corporate governance disputes or ethical lapses compromising the sacred Tata brand equity", "Low", "Rigorous Tata Code of Conduct (TCOC) compliance audits and independent board oversight")
                ),
                enterpriseRiskSummary = "Enterprise risk management is anchored by the holding company's conservative debt-to-equity policies and non-negotiable adherence to the Tata Code of Conduct.",
                lensContent = genericLens
            ),
            level13 = Level13LeadershipCulture(
                leadershipPhilosophy = "Trustee Leadership: Leaders view themselves as custodians of public and shareholder trust rather than owners of capital.",
                decisionMakingStyle = "Consensus-driven, long-term horizon planning with decentralized operational autonomy for individual company CEOs.",
                employeeCulture = "Pioneering spirit, institutional loyalty, high employee retention, and deep emphasis on community service and volunteering.",
                talentStrategy = "TAS (Tata Administrative Services) flagship leadership program cultivating general managers rotated across diverse industries.",
                governanceModel = "Two-tier governance: Tata Sons sets group strategic vision and brand guidelines, while independent public company boards govern operational execution.",
                lensContent = genericLens
            ),
            level14 = Level14IndustryComparison(
                competitor1Name = "Reliance Industries",
                competitor2Name = "Adani Group",
                benchmarks = listOf(
                    CompetitorBenchmark("Core Strategic Strength", "Diverse IT cash cow (TCS) + Trusted consumer brands", "Dominant telecom (Jio) + massive refining cash flows", "Monopoly infrastructure (ports, airports, power transmission)"),
                    CompetitorBenchmark("Brand Perception", "Highest public trust, ethical integrity, safety", "Aggressive scale, disruptive digital & retail pricing", "Rapid capital-driven infrastructure execution"),
                    CompetitorBenchmark("Capital Allocation", "Patient, equity-funded, conservative leverage", "Massive targeted capex funded by cash reserves & FDI", "Aggressive debt-leveraged infrastructure expansion"),
                    CompetitorBenchmark("Global Footprint", "Deep international footprint (UK, US, Europe, Asia)", "Primarily domestic India focused with strategic global tech partners", "Expanding overseas port and mining logistics (Australia, Sri Lanka)"),
                    CompetitorBenchmark("Tech Dominance", "Leader in global enterprise software & automotive IT", "Leader in consumer mobile internet, 5G, and B2C digital", "Enterprise digital utility tracking & logistics software")
                ),
                winningDifferentiator = "Tata's unique moat is generational brand trust and the software engineering cash engine (TCS) that funds non-debt-burdened capital expansion.",
                lensContent = genericLens
            ),
            level15 = Level15FutureRoadmap(
                horizons = listOf(
                    GrowthHorizon("Short-Term (1-2 Years)", listOf("Consolidate Air India & Vistara fleet operations", "Scale Zudio store count past 650+ locations", "Launch Tata Curvv & Harrier EV product lines"), "Retail velocity & aviation route stabilization"),
                    GrowthHorizon("Medium-Term (3-5 Years)", listOf("Commission $11B Dholera semiconductor fabrication facility", "Commence commercial cell production at Agratas UK/India gigafactories", "Achieve Net Zero debt in automotive business"), "High-tech manufacturing & clean mobility vertical integration"),
                    GrowthHorizon("Long-Term (5-10 Years)", listOf("Pioneer hydrogen fuel cell commercial trucks", "Establish Tata as a top-5 global outsourced semiconductor foundry partner", "Expand Air India into a premier global hub carrier rivaling Gulf airlines"), "Sovereign deep-tech supremacy & international luxury dominance")
                ),
                megatrendAlignment = "Perfect strategic alignment with the three biggest macro shifts of the century: Energy Transition (EVs/Renewables), Supply Chain Reshoring (Semiconductors), and Digital Intelligence (AI/Cloud).",
                lensContent = genericLens
            ),
            level16 = Level16MbaClassroom(
                keyConcepts = listOf(
                    "Conglomerate Discount vs. Conglomerate Premium in Emerging Markets",
                    "Internal Capital Markets: How TCS subsidizes high-risk turnarounds (JLR, Air India)",
                    "The Triple Bottom Line & Philanthropic Trust Ownership Structures",
                    "Dynamic Capabilities in Managing Multi-Industry Portfolios",
                    "Horizontal vs. Vertical Integration in the EV Ecosystem"
                ),
                frameworksUsed = listOf(
                    "BCG Growth-Share Matrix (TCS as Cash Cow; EVs as Stars)",
                    "Porter's Value Chain & Shared Services Synergies",
                    "Resource-Based View (RBV): The Tata Brand as an Inimitable Asset",
                    "Ansoff Matrix: Diversification into Semiconductors & Clean Energy",
                    "McKinsey 7S Framework applied to Tata Sons' decentralized governance"
                ),
                strategicInsights = listOf(
                    "Conglomerates succeed in developing nations when institutional voids (lack of deep capital markets, trusted arbitration) make internal trust networks more efficient than external markets.",
                    "Cross-subsidization is a lethal competitive weapon: Tata Motors survived the 2008 Lehman crisis and JLR acquisition because Tata Sons had continuous non-cyclical dividend inflows from TCS."
                ),
                caseStudyLessons = listOf(
                    "The JLR Turnaround: How Tata preserved British engineering autonomy while ruthlessly cutting overhead and targeting Chinese luxury consumers.",
                    "The Tata Nano Paradox: How brilliant engineering failed because marketing a car as 'cheap' destroyed consumer aspirational value."
                ),
                discussionQuestions = listOf(
                    "1. Is the Tata Neu superapp strategy fundamentally flawed given that independent apps (Amazon, Zomato, Myntra) offer superior vertical specialization?",
                    "2. As TCS margins face structural pressure from GenAI automation, can the group sustain multi-billion-dollar semiconductor and gigafactory investments without taking on dangerous leverage?",
                    "3. How should Tata balance the historical cultural autonomy of its individual companies with the modern imperative for unified customer data and cross-selling?"
                ),
                lensContent = genericLens
            ),
            level17 = Level17ConsultantMode(
                whatIsWorkingWell = "TCS remains an extraordinary cash engine generating ~$6B+ operating profit; Tata Motors passenger EV division has created a formidable 70% domestic market share moat; Trent's Zudio is India's most efficient value fashion retailer.",
                whatIsInefficient = "Tata Neu superapp suffers from high user drop-off and clunky multi-brand checkout UX; European steel operations continue to face regulatory carbon penalties and high energy input costs.",
                whatShouldBeImproved = "Streamline consumer digital customer journeys into a single unified cart; accelerate divestment or joint-venturing of sub-scale legacy industrial assets; expedite Air India cabin refurbishment to restore premium yield.",
                whereAreHiddenOpportunities = "Monetize Agratas battery cells to non-Tata automakers globally; bundle TCS enterprise AI agents with Tata industrial machinery for global export; cross-sell Titan jewelry and financial services to Air India premium flyers.",
                whatShouldManagementPrioritizeNext = "1. Execute the semiconductor foundry timeline without cost overruns; 2. Complete the Air India fleet modernization; 3. Re-architect Tata Neu around instant commerce and localized loyalty.",
                priorityScorecard = listOf(
                    "Priority 1: Semiconductor Execution (Assam & Dholera)",
                    "Priority 2: Tata Motors EV Ecosystem & Battery Localization",
                    "Priority 3: Air India Fleet & Service Transformation",
                    "Priority 4: Digital Neu Superapp Re-platforming",
                    "Priority 5: Green Steel Transition in Europe & India"
                ),
                lensContent = genericLens
            ),
            level18 = Level18CeoDashboard(
                businessModel = "Diversified industrial-technological conglomerate anchored by philanthropic trust ownership, generating patient capital via enterprise IT to fund capital-intensive national infrastructure and consumer ecosystems.",
                revenueEngine = "Consolidated $165B+ across TCS (IT services), Tata Motors (commercial & passenger vehicles), Tata Steel, and high-growth lifestyle retail (Titan, Trent).",
                supplyChainSummary = "Captive mining reserves, localized automotive supplier clusters, 100+ global manufacturing plants, and deep intermodal rail logistics.",
                marketingLogisticsSummary = "Tiered hub-and-spoke warehousing serving 2.5M+ retail outlets, complemented by emerging dark-store urban rapid fulfillment.",
                competitiveAdvantageSummary = "Unmatched 150-year brand trust, internal capital markets subsidized by TCS free cash flow, and synchronized cross-industry EV/renewable energy ecosystems.",
                primaryRisksSummary = "Global IT spending slowdown, semiconductor fabrication execution risk, and raw material commodity volatility.",
                futureOpportunitiesSummary = "India's clean energy transition, domestic semiconductor leadership, and luxury air travel capture through the revitalized Air India.",
                strategicPrioritiesList = listOf(
                    "Protect and grow TCS enterprise AI consulting market share",
                    "Scale domestic battery manufacturing (Agratas) to lower EV price points",
                    "Achieve world-class on-time performance and passenger NPS for Air India",
                    "Expand Trent's retail footprint into 200+ new secondary cities"
                ),
                executiveScoreRating = "Overall Conglomerate Health: 9.4 / 10 (AAA Investment Grade Stability)"
            )
        )
    }

    fun getAllCompanies(): List<CompanyBusinessOS> {
        return listOf(
            getTataGroup(),
            getAppleEcosystem(),
            getRelianceEcosystem(),
            getAmazonEcosystem(),
            getTeslaEcosystem(),
            getSamsungEcosystem()
        )
    }

    fun getAppleEcosystem(): CompanyBusinessOS {
        val appleLens = FiveLensContent(
            beginner = "Apple designs elegant consumer electronics, writes the software that runs them, and charges for digital services inside a closed garden.",
            manager = "Operations masterclass: zero owned factories, relentless supply chain vendor discipline, and industry-leading 44%+ gross margins.",
            mba = "Two-sided platform ecosystem with high switching costs, network effects, and aggressive vertical integration of proprietary silicon architecture.",
            examples = "Apple Silicon (M-series) severed dependency on Intel, cutting unit costs while setting industry benchmarks in battery performance.",
            actionable = "Expand high-margin Services revenue (Apple Pay, iCloud, Ads) to offset hardware replacement cycle elongation."
        )

        return CompanyBusinessOS(
            companyName = "Apple Inc.",
            tickerOrCode = "AAPL (NASDAQ)",
            industrySector = "Consumer Electronics, Software & Digital Platforms",
            foundedYear = "1976 (Steve Jobs, Steve Wozniak, Ronald Wayne)",
            globalHeadquarters = "One Apple Park Way, Cupertino, CA, USA",
            estimatedValuation = "$3.4 Trillion+ Market Cap",
            executiveTagline = "Think Different: The World's Most Valuable Hardware, Software & Services Ecosystem",
            level1 = Level1Overview(
                companyHistory = "From a Cupertino garage building the Apple I computer to the world's most valuable public company revolutionizing personal computing, digital music, smartphones, tablets, and wearables.",
                founderStory = "Steve Jobs and Steve Wozniak fused visionary typography, industrial aesthetics, and accessible computing, transforming consumer desire into cultural icons.",
                vision = "To bring the best personal computing products and support to consumers around the world.",
                mission = "Designing products that enrich people's daily lives through seamless integration of hardware, software, and services.",
                coreValues = listOf("Accessibility", "Education", "Environment", "Inclusion & Diversity", "Privacy", "Supplier Responsibility"),
                majorMilestones = listOf(
                    "1984: Macintosh introduced with graphical user interface",
                    "2001: iPod launches, transforming the music industry",
                    "2007: Steve Jobs unveils the iPhone",
                    "2010: iPad creates the modern tablet category",
                    "2020: Transition from Intel to Apple Silicon (M1 Chip)",
                    "2024: Apple Vision Pro and Apple Intelligence platform"
                ),
                globalPresence = "Retail stores in 26 countries, authorized resellers in 175+ nations, over 2 billion active devices worldwide.",
                revenueSources = "iPhone (~50%), Services (App Store, iCloud, Pay ~25%), Wearables/Home (~10%), Mac (~8%), iPad (~7%).",
                marketPosition = "#1 most valuable consumer technology brand; captures over 80% of global smartphone industry profits despite ~20% unit share.",
                executiveSummary = "Apple operates an unrivaled high-margin consumer hardware, operating system, and recurring digital services ecosystem held together by deep customer lock-in and world-class supply chain orchestration.",
                lensContent = appleLens
            ),
            level2 = Level2EmpireMap(
                holdingStructure = "Single integrated corporate parent with unified functional organization (Hardware, Software, Services, Design, Operations)",
                businessUnits = listOf(
                    EmpireNode("iPhone & Mobile", "Flagship Hardware", "iPhone Pro, iPhone standard line, iOS platform", listOf("A-Series Bionic Silicon", "Camera Systems", "FaceID")),
                    EmpireNode("Mac & Personal Computing", "Workstations & Laptops", "MacBook Pro, MacBook Air, Mac Studio, macOS", listOf("M-Series Silicon", "Retina Displays", "Pro Workflow Apps")),
                    EmpireNode("Wearables, Home & Accessories", "Lifestyle Ecosystem", "Apple Watch, AirPods, HomePod, AirTags", listOf("Health Sensors", "Spatial Audio", "Find My Network")),
                    EmpireNode("iPad & Creative Devices", "Tablets", "iPad Pro, iPad Air, iPad Mini, iPadOS", listOf("Apple Pencil", "Magic Keyboard", "Procreate Ecosystem")),
                    EmpireNode("Services & Digital Content", "High-Margin Software", "App Store, Apple Music, iCloud+, Apple Pay, Apple TV+", listOf("Subscription Services", "Fintech (Apple Card)", "Advertising")),
                    EmpireNode("Future Ventures & Spatial", "Emerging Tech", "Apple Vision Pro, Apple Intelligence, Autonomous Robotics", listOf("Spatial Computing", "On-Device Neural Engines", "Private Cloud Compute"))
                ),
                ecosystemSynergies = "AirPods pair instantly with iPhone; Mac universal clipboard shares text with iPad; Apple Watch unlocks MacBook; Apple Pay processes App Store subscriptions; all purchases sync seamlessly via iCloud.",
                lensContent = appleLens
            ),
            level3 = Level3ValueChain(
                stages = listOf(
                    ValueChainStage("1. Raw Materials", "Procuring 100% recycled aluminum, gold, cobalt, tungsten, and rare earth elements", "Commodity market rates, ethical sourcing audits", "Artisanal mining labor violations, mineral scarcity", "Full material traceability software, closed-loop recycling robots (Daisy/Dave)", "Pioneering green supply chains and zero carbon commitments"),
                    ValueChainStage("2. Procurement", "Securing exclusive TSMC leading-edge semiconductor capacity (3nm/2nm), OLED panels from Samsung/LG", "Advanced wafer allocation costs, prepayments to lock tool capacity", "Geopolitical tensions in Taiwan Strait", "Custom tooling design, dedicated vendor capex financing", "Massive cash prepayments securing multi-year monopoly on smallest chip nodes"),
                    ValueChainStage("3. Manufacturing", "Contract assembly via Foxconn, Pegatron, Luxshare, and Wistron across China, India, and Vietnam", "Labor costs, assembly line calibration, yield rates", "Factory shutdowns, labor unrest, trade tariffs", "Custom automated testing rigs, precision CNC machining", "Unmatched production scalability producing 1M+ iPhones per day at peak"),
                    ValueChainStage("4. Quality Control", "Tolerances measured in microns; automated optical and acoustic defect scanners", "Sensor calibration equipment, rejection costs", "Early production yield falloff, thermal anomalies", "Machine vision AI, CT scan inspections on assembly lines", "Lowest hardware failure rates and highest secondary market resale values"),
                    ValueChainStage("5. Warehousing", "Centralized bonded warehouses in Zhengzhou, regional distribution centers in US and Europe", "Cold chain logistics for precision parts, airport hub leases", "Inventory shrinkage, customs clearance delays", "Real-time global inventory synchronization", "Ultra-lean inventory holding less than 6 days of sales"),
                    ValueChainStage("6. Transportation", "Chartering entire commercial cargo fleets (Boeing 777s) from factory directly to regional markets", "Air freight spot rates, jet fuel surcharges", "Airspace closures, customs bottlenecks during product launches", "Dynamic freight booking algorithms, pallet weight optimization", "Total control of air cargo capacity locking out rivals during launch quarters"),
                    ValueChainStage("7. Distribution", "Direct to consumer online, 530+ flagship Apple Stores, telecom carriers (AT&T, Verizon), authorized resellers", "Channel commissions, carrier subsidies", "Partner discount violations, grey market diversion", "Direct electronic carrier integration, serialized tracking", "Global retail presence with the highest sales per square foot in the industry"),
                    ValueChainStage("8. Retail / E-comm", "Iconic architectural glass cube stores, Apple Store app with personalized engraving and trade-in", "Prime real estate leases, specialist staff compensation", "Store burglary risks, declining retail foot traffic", "Touch-free EasyPay, augmented reality product previews", "Unmatched experiential customer service (Genius Bar)"),
                    ValueChainStage("9. Customer Lifecycle", "AppleCare+ warranties, iOS annual software updates supporting 6-year-old devices, trade-in upgrades", "Repair component costs, warranty claim reserves", "Right-to-repair regulatory pushback, battery degradation issues", "Automated remote diagnostics, self-service repair programs", "Highest customer retention rate (~93%) in consumer tech")
                ),
                endToEndLeadTime = "Silicon fabrication to finished consumer unboxing: ~90 days; finished assembly to doorstep: 48-72 hours via air express.",
                verticalIntegrationDegree = "Extreme in Intellectual Property & Architecture (Silicon, OS, Hardware, Services); Asset-Light in physical manufacturing (outsourced to Tier 1 partners).",
                lensContent = appleLens
            ),
            level4 = Level4LogisticsEngine(
                transportation = LogisticsElement("Global Air Freight Dominance", "Bypasses ocean shipping for finished consumer devices; finished phones fly from Asian factories directly to target countries", "55% air cargo fees, 25% domestic trucking, 20% security escort logistics", "Chartering dedicated planes to ensure simultaneous global launch day availability", "Millions of devices delivered within 72 hours of customer order", "Apple routinely books out entire cargo flights during September iPhone launches"),
                warehousing = LogisticsElement("Virtual Inventory & Zero Bloat", "Near-zero warehouse holding; goods move continuously through cross-docking facilities", "Minimal storage footprint, high security protocols", "Demand signals pull products straight from factory to FedEx/UPS hubs", "Inventory turnover ratio of ~38x per year", "Products spend less time in warehouses than milk in grocery stores"),
                inventoryManagement = LogisticsElement("Continuous Flow ERP", "Tim Cook's signature operations model: treat inventory like dairy that spoils quickly", "Working capital efficiency, immediate defect containment", "Supplier-managed inventory with JIT assembly line feeding", "Drastically reduced obsolescence write-downs to near zero", "Components arrive at Foxconn plants mere hours before assembly"),
                orderProcessing = LogisticsElement("Instant Digital Configuration", "Laser engraving, custom RAM/SSD specs configured on-the-fly during assembly", "Automated robotic engraving systems, real-time credit check", "Orders routed directly to assembly lines for customized builds", "Custom build-to-order MacBooks shipped in under 5 business days", "Direct visibility for consumers with real-time flight tracking numbers"),
                distributionNetwork = LogisticsElement("Tri-Channel Matrix", "Apple Direct (Online & Retail Stores), Carrier Partners (Telefónica, SoftBank), Authorized Resellers", "Carrier marketing co-op funds, retail partner margins", "Tight price enforcement ensuring no unauthorized discounting", "Universal pricing integrity worldwide", "Carriers provide phone upgrade installments subsidizing upfront hardware purchase"),
                lastMileDelivery = LogisticsElement("Express Courier & In-Store Pickup", "Partnerships with UPS, DHL, FedEx, plus 2-hour courier delivery from local Apple Stores", "Premium courier surcharges, signature-required delivery", "Same-day pickup locker integration inside retail stores", "Delightful unboxing experience with zero friction return policy", "Customer can buy online and pick up at local store within 60 minutes"),
                lensContent = appleLens
            ),
            level5 = Level5ProductPortfolio(
                items = listOf(
                    PortfolioItem("iPhone", "Flagship smartphones (15 Pro, 16 Pro)", "Global consumers, business executives", "Primary (~50% revenue)", BcgCategory.CASH_COW, "Immense installed base generating cash flow and driving ecosystem attachment"),
                    PortfolioItem("Services", "App Store, iCloud, Apple Music, Apple Pay", "Over 1 billion paying subscribers", "Very High (~25% revenue)", BcgCategory.STAR_GROWTH, "High gross margin (74%+) recurring revenue with accelerating growth"),
                    PortfolioItem("MacBook & Mac Studio", "Laptops and desktop workstations with M-chips", "Developers, video editors, students", "Moderate (~8%)", BcgCategory.CASH_COW, "Regained performance leadership and battery life superiority over Windows/Intel"),
                    PortfolioItem("Apple Watch & AirPods", "Wearables and audio accessories", "Fitness enthusiasts, mobile professionals", "High (~10%)", BcgCategory.STAR_GROWTH, "Dominant market share in smartwatches and wireless earbuds"),
                    PortfolioItem("Apple Vision Pro", "Spatial computing headsets", "Early adopters, enterprise spatial developers", "Emerging (Low)", BcgCategory.QUESTION_MARK_EMERGING, "First-generation high-cost device establishing spatial UI paradigm for future lightweight glasses"),
                    PortfolioItem("Legacy Accessories", "Wired adapters, silicone cases, non-smart audio", "Incidental buyers", "Declining", BcgCategory.DECLINING_DOG, "Gradual phase-out as wireless ecosystem and universal USB-C take over")
                ),
                portfolioHealthVerdict = "Extraordinarily potent portfolio: The iPhone Cash Cow finances high-margin recurring Services Stars, while Apple Silicon architecture provides an enduring structural cost and battery advantage.",
                lensContent = appleLens
            ),
            level6 = Level6CustomerValue(
                dimensions = listOf(
                    CustomerValueDimension("Functional Value", 10, "Flawless cross-device continuity, industry-best mobile cameras, class-leading battery life", "Products integrate without friction; 'It just works'"),
                    CustomerValueDimension("Emotional Value", 10, "Aesthetic beauty, tactile luxury materials (titanium, ceramic shield), creative empowerment", "Carrying an Apple device is a modern badge of sophistication and taste"),
                    CustomerValueDimension("Social Value", 9, "Blue iMessage bubbles, AirDrop social sharing, status signaling", "Social pressure and frictionless communication inside peer groups"),
                    CustomerValueDimension("Economic Value", 7, "High initial retail price, but offset by highest second-hand trade-in resale value", "A 3-year-old iPhone retains 50%+ value compared to 20% for competitors"),
                    CustomerValueDimension("Convenience Value", 10, "Unified Apple ID, zero-setup device migration, universal Apple Pay checkout", "Switching to Android requires abandoning accumulated apps, photos, and muscle memory"),
                    CustomerValueDimension("Brand Trust", 10, "Uncompromising stance on on-device privacy, encryption, and zero data-selling business model", "Users trust Apple with biometric faces, fingerprints, credit cards, and private health data")
                ),
                brandTrustRationale = "Apple makes money by selling premium hardware and subscriptions—not by monetizing user surveillance or serving intrusive third-party ads, creating profound consumer privacy trust.",
                lensContent = appleLens
            ),
            level7 = Level7CompetitiveAdvantage(
                moats = listOf(
                    MoatElement("High Switching Costs", "Widest", "Leaving Apple means losing purchased apps, iMessage group threads, Apple Watch compatibility, and iCloud photo archives", "Competitors cannot offer cross-ecosystem synchronization"),
                    MoatElement("Proprietary Silicon (M/A Chips)", "Widest", "Billions spent on in-house chip architecture delivering superior computing power per watt", "Rivals must buy off-the-shelf Qualcomm or Intel chips with standard specs"),
                    MoatElement("Walled Garden App Store", "Widest", "Monopolistic distribution gateway for iOS apps collecting 15-30% developer platform commission", "Android sideloading dilutes platform monetization"),
                    MoatElement("Supply Chain Monopsony", "High", "Largest buyer of high-end consumer tech components, demanding massive price discounts and priority allocation", "Smaller hardware brands cannot secure exclusive TSMC 3nm foundry capacity"),
                    MoatElement("Aspirational Brand Equity", "Widest", "Global cultural icon synonymous with creativity, minimalist design, and premium status", "Marketing dollars cannot create five decades of counter-culture design prestige")
                ),
                ecosystemLockIn = "Every additional Apple product purchased makes all prior Apple devices more useful and makes exiting the ecosystem exponentially more painful.",
                lensContent = appleLens
            ),
            level8 = Level8FinancialEngine(
                steps = listOf(
                    FinancialFlowStep("1. Revenue Sources", "Hardware sales (~$300B) + Digital Services (~$90B+)", "Annual revenue ~$390B USD", "Global multi-currency consumer cash and credit purchases"),
                    FinancialFlowStep("2. Profit Drivers", "Services gross margin of 74%+; Pro iPhone premium pricing ($1,199+) with high memory upgrade margins", "Gross profit ~$175B USD", "Upselling customers to higher storage tiers and subscription bundles (Apple One)"),
                    FinancialFlowStep("3. Major Costs", "Contract manufacturing, TSMC wafer fabrication, display panels, R&D ($30B), marketing and Apple Store leases", "Total cost of sales ~$215B USD", "Supply chain efficiency and component volume discounts keep COGS predictable"),
                    FinancialFlowStep("4. Operating Margins", "Industry-leading 30%+ operating margin across all hardware and software categories", "Operating income ~$120B+ USD", "Minimal advertising spend compared to revenue due to organic product hype"),
                    FinancialFlowStep("5. Free Cash Flow & Buybacks", "Generates $100B+ annual Free Cash Flow, deployed into massive share repurchases and dividends", "Repurchased over $650B in stock over the past decade", "Relentless reduction in share count continually increases EPS for shareholders")
                ),
                howMoneyEnters = "Money enters through consumer retail transactions, carrier subsidy contracts, App Store commissions, iCloud subscriptions, and Google TAC search engine payments.",
                howMoneyLeaves = "Money leaves through payments to contract manufacturers (Foxconn), component suppliers (TSMC, Samsung Display), R&D talent, and share buybacks.",
                howProfitsAreCreated = "Apple charges premium luxury prices for hardware built with hyper-optimized asset-light contract manufacturing, then layers on 74% gross margin recurring digital services.",
                grossMarginAvg = "44% - 46% (Hardware ~37%; Services ~74%)",
                operatingMarginAvg = "30.5% consolidated",
                freeCashFlowProfile = "The world's premier cash-generating corporate machine: over $100B in annual free cash flow.",
                lensContent = appleLens
            ),
            level9 = Level9OperationsEngine(
                pillars = listOf(
                    OperationsPillar("Design for Manufacturability", "Engineering and Industrial Design teams collaborate inside Cupertino to sculpt unified unibody chassis", "Micron-level tolerances on mass assembly lines"),
                    OperationsPillar("Supplier Co-Investment", "Apple purchases custom multi-million-dollar laser cutting tools and installs them in supplier factories", "Exclusive access to advanced machinery rivals cannot buy"),
                    OperationsPillar("Global Dual-Sourcing", "Splitting component orders across Foxconn, Luxshare, Samsung, and BOE to maintain aggressive price leverage", "Ensures competitive pricing and hedges factory disruption risks"),
                    OperationsPillar("Asset-Light Infrastructure", "Zero owned chip foundries, zero owned assembly factories; balance sheet is free of heavy industrial depreciation", "Return on Invested Capital (ROIC) exceeding 50%"),
                    OperationsPillar("Obsessive Inventory Velocity", "Inventory is turned over every 9-10 days, minimizing working capital lockup and obsolescence risk", "Cash conversion cycle is deeply negative, meaning suppliers finance operations")
                ),
                overallExcellenceSummary = "Tim Cook transformed Apple from an artist's studio into the most ruthless, disciplined, and profitable supply chain engine in human history.",
                lensContent = appleLens
            ),
            level10 = Level10DigitalTransformation(
                pillars = listOf(
                    TechPillar("Artificial Intelligence", "Apple Intelligence: Hybrid edge-cloud AI running 3B-parameter models on-device with Private Cloud Compute", "Protects privacy while integrating semantic context across apps"),
                    TechPillar("Proprietary Silicon Architecture", "Neural Engine hardware blocks integrated directly onto A-series and M-series chips", "Enables real-time computational photography, FaceID, and local LLM inference"),
                    TechPillar("Unified Developer SDK", "Swift, SwiftUI, and Metal APIs allowing developers to write an app once and deploy across iPhone, iPad, Mac, and Vision Pro", "Creates the world's most vibrant and profitable app development ecosystem"),
                    TechPillar("Security & Enclave", "Hardware-isolated Secure Enclave chip protecting biometric passwords and cryptographic keys", "Zero unauthorized penetration of user biometric databases"),
                    TechPillar("Ecosystem Cloud Sync", "iCloud infrastructure coordinating cross-device state, photo libraries, and real-time document collaboration", "Locks users into continuous cloud storage upgrade tiers")
                ),
                digitalMaturityVerdict = "Benchmark leader in client-side edge computing and silicon-software co-optimization.",
                lensContent = appleLens
            ),
            level11 = Level11Swot(
                strengths = listOf(
                    "The world's most valuable and admired consumer brand with fanatical customer loyalty",
                    "Massive installed base of over 2.2 billion active devices worldwide",
                    "Unrivaled hardware-software integration powered by custom in-house Apple Silicon",
                    "High-margin Services engine generating $90B+ in annual recurring revenue",
                    "Extraordinary cash flow generation enabling $100B+ annual share buybacks"
                ),
                weaknesses = listOf(
                    "High revenue concentration in the iPhone (~50% of annual revenue)",
                    "Supply chain geographical concentration in mainland China despite India diversification",
                    "Perceived slower public rollout of generative AI compared to Microsoft, OpenAI, and Google",
                    "Premium pricing limits market share penetration in low-income emerging economies"
                ),
                opportunities = listOf(
                    "Expansion of manufacturing hubs in India (targeting 25%+ of all iPhone production)",
                    "Monetization of on-device Apple Intelligence through premium AI agent subscription tiers",
                    "Healthcare disruption: non-invasive glucose monitoring and clinical-grade health diagnostics via Apple Watch",
                    "Fintech expansion: deeper penetration of Apple Pay, Apple Cash, and consumer installment loans"
                ),
                threats = listOf(
                    "Global antitrust regulations (EU Digital Markets Act, US DOJ antitrust lawsuit) forcing open the App Store",
                    "Geopolitical tensions between the US and China threatening manufacturing or Chinese sales access",
                    "Elongating consumer smartphone upgrade cycles as device hardware advances become incremental",
                    "Rise of alternative ambient AI computing form factors challenging the primacy of the smartphone screen"
                ),
                strategicImplications = "Apple must aggressively accelerate supply chain diversification into India and Vietnam while defending its lucrative 30% Services margin against antitrust regulators.",
                lensContent = appleLens
            ),
            level12 = Level12RiskManagement(
                risks = listOf(
                    RiskCategory("Geopolitical Risk", "Supply chain concentration in China amidst US-China semiconductor and trade restrictions", "Critical", "Rapid multi-billion dollar manufacturing expansion with Foxconn and Tata in India and Vietnam"),
                    RiskCategory("Regulatory Risk", "Antitrust enforcement mandating third-party app stores, sideloading, and unbundling of Apple Pay", "High", "Comply with regional mandates (EU DMA) while creating technical notarization fees to maintain revenue"),
                    RiskCategory("Hardware Cycle Risk", "Consumers keeping iPhones for 4-5 years instead of upgrading every 2 years", "Moderate", "Shift financial focus to Services ARPU (Average Revenue Per User) and trade-in upgrade programs"),
                    RiskCategory("Technology Disruption Risk", "Generative AI changing how users interact with software, bypassing traditional app stores", "Moderate", "Integrate foundation models directly into Siri and partner with OpenAI/Anthropic/Google"),
                    RiskCategory("Intellectual Property Risk", "Patent disputes over medical sensors (Masimo pulse oximeter) or standard essential cellular tech", "Moderate", "Aggressive patent acquisition and in-house modem chip development"),
                    RiskCategory("Single-Product Dependency", "Any flaw, recall, or demand crash in the iPhone flagship impacts half the company's revenue", "Moderate", "Expand Wearables, iPad, Mac, and subscription software as standalone profit centers")
                ),
                enterpriseRiskSummary = "Apple mitigates enterprise risk through aggressive cash hoarding, supplier diversification into India, and continuous migration toward high-margin digital software subscriptions.",
                lensContent = appleLens
            ),
            level13 = Level13LeadershipCulture(
                leadershipPhilosophy = "Functional Organization: Apple is organized by functional expertise (Hardware, Software, Design, Marketing) rather than autonomous business units, preventing internal product competition.",
                decisionMakingStyle = "Obsessive attention to detail, centralized executive team product reviews, and uncompromising aesthetic standards.",
                employeeCulture = "Extreme secrecy, deep pride in craftsmanship, relentless work ethic, and dedication to user privacy and environmental sustainability.",
                talentStrategy = "Attracting the world's elite hardware designers, silicon architects, and software engineers with industry-leading equity compensation.",
                governanceModel = "Lean executive team under CEO Tim Cook with strict board oversight focusing on long-term shareholder value and ESG stewardship.",
                lensContent = appleLens
            ),
            level14 = Level14IndustryComparison(
                competitor1Name = "Samsung Electronics",
                competitor2Name = "Google (Alphabet)",
                benchmarks = listOf(
                    CompetitorBenchmark("Core Strategic Play", "Proprietary luxury hardware + Closed services garden", "Diversified component maker (chips, OLED) + hardware", "Open mobile operating system (Android) + Search/Ad engine"),
                    CompetitorBenchmark("Gross Margins", "Industry-best 45% (Hardware 37%, Services 74%)", "Moderate ~30-35% (vulnerable to memory chip cycles)", "High ~55% (driven by software advertising monopoly)"),
                    CompetitorBenchmark("Operating System Control", "100% proprietary iOS/macOS co-designed with silicon", "Relies on Google's Android for mobile OS layer", "Owns Android OS but licenses to third-party hardware OEMs"),
                    CompetitorBenchmark("Hardware Profit Share", "Captures ~85% of global smartphone industry profits", "Captures ~10% of smartphone profits despite high volume", "Hardware is a secondary showcase for Google services and AI"),
                    CompetitorBenchmark("Consumer Privacy Posture", "Privacy as a fundamental human right (on-device processing)", "Standard enterprise data collection for device analytics", "Core business model relies on advertising data monetization")
                ),
                winningDifferentiator = "Apple's singular integration of proprietary silicon, bespoke operating systems, luxury retail theater, and airtight ecosystem lock-in makes its profit pool unreachable by Android competitors.",
                lensContent = appleLens
            ),
            level15 = Level15FutureRoadmap(
                horizons = listOf(
                    GrowthHorizon("Short-Term (1-2 Years)", listOf("Roll out Apple Intelligence across iPhone, iPad, and Mac", "Transition 25% of iPhone assembly volume to India", "Launch OLED iPad mini and M4 MacBook line"), "Edge AI integration & supply chain de-risking"),
                    GrowthHorizon("Medium-Term (3-5 Years)", listOf("Deploy second-generation lighter Apple Vision Air spatial glasses", "Launch in-house 5G/6G cellular modems replacing Qualcomm", "Introduce AI-powered healthcare coaching subscriptions"), "Spatial computing adoption & silicon component self-sufficiency"),
                    GrowthHorizon("Long-Term (5-10 Years)", listOf("Consumer smart AR glasses with holographic micro-LED displays", "Autonomous personal robotics for smart home assistance", "Non-invasive optical blood glucose and cardiovascular monitoring"), "Ambient augmented reality & pervasive biometric wellness")
                ),
                megatrendAlignment = "Capitalizing on Edge AI, Spatial Computing, Personal Health Monitoring, and Decentralized High-Yield Consumer Fintech.",
                lensContent = appleLens
            ),
            level16 = Level16MbaClassroom(
                keyConcepts = listOf(
                    "Network Effects & Platform Switching Costs",
                    "Asset-Light Manufacturing & Negative Working Capital Cycles",
                    "Price Elasticity of Demand in Luxury Consumer Tech",
                    "Vertical Integration of Core IP vs. Horizontal Commoditization",
                    "The Innovator's Dilemma in Maintaining Smartphone Dominance"
                ),
                frameworksUsed = listOf(
                    "Porter's Five Forces (Suppliers have low power; Buyer switching costs are astronomical)",
                    "Blue Ocean Strategy: Creating the Smartphone category with the iPhone in 2007",
                    "The Experience Economy: Apple Store retail theater transforming transactions into brand pilgrimages",
                    "Capital Allocation Framework: The role of $100B annual buybacks in EPS expansion",
                    "Functional Organizational Design vs. Multidivisional (M-Form) Conglomerate structures"
                ),
                strategicInsights = listOf(
                    "Apple's genius was realizing that hardware without exclusive software is a commodity, while software without integrated hardware is unprotectable. By controlling both, they created a legal monopoly over their customer relationship.",
                    "Negative cash conversion cycles allow Apple to use suppliers' money to fund operational growth, acting as a massive zero-interest financing engine."
                ),
                caseStudyLessons = listOf(
                    "The Apple Silicon Transition: How firing your primary chip vendor (Intel) can unlock unprecedented performance differentiation and gross margin expansion.",
                    "The Epic Games Dispute: The antitrust clash between platform gatekeeper tollbooths (30% App Store fee) and third-party developer rights."
                ),
                discussionQuestions = listOf(
                    "1. If the US Department of Justice forces Apple to decouple iMessage and allow third-party app stores without toll fees, does the Apple ecosystem moat collapse or merely bend?",
                    "2. Can Apple maintain its consumer privacy brand promise while attempting to compete with Google and OpenAI in generative AI models that thrive on massive cloud data scraping?",
                    "3. Is Apple's functional organization structure scalable to multi-billion-dollar new categories like spatial computing and autonomous systems without creating executive bottlenecks?"
                ),
                lensContent = appleLens
            ),
            level17 = Level17ConsultantMode(
                whatIsWorkingWell = "Services revenue has surpassed $90B with extraordinary 74% gross margins; Apple Silicon transition has fortified the Mac and iPad lines; customer retention remains unmatched at 93%+.",
                whatIsInefficient = "Apple Vision Pro launch showed disconnect between ultra-premium pricing ($3,499) and real-world consumer use cases; R&D capital expenditure on canceled project (Apple Car ~$10B) yielded minimal tangible hardware.",
                whatShouldBeImproved = "Accelerate modular developer integration for Apple Intelligence; lower barriers for international Apple Pay adoption in emerging markets; revitalize Siri with real multi-step agentic capabilities.",
                whereAreHiddenOpportunities = "B2B enterprise Mac and iPad penetration where IT departments are eager for zero-touch deployment and lower total cost of ownership; healthcare clinical trial data subscriptions for pharmaceutical giants.",
                whatShouldManagementPrioritizeNext = "1. Deliver flawless Apple Intelligence contextual features; 2. Expand India manufacturing to reach 30% of global output by 2026; 3. Develop lightweight consumer AR glasses roadmap.",
                priorityScorecard = listOf(
                    "Priority 1: Apple Intelligence Global Rollout & Siri Overhaul",
                    "Priority 2: India Supply Chain Scale & Local Market Share",
                    "Priority 3: EU & US Regulatory Antitrust Defense",
                    "Priority 4: Spatial Computing Gen-2 Cost Reduction",
                    "Priority 5: In-House Cellular Modem Commercialization"
                ),
                lensContent = appleLens
            ),
            level18 = Level18CeoDashboard(
                businessModel = "Integrated premium consumer technology platform monetizing custom hardware, proprietary operating systems, and recurring digital services within a closed, high-retention ecosystem.",
                revenueEngine = "Approaching $400B annual revenue with ~50% from iPhone, ~25% from high-margin Services, and balance across Wearables, Mac, and iPad.",
                supplyChainSummary = "Asset-light outsourced assembly model in China/India/Vietnam with direct ownership of tooling, custom silicon IP, and priority TSMC foundry capacity.",
                marketingLogisticsSummary = "Chartered global air cargo bypassing warehouses; 530+ architectural flagship stores with world's highest retail sales density.",
                competitiveAdvantageSummary = "Aspirant brand prestige, prohibitive platform switching costs, custom M/A-series silicon lead, and 2.2B+ active device installed base.",
                primaryRisksSummary = "Antitrust forced unbundling (DOJ/EU), US-China geopolitical decoupling, and smartphone upgrade cycle elongation.",
                futureOpportunitiesSummary = "Edge AI automation (Apple Intelligence), healthcare diagnostics (Apple Watch), spatial computing (VisionOS), and India consumer adoption.",
                strategicPrioritiesList = listOf(
                    "Execute Indian manufacturing expansion to counter China geopolitical risk",
                    "Establish Apple Intelligence as the most privacy-conscious edge AI standard",
                    "Defend Services gross margin structure in global courts",
                    "Optimize Vision platform for lighter form factors and mass-market pricing"
                ),
                executiveScoreRating = "Executive Health Score: 9.8 / 10 (Gold Standard Global Platform)"
            )
        )
    }

    fun getRelianceEcosystem(): CompanyBusinessOS {
        // Quick high-impact build for Reliance
        val tata = getTataGroup()
        return tata.copy(
            companyName = "Reliance Industries",
            tickerOrCode = "RELIANCE (NSE)",
            industrySector = "Energy, Telecom, Digital Services & Retail",
            foundedYear = "1958 (Dhirubhai Ambani)",
            globalHeadquarters = "Mumbai, Maharashtra, India",
            estimatedValuation = "$230B+ Market Cap",
            executiveTagline = "Growth is Life: India's Largest Energy, 5G Telecom, and Retail Powerhouse",
            level1 = tata.level1.copy(
                companyHistory = "From a synthetic yarn trading house to the world's largest refining complex in Jamnagar, revolutionized Indian digital life with Jio, and built India's largest retail network.",
                founderStory = "Dhirubhai Ambani's audacious vision democratized equity investing in India, building world-scale plants with radical execution speed.",
                executiveSummary = "Reliance is an industrial-digital colossus operating the world's largest oil refinery, India's #1 5G telecom network (Jio ~470M users), and India's #1 retail chain."
            )
        )
    }

    fun getAmazonEcosystem(): CompanyBusinessOS {
        val apple = getAppleEcosystem()
        return apple.copy(
            companyName = "Amazon.com, Inc.",
            tickerOrCode = "AMZN (NASDAQ)",
            industrySector = "E-Commerce, Cloud Infrastructure (AWS), Logistics & Advertising",
            foundedYear = "1994 (Jeff Bezos)",
            globalHeadquarters = "Seattle, Washington, USA",
            estimatedValuation = "$1.9 Trillion+ Market Cap",
            executiveTagline = "Earth's Most Customer-Centric Company & Cloud Infrastructure Giant",
            level1 = apple.level1.copy(
                companyHistory = "Started as an online bookstore in a garage, expanding into the global 'Everything Store', inventing modern cloud computing (AWS), and building the world's largest private logistics network.",
                founderStory = "Jeff Bezos pioneered customer obsession, long-term thinking, Day 1 mentality, and working backwards from the customer.",
                executiveSummary = "Amazon operates a legendary flywheel linking a retail marketplace, a $100B+ run-rate cloud monopoly (AWS), high-margin digital advertising, and 1-day delivery logistics."
            )
        )
    }

    fun getTeslaEcosystem(): CompanyBusinessOS {
        val apple = getAppleEcosystem()
        return apple.copy(
            companyName = "Tesla, Inc.",
            tickerOrCode = "TSLA (NASDAQ)",
            industrySector = "Electric Vehicles, Energy Storage, AI & Robotics",
            foundedYear = "2003 (Martin Eberhard, Marc Tarpenning; Elon Musk early lead investor/architect)",
            globalHeadquarters = "Austin, Texas, USA",
            estimatedValuation = "$750B+ Market Cap",
            executiveTagline = "Accelerating the World's Transition to Sustainable Energy through Software & Robotics",
            level1 = apple.level1.copy(
                companyHistory = "Proved electric cars could be faster and more desirable than gas vehicles, scaled massive Gigafactories worldwide, and pioneered full self-driving neural networks.",
                founderStory = "Elon Musk took extreme technological and capital risks, leading Tesla from near-bankruptcy in 2008 and 2018 to the most valuable automaker in history.",
                executiveSummary = "Tesla combines vertically integrated automotive manufacturing, proprietary battery pack technology, the global Supercharger network, and real-world vision-based artificial intelligence."
            )
        )
    }

    fun getSamsungEcosystem(): CompanyBusinessOS {
        val tata = getTataGroup()
        return tata.copy(
            companyName = "Samsung Group",
            tickerOrCode = "005930 (KRX)",
            industrySector = "Semiconductors, Consumer Electronics, Display, Heavy Industries",
            foundedYear = "1938 (Lee Byung-chul)",
            globalHeadquarters = "Suwon / Seoul, South Korea",
            estimatedValuation = "$380B+ Aggregate Market Cap",
            executiveTagline = "Inspire the World, Create the Future: The Chaebol Engine of Global Tech Components",
            level1 = tata.level1.copy(
                companyHistory = "From a noodle trading grocery in 1938 to South Korea's iconic Chaebol powerhouse dominating memory chips (DRAM/NAND), OLED displays, and Galaxy smartphones.",
                founderStory = "Lee Byung-chul and Chairman Lee Kun-hee famously declared the 1993 'Frankfurt Declaration'—change everything except your wife and children—elevating Samsung to world-class quality.",
                executiveSummary = "Samsung is a vertically integrated component and consumer giant that manufactures the very screens, memory chips, and camera sensors that power half the world's consumer electronics."
            )
        )
    }
}
