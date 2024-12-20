package JSAlerts;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class CancelAlertMessage extends BaseSteps {
    @Test
    public void TestCancelAlertMessage(){
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlerts();
        jsAlertsPage.clickOnJSConfirmButton();
        jsAlertsPage.CancelAlertMessage();
        String actualresult = jsAlertsPage.GetValidationMessage();
        String expectedresult = "You clicked: Cancel";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }
}
