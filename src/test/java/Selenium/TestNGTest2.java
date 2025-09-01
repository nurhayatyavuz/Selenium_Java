package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePages;
import pages.LoginPages;


public class TestNGTest2 {

    private WebDriver driver;
    private HomePages homePage;
    private LoginPages loginPage;

    @BeforeTest
    public void RunBeforeTest() {
        System.out.println("Executing before every single test...");
        driver = new ChromeDriver();
        driver.navigate().to("http://eaapp.somee.com");
    }
    @Test
    @Parameters({"UserName","Password"})
    public void testCreateUser(String user,String pass){
        System.out.println("Testing the Create User operation");
        HomePages homePage = new HomePages(driver);
        loginPage = homePage.clickLogin();
        homePage = loginPage.performLogin(user, pass);
        var employeeList = homePage.clickEmployeelist();
        var employeeCrt = employeeList.clickCreate();
        employeeCrt.EmployeeCreate("test2", "500", "3", "Junior", "test2@mail.com");
    }

    @Test
    public void testLogOff() {
        System.out.println("Testing the Log off operation");
    }

    @Test
    public void testSettings() {
        System.out.println("Testing the settings operation");
    }

    @AfterTest
    public void RunAfterTest() {
        System.out.println("Quitting the webdriver.. ");
        driver.quit();
    }


}
