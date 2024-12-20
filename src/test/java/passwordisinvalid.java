import Base.BaseSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class passwordisinvalid extends BaseSteps {
    @org.testng.annotations.Test
    public void testinvalidCredential() {
        //driver.findElement(By.linkText("Form Authentication")).click();
        /*String FormAuthentication = "Form Authentication";
        By FormAuthenticationFind = By.linkText(FormAuthentication);
        WebElement FormAuthenticationLink = driver.findElement(FormAuthenticationFind);
        FormAuthenticationLink.click();*/
        LoginPage loginpage = homePage.clickonformauthenticationlink();
        //driver.findElement(By.cssSelector("input[id='username']")).sendKeys("tomsmith");
        loginpage.insertUsername("tomsmith");
        //driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword" + Keys.ENTER);
        loginpage.insertPassword("SuperSecretPassword");
        loginpage.clickOnLoginButton();
        String actualresult = loginpage.passwordinvalidmessage();
        String expectedresult = "Your password is invalid!";
        assertTrue(actualresult.contains(expectedresult));
    }
}
