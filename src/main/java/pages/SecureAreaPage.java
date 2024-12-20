package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By secureareapage = By.xpath("//div[@class = 'flash success']");

    //Actions
    public String getValidationMessage(){
        String Text = driver.findElement(secureareapage).getText();
        return Text;
    }

}
