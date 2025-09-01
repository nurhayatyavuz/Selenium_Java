package pages;

import extensions.UIElementExtensions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePages {

    private final WebDriver driver;

    public HomePages(WebDriver driver) {
        this.driver = driver;

        // Use an explicit wait to ensure the "Employee List" link is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Employee List")));

        // Now that the page is loaded, initialize the elements
        PageFactory.initElements(driver, this);
    }

    // Locator for Login
    @FindBy(linkText = "Login")
    private WebElement lnkLogin;

    // Locator for EmployeeList
    @FindBy(linkText = "Employee List")
    private WebElement lnkEmployeeList;

    public LoginPages clickLogin() {
        UIElementExtensions.performClick(lnkLogin);
        return new LoginPages(driver);
    }

    public EmployeeListPages clickEmployeelist() {
        UIElementExtensions.performClick(lnkEmployeeList);
        return new EmployeeListPages(driver);
    }
}