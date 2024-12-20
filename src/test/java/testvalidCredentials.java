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
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testvalidCredentials extends BaseSteps {
    @org.testng.annotations.Test
    public void testvalidCredential(){
        //driver.findElement(By.linkText("Form Authentication")).click();
        /*String FormAuthentication = "Form Authentication";
        By FormAuthenticationFind = By.linkText(FormAuthentication);
        WebElement FormAuthenticationLink = driver.findElement(FormAuthenticationFind);
        FormAuthenticationLink.click();*/
        LoginPage loginPage = homePage.clickonformauthenticationlink();
        //driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        loginPage.insertUsername("tomsmith");
        //driver.findElement(By.cssSelector("input[id='password']")).sendKeys("SuperSecretPassword!" + Keys.ENTER);
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualresult = secureAreaPage.getValidationMessage();
        String expectedresult = "You logged into a secure area!";
        //assertEquals(actualresult , expectedresult);
        assertTrue(actualresult.contains(expectedresult));
    }
}
