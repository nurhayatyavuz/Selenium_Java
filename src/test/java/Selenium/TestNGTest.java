package Selenium;

import model.CreateEmployee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePages;
import pages.LoginPages;


public class TestNGTest {

    private WebDriver driver;
    private HomePages homePage;
    private LoginPages loginPage;

    @BeforeTest
    public void RunBeforeTest() {
        System.out.println("Executing before every single test...");
        driver = new ChromeDriver();
        driver.navigate().to("http://eaapp.somee.com");
    }

//    @Test
//    public void testLogin() {
//        System.out.println("Testing the login operation");
//        HomePages homePage = new HomePages(driver);
//        loginPage = homePage.clickLogin();
//    }

    @Test
    @Parameters({"UserName","Password"})
    public void testCreateUser(String user,String pass) {
        System.out.println("Testing the Create User operation");
        HomePages homePage = new HomePages(driver);
        loginPage = homePage.clickLogin();
        homePage = loginPage.performLogin(user, pass);
        var employeeList = homePage.clickEmployeelist();
        var employeeCrt = employeeList.clickCreate();
        employeeCrt.EmployeeCreate("test2", "500", "3", "Junior", "test2@mail.com");
    }


    @Test(dataProvider = "CreateEmployee")
    @Parameters({"UserName","Password"})
    public void testDataProviderCreateUser(String name,String salary,String durationWorked,String grade,String email ) {
        System.out.println("Testing the Create User operation");
        HomePages homePage = new HomePages(driver);
        loginPage = homePage.clickLogin();
        homePage = loginPage.performLogin("admin","password");
        var employeeList = homePage.clickEmployeelist();
        var employeeCrt = employeeList.clickCreate();
        employeeCrt.EmployeeCreate(name,salary,durationWorked,grade,email);
    }



    @Test(dataProvider = "CreateEmployeeCustomData")
    public void testCreateEmployeeCustomType (CreateEmployee  createEmployee) {
        System.out.println("Testing the Create User operation");
        HomePages homePage = new HomePages(driver);
        loginPage = homePage.clickLogin();
        homePage = loginPage.performLogin("admin","password");
        var employeeList = homePage.clickEmployeelist();
        var employeeCrt = employeeList.clickCreate();
        employeeCrt.EmployeeCreate(createEmployee.getName(),createEmployee.getSalary(),createEmployee.getDurationWorked(), createEmployee.getGrade(), createEmployee.getEmail());
    }


    @DataProvider(name="CreateEmployee")
    public static Object[][] createEmployeeData(){
        return  new Object[][] {
                new Object[]{
                        "DDTUser","9999","8","Middle","ddtuser@mail.com"
                }
        };
    }
    @DataProvider(name="CreateEmployeeCustomData")
    public static CreateEmployee[] createEmployeeCustomType(){
        return  new CreateEmployee[]{
                new CreateEmployee("FromCustomData","9000","20","Junior","custom@mail.com")
        };
    }

    @Test
    public void testLogOff() {
        System.out.println("Testing the Log off operation");
//        homePage.clickLogOff();
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
