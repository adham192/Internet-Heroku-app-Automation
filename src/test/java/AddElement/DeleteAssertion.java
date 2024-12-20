package AddElement;

import Base.BaseSteps;
import org.openqa.selenium.WebElement;
import pages.AddDeletePage;

import static org.testng.Assert.assertTrue;

public class DeleteAssertion extends BaseSteps {
    @org.testng.annotations.Test
    public void DeleteAssertion(){
        //driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
        AddDeletePage addDeletePage = homePage.clickonAddDeleteElement();
        //driver.findElement(By.cssSelector("button[onclick='addElement()'")).click();
        addDeletePage.clickonaddbutton();
        assertTrue(addDeletePage.Deletebuttonisdisplayed());
    }
}
