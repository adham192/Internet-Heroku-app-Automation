package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class internalservererror {
    WebDriver driver;
    public internalservererror(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By servererrormessage = By.xpath("//h1[contains(text(),'I')]");

    //Actions
    public String getservererrormessage(){
        String errormessage = driver.findElement(servererrormessage).getText();
        return errormessage;
    }

}
