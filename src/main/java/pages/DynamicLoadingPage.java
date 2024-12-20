package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By Example1 = By.partialLinkText("Example 1");


    //Actions
    public Example1Page clickonExample1(){
        driver.findElement(Example1).click();
        return new Example1Page(driver);
    }
}
