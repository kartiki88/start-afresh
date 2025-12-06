# Kartik Ingalgi

**C-201, Meenakshi Mangalam, Arakere 2nd Main, BG Road, Bangalore, Karnataka 560076**

📱 +919008017165 | 📧 kartiki88@gmail.com

---

## PROFESSIONAL SUMMARY

Senior Data Engineer with 14+ years (Sep 2011–Present) of hands-on experience designing and deploying mission-critical ETL pipelines for global financial institutions (Societe Generale, Morgan Stanley, Credit Suisse). Expertise in regulatory data frameworks (BCBS 239, KYC/AML, sanctions screening), treasury and liquidity management, and financial reconciliation. Proficient in both legacy (Informatica PowerCenter, Control-M) and modern data stacks (Talend, Spark, Scala). Proven track record leading and collaborating within distributed teams (India/Europe) on complex financial data transformations with emphasis on data security, PII controls, and regulatory audit compliance.

---

## TECHNICAL SKILLS

| **Category** | **Details** |
|---|---|
| **Languages** | Scala/Spark, Python, SQL (Advanced), PL/SQL, Unix Shell Scripting |
| **ETL/Data Tools** | Informatica PowerCenter (10.4–10.5), Talend, Talend BDM |
| **Workflow/Scheduling** | Control-M, Autosys, Airflow (Basics) |
| **Databases** | Hive, Oracle 11g/12c, DB2, Impala, Sybase |
| **Big Data/Cloud** | Apache Spark, Scala, Hadoop HDFS, Hive, Sqoop, Parquet/Avro Formats, Microsoft Azure |
| **BI/Analytics** | SAP BO, Microsoft Power BI, Tableau |
| **Compliance/Security** | PII Masking, Domain Object-Based Security, Liquibase, GDPR Data Controls |

---

## PROFESSIONAL EXPERIENCE

### **SOCIETE GENERALE | Bangalore, India**
**4+ Years | Treasury and Funding Perimeter**

#### PROJECT: Eurosystem Collateral Management System (ECMS) & Collateral Management & Covered Bonds (GMC)
**Duration:** Jul 2021 – Present | **Role:** Lead Software Engineer

**Project Scope:**
Designed and maintained enterprise-scale ETL infrastructure for Eurosystem Collateral Management System (ECMS) go-live with European Central Bank, supporting collateral management of pooled corporate loans for Banque de France refinancing and covered bonds issuance.

**Key Achievements:**

- **Led ECMS go-live initiative** for Eurosystem Collateral Management System (ECB's unified collateral management platform replacing 20 national systems); delivered data layer supporting real-time collateral tracking and credit line calculation across euro area central banks

- **Architected Informatica/Talend mappings** ingesting corporate loan and home loan data into our Big Data platform and Oracle 12c; improved performance of workflows reducing daily run time from 6 hours → ~4 hours (33% improvement)

- **Engineered enterprise PII masking framework** using domain objects for multiple downstream users; ensured BCBS 239 audit compliance across €3B+ asset pools with zero control failures

- **Migrated legacy Talend workflows to Spark/Scala Big Data framework** for horizontal scalability and cost optimization; eliminated expensive Talend licensing while enabling processing of larger loan datasets, reducing processing window from 6 hours → 2.5 hours (58% improvement) and delivering significant annual license cost savings to the bank

- **Designed and deployed Control-M automation jobs** automated nightly reconciliation against Banque de France interface feeds (zero manual intervention required)

- **Standardized data ingestion pipelines** using Sqoop/Spark; transitioned loan data storage from CSV → Parquet/Avro, reducing storage footprint and improving query performance

- **Collaborated with cross-functional ECMS team** (Treasury, Risk, Technology) on data requirements, schema design, and interface specifications for ECB collateral management platform

---

### **MORGAN STANLEY | Bangalore, India**
**4+ Years | Legal and Compliance Group (LCG) Data Team**

#### PROJECT: LCG Data Platform (Trade Surveillance, AML, Sanctions, Employee Trading)
**Duration:** May 2017 – Present | **Role:** Manager, ETL Developer

**Project Scope:**
Architected enterprise data infrastructure supporting Legal and Compliance Group (LCG) across multiple compliance domains; processed 500K+ daily transactions for AML, sanctions screening, trade surveillance, and employee trading monitoring across 100+ global entities; enabled zero-false-negative compliance screening aligned with OFAC, EU, UN watchlists.

**Key Achievements:**

- **Architected enterprise-scale Hive/Impala data warehouse** ingesting 5M+ customer records and 2M+ daily transactions; implemented SCD Type 2 for historical KYC tracking, reducing KYC audit cycle time 40% via automated data lineage

- **Designed and deployed 30+ Informatica/Talend complex mappings** for KYC enrichment, transaction screening, AML transaction monitoring, sanctions list matching, and employee trading compliance; achieved real-time screening compliance across 15+ global watchlists (OFAC, EU, UN, UNSC)

- **Created domain object-based security framework** for LCG team, implementing field-level PII masking and data classification; enabled 200+ downstream risk/compliance analysts to access sanitized compliance data while maintaining GDPR compliance and passing regulatory audit without exceptions

- **Led vendor integration partnership** overseeing third-party data enrichment provider; validated sanctions list matching logic and KYC data accuracy; reduced false-positive alerts 25%

- **Built Tableau operational dashboards** tracking transaction spike alerts, KYC coverage gaps, sanctions screening SLA metrics, and AML alert queues; reduced manual alert triage time 50% via automated anomaly detection

- **Conducted Talend POC** for SCD Type 2 implementation and DB2 data loads; delivered PoC in 2 weeks and led technical decision to adopt Talend for enterprise AML pipeline modernization

- **Mentored team of 3 developers** on advanced Informatica, Hive optimization, and compliance best practices; drove performance optimization reducing nightly batch window from 6 hours → 3.5 hours (42% improvement) via query tuning and partitioning

---

#### PROJECT: EOD Market Data Platform (Market1)
**Duration:** May 2020 – Jun 2021 | **Role:** Senior Manager

**Project Scope:**
Built real-time EOD pricing pipeline supporting debt traders across 3 global zones (Tokyo/London/New York); processed multi-source pricing (Bloomberg, Reuters, internal feeds) for 150+ active debt traders; ensured 99.97% SLA compliance.

**Key Achievements:**

- **Designed and enhanced 25+ Informatica complex mappings** for multi-source EOD pricing ingestion; implemented automated validation workflows ensuring zero-SLA breach delivery across 3 trading zones daily

- **Led DevOps modernization initiative** implementing Runway + train-deploy automation; reduced manual deployment time from 4 hours → 30 minutes, enabling daily production releases vs. weekly cadence (4x deployment frequency)

- **Automated CI/CD pipeline deployment** via msde-scheduler and Autosys; eliminated 6 manual FTE hours per week, reducing human error and improving deployment consistency

- **Partnered with DBA team** on Sybase replication and cross-zone data consistency strategy; validated all critical pricing feeds across TK/London/NY daily with zero pricing discrepancies

- **Mentored 2 developers** on CI/CD best practices and code review processes; reduced production defects by 18% through standardized development workflows

---

### **CREDIT SUISSE | Bangalore (Via TCS Consultant)**
**5+ Years | Risk & Finance Reconciliation & Market Risk**

#### PROJECT: Risk and Finance Reconciliation (RFR) + Market Risk (BCBS 239)
**Duration:** Jan 2012 – Apr 2017 | **Role:** ETL & PL/SQL Developer

**Project Scope:**
Built reconciliation engine comparing Accounting vs. Trading systems for £2B+ notional AUM as part of BCBS 239 regulatory framework; calculated IRR, FX, interest rate, and regulatory risks for VaR calculations and regulatory reporting; ensured zero audit exceptions across 3-year tenure.

**Key Achievements:**

- **Designed and maintained 50+ Informatica mappings** for RFR (Risk and Finance Reconciliation), accounting-trading variance analysis, and exception reporting; automated month-end close processes reducing close timeline by 3 days

- **Engineered dynamic parameter file framework** for 200+ monthly workflow runs; enabled flexible product/entity filtering without code changes, reducing configuration time 70%

- **Built PL/SQL scripts** for data validation, duplicate elimination, and variance reconciliation; improved data quality metrics from 98% → 99.7%, reducing manual reconciliation exceptions 85%

- **Architected Control-M job scheduling** ensuring daily reconciliation runs completed by 8am; achieved zero SLA misses across 3-year tenure with 99.8% on-time completion rate

- **Implemented BCBS 239 audit controls** (RFR component) including data lineage tracking, reconciliation sign-off workflows, and audit-trail logging; enabled flawless regulatory audits with zero control exceptions

- **Optimized ETL mapping logic and database queries** reducing nightly reconciliation job runtime from 2.5 hours → 1.2 hours (52% improvement) via parallel processing, partitioning strategies, and index optimization

- **Collaborated cross-functionally** with Risk, Treasury, and Finance teams on reconciliation logic design, data governance policies, and access controls for BCBS 239 compliance; ensured 100% stakeholder alignment

---

## EDUCATION

| **Degree** | **University** | **Institution** | **Year** |
|---|---|---|---|
| **B.E. (Computer Science & Engineering)** | Visvesvaraya Technological University, Belgaum | B V Bhoomaraddi College of Engineering and Technology, Hubli | 2011 |

---

## CERTIFICATIONS

| **Certification** | **Issuer** | **Details** |
|---|---|---|
| **Microsoft Certified: Azure Fundamentals (AZ-900)** | Microsoft | Validates foundational knowledge of cloud services and Microsoft Azure platform; demonstrates understanding of cloud concepts, core Azure services, security, governance, and compliance |

---

## CORE COMPETENCIES

**Data Engineering:** ETL/ELT Design, Data Pipeline Architecture, Data Warehouse Design, Schema Design, Data Quality Frameworks, Spark/Scala Big Data

**Financial Domain:** Treasury & Funding, Risk Management, KYC/AML/Sanctions Screening, Trade Surveillance, Employee Trading Compliance, Financial Reconciliation, BCBS 239 Compliance, ECMS (Eurosystem Collateral Management System), Covered Bonds

**Leadership & Collaboration:** Team Leadership (Mentoring, Code Standardization), Cross-Functional Collaboration, Vendor Management, Performance Optimization, Regulatory Compliance

**Compliance & Security:** PII Masking, Domain Object-Based Security (Creator & Implementer), GDPR Compliance, BCBS 239 Audit Controls, Regulatory Audit Preparation, Field-Level Data Encryption

**Modern Data Stack:** Apache Spark, Scala, Hadoop, Hive, Talend, Sqoop, Microsoft Azure

**Legacy Enterprise Tools:** Informatica PowerCenter, Control-M, Autosys, SAP BO
