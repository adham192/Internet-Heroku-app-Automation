package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By insertusername = By.cssSelector("#username");
    private By insertpassword = By.cssSelector("input[id='password']");
    private By loginbutton = By.cssSelector(".radius");
    private By invalidusername = By.xpath("//div[contains(text(),'Your')]");
    private By invalidpassword = By.cssSelector(".flash.error");

    //Actions
    public void insertUsername(String username){
        driver.findElement(insertusername).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(insertpassword).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginbutton).click();
        return new SecureAreaPage(driver);
    }
    public String usernameisinvalidmessage(){
        String invalidusernamemessage = driver.findElement(invalidusername).getText();
        return invalidusernamemessage;
    }
    public String passwordinvalidmessage(){
        String invalidpasswordmessage = driver.findElement(invalidpassword).getText();
        return invalidpasswordmessage;
    }
}
