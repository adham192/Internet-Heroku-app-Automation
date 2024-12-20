package JSAlerts;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class SendKeysToAlertMessage extends BaseSteps {
    @Test
    public void TestSendKeysToAlertMessage(){
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlerts();
        jsAlertsPage.clickOnJSPrompt();
        jsAlertsPage.SendKeysToAlertMessage();
        String actualresult = jsAlertsPage.GetValidationMessage();
        String expectedresult = "You entered: Adham";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }
}
