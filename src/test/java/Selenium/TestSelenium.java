package Selenium;

import extensions.UIElementExtensions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.EmployeeListPages;
import pages.HomePages;

public class TestSelenium {

    public static void main(String[] args) {

        //1.Create a webDriver with ChromeDriver object.
        //2. Launch the browser
        WebDriver driver = new ChromeDriver();

        //3. Navigate to a specific URL.
        driver.navigate().to("http://eaapp.somee.com"); // running = open the browser
        //POM Code
        HomePages homePage = new HomePages(driver);
        //Page Navigation concept of Selenium
        var loginPage = homePage.clickLogin();
        loginPage.performLogin("admin", "password");
        var employeeList = homePage.clickEmployeelist();
        var employeeCrt = employeeList.clickCreate();
        employeeCrt.EmployeeCreate("test2", "500", "3", "Junior", "test2@mail.com");

    }
}


