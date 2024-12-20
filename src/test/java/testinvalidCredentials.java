import Base.BaseSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;
public class testinvalidCredentials extends BaseSteps{
    private static final Logger log = LoggerFactory.getLogger(testinvalidCredentials.class);

    @org.testng.annotations.Test
    public void testinvalidCredential() {
        //driver.findElement(By.linkText("Form Authentication")).click();
        /*String FormAuthentication = "Form Authentication";
        By FormAuthenticationFind = By.linkText(FormAuthentication);
        WebElement FormAuthenticationLink = driver.findElement(FormAuthenticationFind);
        FormAuthenticationLink.click();*/
        LoginPage loginpage = homePage.clickonformauthenticationlink();
        //driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("tomsmith8");
        loginpage.insertUsername("tomsmith8");
        //driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("SuperSecretPassword!" + Keys.ENTER);
        loginpage.insertPassword("SuperSecretPassword!");
        loginpage.clickOnLoginButton();
        String actualresult = loginpage.usernameisinvalidmessage();
        String expectedresult = "Your username is invalid!";
        assertTrue(actualresult.contains(expectedresult));
    }
}
