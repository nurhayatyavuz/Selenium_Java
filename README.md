# Selenium Test Automation Project 
This repository contains test automation with Selenium and TestNG.
With videos, screenshots, and step-by-step guides, it is a learning resource for building and running automation projects.

## Table of Contents
About the Project
Tools and Technologies
Installation
Project Structure
Test Scenarios
How to Run
Screenshots & Videos
References

## About the Project
This project includes:
Login tests
Employee add/update tests
DataProvider with multiple users
Custom type test flows
Page Object Model (POM) usage
The goal is to practice realistic automation steps and manage tests with TestNG.

## Tools and Technologies
Java 24 / Selenium 4.35.0
Selenium WebDriver
TestNG
Maven
IntelliJ IDEA
PageFactory (for POM)

## Installation
1. Install Java
Download Java JDK
Check installation:
java -version
2. Install IntelliJ IDEA
Download IntelliJ IDEA Community Edition
3. Install Maven
Comes with IntelliJ. Check:
mvn -v
4. Add Dependencies (pom.xml)
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.21.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.9.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

## Project Structure
src
 └── test
     ├── java
     │   ├── pages         # Page Object Model classes
     │   ├── tests         # Test cases
     │   └── extensions    # UIElementExtensions etc.
     └── resources
         └── testng.xml    # TestNG config

## Test Scenarios
Login Test: Valid and invalid login cases
Add Employee: Fill form and check saved data
DataProvider: Login with multiple users
Custom Type: Test with different object types

## How to Run
Open project in IntelliJ.
Right-click on testng.xml → Run 'testng.xml'.
All tests will run one by one.

## Videos
https://github.com/user-attachments/assets/82fa5cb9-bfea-40a8-8ca5-1f3426b58c0e



