🧪 Automation Testing Framework — https://automationexercise.com/

📘 Project Overview
This project automates functional and regression testing for the Automation Exercise website using a hybrid Selenium + Cucumber BDD framework built on Java and Maven.

It showcases a robust automation framework designed for scalability, reusability, and CI/CD integration with Jenkins. The tests cover multiple end-to-end user journeys such as registration, login, product search, cart management, and checkout flows.

⚙️ Tech Stack & Tools
Category	Tools / Technologies
Language	Java (JDK 17+)
Automation	Selenium WebDriver
Framework	Cucumber (BDD), TestNG
Build Tool	Maven
Design Pattern	Page Object Model (POM) + Data-Driven Testing
CI/CD	Jenkins
Reporting	Cucumber HTML, Extent Report
Version Control	Git & GitHub
Browsers	Chrome, Edge, Firefox


🧱 Framework Architecture
bdd-framework/
├── src/test/java/
│   ├── features/             # Cucumber feature files
│   ├── stepDefinitions/      # Step Definitions binding feature steps to code
│   ├── runner/               # Cucumber TestRunner configuration
│   ├── pages/                # Page Object classes with web element locators
│   ├── utils/                # Reusable utilities (WebDriver, config, reporting)
│   └── hooks/                # Test setup and teardown logic
├── src/test/resources/
│   ├── config.properties     # Environment-specific data
│   └── testdata/             # External test data files
├── pom.xml                   # Maven dependencies and plugins
└── README.md                 # Project documentation

🧩 Key Highlights
✅ Modular & Scalable Framework — built on POM + BDD principles for maintainability.
✅ Cross-Browser & Cross-Platform Support — easily extendable for parallel execution.
✅ Integrated Test Reporting — automatic generation of detailed Cucumber HTML and Extent Reports.
✅ Reusable Components — centralized WebDriver management, configuration, and data utilities.
✅ Jenkins CI/CD Integration — supports automated nightly builds and triggered test runs.
✅ Error Handling & Screenshot Capture — implemented for failure analysis.

🧰 How to Execute
Prerequisites:
Java 17+ installed
Maven configured (mvn -v to verify)
Browser drivers available in PATH (or managed via WebDriverManager)

Steps:
# Clone the repository
git clone https://github.com/<your-username>/<repo-name>.git

# Navigate into the project directory
cd <repo-name>

# Run all test scenarios
mvn clean test

Generate Test Reports:
Reports are automatically generated at: target/cucumber-reports.html

🔗 Jenkins CI/CD Setup
Configured as a Maven pipeline project in Jenkins.
Integrated with GitHub for automatic build triggers on new commits.

Build steps:
Pull latest code from GitHub
Execute Maven commands (clean test)
Archive and publish HTML reports
Results are viewable directly from the Jenkins dashboard.

👨‍💻 Author
Souparnika J
💼 QA Automation Engineer (3–5 years)
🧩 Expertise: Selenium | Java | Cucumber | API & UI Automation | Jenkins | CI/CD
📧 https://www.linkedin.com/in/souparnika-juganikar-236637188/
