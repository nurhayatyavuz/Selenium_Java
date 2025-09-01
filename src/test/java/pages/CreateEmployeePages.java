package pages;

import extensions.UIElementExtensions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployeePages {

    private  WebDriver driver;
    public CreateEmployeePages(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="Name")
    private WebElement txtUserName;

    @FindBy(id="Salary")
    private WebElement txtSalary;

    @FindBy(id="DurationWorked")
    private WebElement txtDurationWorked;

    @FindBy(id="Grade")
    private WebElement ddlGrade;

    @FindBy(id="Email")
    private WebElement txtEmail;

    @FindBy(css=".btn")
    private WebElement btnCreate;


    public EmployeeListPages EmployeeCreate(String name,String salary,String durationWorked,String grade,String email){
        UIElementExtensions.performEnterText(txtUserName,name);
        UIElementExtensions.performEnterText(txtSalary,salary);
        UIElementExtensions.performEnterText(txtDurationWorked,durationWorked);
        UIElementExtensions.performDropDownSelector(ddlGrade,grade);
        UIElementExtensions.performEnterText(txtEmail,email);
        UIElementExtensions.performClick(btnCreate);
        return new EmployeeListPages(driver);
    }
}
