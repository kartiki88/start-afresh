# Kartik Ingalgi

**C-201, Meenakshi Mangalam, Arakere 2nd Main, BG Road, Bangalore, Karnataka 560076**

📱 +919008017165 | 📧 kartiki88@gmail.com

---

## PROFESSIONAL SUMMARY

Senior Data Engineer with 14+ years (Sep 2011–Present) of hands-on experience designing and deploying mission-critical ETL pipelines for global financial institutions (Societe Generale, Morgan Stanley, Credit Suisse). Deep expertise in regulatory data frameworks (BCBS 239, KYC/AML, sanctions screening), treasury and liquidity management, and financial reconciliation. Proficient in both legacy (Informatica PowerCenter, Control-M) and modern data stacks (Talend, Spark, Hive). Proven track record leading distributed teams (India/Europe) on complex financial data transformations with emphasis on data security, PII controls, and regulatory audit compliance.

---

## TECHNICAL SKILLS

| **Category** | **Details** |
|---|---|
| **Languages** | SQL (Advanced), PL/SQL, Scala/Spark, Unix Shell Scripting, Python |
| **ETL/Data Tools** | Informatica PowerCenter (10.4–10.5), Talend, Talend BDM |
| **Workflow/Scheduling** | Control-M, Autosys, Airflow (Basics) |
| **Databases** | Oracle 11g/12c, DB2, Hive, Impala, Sybase |
| **Big Data/Cloud** | Apache Spark, Hadoop HDFS, Hive, Sqoop, Parquet/Avro Formats |
| **BI/Analytics** | SAP BO, Microsoft Power BI, Tableau |
| **Compliance/Security** | PII Masking, Domain Object-Based Security, Liquibase, GDPR Data Controls |

---

## PROFESSIONAL EXPERIENCE

### **SOCIETE GENERALE | Bangalore, India**
**4+ Years | Treasury and Funding Perimeter**

#### PROJECT: Collateral Management & Covered Bonds (GMC)
**Duration:** Jul 2021 – Present | **Role:** Lead Software Engineer

**Project Scope:**
Designed and maintained enterprise-scale ETL infrastructure evaluating 2000+ pooled corporate loans monthly as collateral for Banque de France refinancing and covered bonds issuance; managed €500M+ notional home loan portfolios across multi-sourced data feeds.

**Key Achievements:**

- **Architected 40+ complex Informatica/Talend mappings** ingesting Oracle 12c corporate loan and home loan data; designed parameterized workflows reducing month-end close time from 8 days → 5 days (37% improvement)

- **Engineered enterprise PII masking framework** using domain objects for 50+ downstream Treasury/Risk users; ensured BCBS 239 audit compliance across €3B+ asset pools with zero control failures

- **Led cross-functional team** (2 India + 1 Paris engineer) on code standardization, performance tuning, and best practices; reduced ETL job failure rate from 12% → 2% via partition strategies and Parquet optimization

- **Migrated legacy Informatica workflows to Talend Big Data** for horizontal scalability; enabled processing of 5x larger loan datasets without infrastructure upgrade, reducing processing window from 6 hours → 2.5 hours

- **Designed and deployed 15+ Control-M automation jobs** plus 8 new database objects; automated nightly reconciliation against Banque de France interface feeds (zero manual intervention required)

- **Standardized data ingestion pipelines** using Sqoop/Talend; transitioned loan data storage from CSV → Parquet/Avro, reducing storage footprint 40% and query performance improvement 35%

---

### **MORGAN STANLEY | Bangalore, India**
**4+ Years | Debt Trading & Financial Crimes Technology**

#### PROJECT: EOD Market Data Platform (Market1)
**Duration:** May 2020 – Jun 2021 | **Role:** Senior Manager

**Project Scope:**
Built real-time EOD pricing pipeline supporting debt traders across 3 global zones (Tokyo/London/New York); processed multi-source pricing (Bloomberg, Reuters, internal feeds) for 150+ active debt traders; ensured 99.97% SLA compliance.

**Key Achievements:**

- **Designed and enhanced 25+ Informatica complex mappings** for multi-source EOD pricing ingestion; implemented automated validation workflows ensuring zero-SLA breach delivery across 3 trading zones daily

- **Led DevOps modernization initiative** implementing Runway + train-deploy automation; reduced manual deployment time from 4 hours → 30 minutes, enabling daily production releases vs. weekly cadence (4x deployment frequency)

- **Automated CI/CD pipeline deployment** via msde-scheduler and Autosys; eliminated 6 manual FTE hours per week, reducing human error and improving deployment consistency

- **Partnered with DBA team** on Sybase replication and cross-zone data consistency strategy; validated all critical pricing feeds across TK/London/NY daily with zero pricing discrepancies

- **Initiated ELK stack POC** for database performance and XLADDIN usage analytics; identified 20% performance degradation in report generation, enabling targeted optimization and 15% improvement

- **Mentored 2 developers** on CI/CD best practices and code review processes; reduced production defects by 18% through standardized development workflows

---

#### PROJECT: Financial Crimes Technology Data Platform (AML/KYC/Sanctions)
**Duration:** May 2017 – Present | **Role:** Manager, ETL Developer

**Project Scope:**
Architected data infrastructure for KYC, AML, and sanctions screening; processed 500K+ daily transactions across 100+ global entities; enabled zero-false-negative compliance screening aligned with OFAC, EU, UN watchlists.

**Key Achievements:**

- **Architected enterprise-scale Hive/Impala data warehouse** ingesting 5M+ customer records and 2M+ daily transactions; implemented SCD Type 2 for historical KYC tracking, reducing KYC audit cycle time 40% via automated data lineage

- **Designed and deployed 30+ Informatica/Talend complex mappings** for KYC enrichment, transaction screening, and sanctions matching; achieved real-time screening compliance across 15+ global watchlists (OFAC, EU, UN, UNSC)

- **Engineered PII and sensitive data security controls** (domain-based masking, field-level encryption, data classification) for 200+ downstream risk/compliance analysts; achieved GDPR compliance and regulatory audit pass

- **Led vendor integration partnership** overseeing third-party data enrichment provider; validated sanctions list matching logic and KYC data accuracy; reduced false-positive alerts 25%

- **Built Tableau operational dashboards** tracking transaction spike alerts, KYC coverage gaps, sanctions screening SLA metrics; reduced manual alert triage time 50% via automated anomaly detection

- **Conducted Talend POC** for SCD Type 2 implementation and DB2 data loads; delivered PoC in 2 weeks and led technical decision to adopt Talend for enterprise AML pipeline modernization

- **Mentored team of 3 developers** on advanced Informatica, Hive optimization, and compliance best practices; drove performance optimization reducing nightly batch window from 6 hours → 3.5 hours via query tuning and partitioning

---

### **CREDIT SUISSE | Bangalore (Via TCS Consultant)**
**5+ Years | Risk & Finance Reconciliation**

#### PROJECT: Risk & Finance Reconciliation + Market Risk (BCBS 239)
**Duration:** Jan 2012 – Apr 2017 | **Role:** ETL & PL/SQL Developer

**Project Scope:**
Built reconciliation engine comparing Accounting vs. Trading systems for £2B+ notional AUM; calculated IRR, FX, interest rate, and regulatory risks for BCBS 239 reporting; ensured zero audit exceptions across 3-year tenure.

**Key Achievements:**

- **Designed and maintained 50+ Informatica mappings** for accounting-trading reconciliation, variance analysis, and exception reporting; automated month-end close processes reducing close timeline by 3 days

- **Engineered dynamic parameter file framework** for 200+ monthly workflow runs; enabled flexible product/entity filtering without code changes, reducing configuration time 70%

- **Built PL/SQL scripts** for data validation, duplicate elimination, and variance reconciliation; improved data quality metrics from 98% → 99.7%, reducing manual reconciliation exceptions 85%

- **Architected Control-M job scheduling** ensuring daily reconciliation runs completed by 8am; achieved zero SLA misses across 3-year tenure with 99.8% on-time completion rate

- **Implemented BCBS 239 audit controls** including data lineage tracking, reconciliation sign-off workflows, and audit-trail logging; enabled flawless regulatory audits with zero control exceptions

- **Optimized ETL mapping logic and database queries** reducing nightly reconciliation job runtime from 2.5 hours → 1.2 hours (52% improvement) via parallel processing, partitioning strategies, and index optimization

- **Collaborated cross-functionally** with Risk, Treasury, and Finance teams on reconciliation logic design, data governance policies, and access controls; ensured 100% stakeholder alignment

---

## EDUCATION

| **Degree** | **University** | **Institution** | **Year** |
|---|---|---|---|
| **B.E. (Computer Science & Engineering)** | Visvesvaraya Technological University, Belgaum | B V Bhoomaraddi College of Engineering and Technology, Hubli | 2011 |

---

## CORE COMPETENCIES

**Data Engineering:** ETL/ELT Design, Data Pipeline Architecture, Data Warehouse Design, Schema Design, Data Quality Frameworks

**Financial Domain:** Treasury & Funding, Risk Management, KYC/AML/Sanctions Screening, Financial Reconciliation, BCBS 239 Compliance, Covered Bonds

**Leadership:** Team Leadership (Cross-functional, Distributed Teams), Vendor Management, Code Standardization, Performance Optimization, Mentoring

**Compliance & Security:** PII Masking, Data Security, GDPR Compliance, Regulatory Audit Preparation, Domain-Based Access Control

**Modern Data Stack:** Apache Spark, Hadoop, Hive, Talend, Sqoop

**Legacy Enterprise Tools:** Informatica PowerCenter, Control-M, Autosys, SAP BO