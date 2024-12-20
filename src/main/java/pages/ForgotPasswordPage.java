package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By insertemail = By.xpath("//input[@type='text']");
    private By retrievepasswordbutton = By.cssSelector(".radius");

    //Actions
    public void writeemail(String email){
        driver.findElement(insertemail).sendKeys(email);
    }
    public internalservererror clickonretrievepasswordbutton(){
        driver.findElement(retrievepasswordbutton).click();
        return new internalservererror(driver);
    }
}
