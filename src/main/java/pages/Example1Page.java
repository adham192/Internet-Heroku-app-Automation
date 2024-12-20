package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {
    WebDriver driver;
    WebDriverWait wait;
    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By startbutton = By.xpath("//div[@id='start']//button");
    private By validationmessage = By.cssSelector("#finish h4");


    //actions
    public void clickonStartButton(){
        driver.findElement(startbutton).click();
    }
    public String GetValidationMessage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(validationmessage)));
        return driver.findElement(validationmessage).getText();
    }
}
