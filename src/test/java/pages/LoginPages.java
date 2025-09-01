package pages;



import extensions.UIElementExtensions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class LoginPages {



    private WebDriver driver;



    public LoginPages(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }



    @FindBy(name = "UserName")

    private WebElement txtUserName;

    @FindBy(name = "Password")

    private WebElement txtPassword;

    @FindBy(css=".btn")

    private WebElement btnLogin;



    public HomePages performLogin (String userName,String password){

        UIElementExtensions.performEnterText(txtUserName,userName);
        UIElementExtensions.performEnterText(txtPassword,password);
        UIElementExtensions.performClick(btnLogin);
        return new HomePages(driver);



    }

}