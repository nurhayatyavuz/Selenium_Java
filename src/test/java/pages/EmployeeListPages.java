package pages;


import extensions.UIElementExtensions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class EmployeeListPages {


    private final WebDriver driver;


    public EmployeeListPages(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }


    @FindBy(linkText = "Create New")

    private WebElement lnkEmployeeListCreate;


    public CreateEmployeePages clickCreate() {

        UIElementExtensions.performClick(lnkEmployeeListCreate);

        return new CreateEmployeePages(driver);

    }

}