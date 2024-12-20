package ForgotPassword;

import Base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.ForgotPasswordPage;
import pages.internalservererror;

import static org.testng.Assert.assertTrue;

public class testforgotpassword extends BaseSteps {
    @org.testng.annotations.Test
    public void testforgetpassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickonforgotpasswordlink();
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc" + Keys.ENTER);
        forgotPasswordPage.writeemail("abc");
        internalservererror internalServerError = forgotPasswordPage.clickonretrievepasswordbutton();
        String actualresult = internalServerError.getservererrormessage();
        String expectedresult = "Internal Server Error";
        assertTrue(actualresult.contains(expectedresult));
    }
}
