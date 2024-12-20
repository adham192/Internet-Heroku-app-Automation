package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    WebDriver driver;
    public JSAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By JSAlert = By.xpath("//button[@onclick = 'jsAlert()']");
    private By result = By.cssSelector("#result");
    private By JSConfirm = By.xpath("//button[contains(text(),'Click for JS C')]");
    private By JSPrompt = By.xpath("//button[contains(text(),'Click for JS P')]");



    //Actions
    public void clickOnJSAlertButton(){
        driver.findElement(JSAlert).click();
    }
    public void AcceptAlertMessage(){
        driver.switchTo().alert().accept();
    }
    public void clickOnJSConfirmButton(){
        driver.findElement(JSConfirm).click();
    }
    public void CancelAlertMessage(){
        driver.switchTo().alert().dismiss();
    }
    public void clickOnJSPrompt(){
        driver.findElement(JSPrompt).click();
    }
    public void SendKeysToAlertMessage(){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Adham");
        alert.accept();
    }
    public String GetValidationMessage(){
        return driver.findElement(result).getText();
    }
}
