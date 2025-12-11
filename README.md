\# TenForce Automation Testing Framework



This project contains automated UI tests for navigating the TenForce website using \*\*Selenium WebDriver\*\*, \*\*Java\*\*, and \*\*TestNG\*\*, built using the \*\*Page Object Model (POM)\*\* architecture. The goal of this framework is to provide a clean, scalable, and maintainable structure for web test automation.



---



\## How to Run the Tests



Follow the steps below to execute the automation suite:



\### 1. Clone the repository

```bash

git clone https://github.com/deoreshubham531-pixel/TenForceAutomation.git

cd TenForceAutomation

```



\### 2. Install dependencies

Ensure that Java (JDK 11+), Maven, and Chrome browser are installed.



Then run:

```bash

mvn clean install

```



\### 3. Execute the test suite

Run all tests:

```bash

mvn test

```



Run a specific TestNG test class:

```bash

mvn -Dtest=TenForceTest test

```



---



\## Framework Choice Justification



The chosen tech stack—\*\*Selenium WebDriver, Java, and TestNG\*\*—is widely adopted across the industry for UI test automation. Selenium provides powerful browser automation capabilities and cross-browser support. Java offers strong stability, a rich ecosystem, and smooth integration with tools like Maven. TestNG enhances the testing workflow with features such as annotations, parallel execution, grouping, and detailed reporting. Together, these tools create a reliable, maintainable, and scalable automation framework suitable for real-world projects and CI/CD integration.



---



\## Short Explanation of Architecture



This project uses the \*\*Page Object Model (POM)\*\* design pattern, where each webpage is represented by a dedicated Java class containing its elements and user actions. This separation ensures cleaner tests, improved readability, reusability of code, and easier maintenance when UI changes occur.



The architecture also includes a `clickHelper` utility that handles synchronization issues such as stale elements and visibility conditions, making tests more stable and less flaky. The test classes only call high-level page methods, keeping them simple, readable, and focused on verifying business flow rather than UI handling logic.



---





