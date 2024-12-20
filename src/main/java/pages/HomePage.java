package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    //locators
    private By formauthentication = By.linkText("Form Authentication");
    private By forgotpassword = By.xpath("//a[contains(text(),'Forg')]");
    private By AddDeleteelement =  By.xpath("//a[contains(text(),'Add')]");
    private By DynamicLoading = By.xpath("//a[contains(text(),'Dynamic L')]");
    private By JSAlerts = By.xpath("//a[contains(text(),'JavaScript A')]");
    private By DropDown = By.linkText("Dropdown");


    //Actions
    public LoginPage clickonformauthenticationlink(){
        driver.findElement(formauthentication).click();
        return new LoginPage(driver);
    }
    public ForgotPasswordPage clickonforgotpasswordlink(){
        driver.findElement(forgotpassword).click();
        return new ForgotPasswordPage(driver);
    }
    public AddDeletePage clickonAddDeleteElement(){
        driver.findElement(AddDeleteelement).click();
        return new AddDeletePage(driver);
    }
    public DynamicLoadingPage clickonDynamicLoadingPage(){
        driver.findElement(DynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }
    public JSAlertsPage clickOnJSAlerts(){
        driver.findElement(JSAlerts).click();
        return new JSAlertsPage(driver);
    }
    public DropdownPage clickOnDropdown(){
        driver.findElement(DropDown).click();
        return new DropdownPage(driver);
    }

}
