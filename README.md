# TenForce Website Automation Test

## Overview
This project contains an automated UI test for the TenForce website using **Selenium WebDriver with Java and TestNG**.
The test validates navigation across the Career section and verifies the presence of a specific text on the Job Openings page.

---

##  Test Scenario Covered
1. Open https://www.tenforce.com/
2. Navigate to the **Career** page
3. Open **Life at TenForce** section
4. Open the **Life of Two Interns** article
5. Scroll through the article
6. Navigate back to **Job Openings**
7. Verify the text:
   **“Feel free to send your CV to”**

---

## Framework & Tools Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

---

##  Framework Choice Justification
Selenium with Java is a widely adopted UI automation solution that provides strong browser support and flexibility.
TestNG enables structured test execution, assertions, and test lifecycle management.
Page Object Model (POM) improves test maintainability by separating test logic from UI interactions.

---

## Architecture Overview
The framework follows the Page Object Model (POM) design pattern:
- Page classes contain locators and page-level actions
- Test classes manage test flow and validations
- Helper utilities handle reusable actions like waits and safe clicks

This architecture ensures scalability, readability, and ease of maintenance.

---

## Project Structure
```
src
 ├── main
 │   └── java
 │       └── clickHelper
 │           └── staleHandle.java
 └── test
     └── java
         ├── pages
         │   ├── HomePage.java
         │   ├── CareerPage.java
         │   ├── JobOpenings.java
         └── TenForceTest.java
```

---

## How to Run the Tests

### Prerequisites
- Java installed
- Maven installed
- Chrome browser installed

### Run from Command Line
```
mvn clean test
```

---

## Assertions
All assertions are meaningful and validate the expected UI behavior.

Example:
```
Assert.assertEquals(actualText, expectedText,
        "CV text does not match the expected value");
```

---

