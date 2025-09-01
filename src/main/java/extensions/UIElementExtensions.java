package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIElementExtensions {


    public static void performEnterText(WebElement locator, String value) {
        locator.click(); // or .submit();
        locator.clear(); // or .submit();
        locator.sendKeys(value);
    }

    public static void performClick(WebElement locator) {
        locator.click();
    }

    public static void performDropDownSelectorByIndex(WebElement locator, String dropDownIndex) {
        Select selectGrade = new Select(locator);
        selectGrade.selectByVisibleText(dropDownIndex);
    }

    public static void performDropDownSelector(WebElement locator, String dropDownValue) {
        Select selectGrade = new Select(locator);
        selectGrade.selectByVisibleText(dropDownValue);
    }
}
