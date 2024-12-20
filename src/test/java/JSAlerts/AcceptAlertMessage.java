package JSAlerts;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class AcceptAlertMessage extends BaseSteps {
    @Test
    public void testAcceptAlertMessage(){
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlerts();
        jsAlertsPage.clickOnJSAlertButton();
        jsAlertsPage.AcceptAlertMessage();
        String actualresult = jsAlertsPage.GetValidationMessage();
        String expectedresult = "You successfully clicked an alert";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }
}
