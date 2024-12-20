package DropDownList;

import Base.BaseSteps;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class TestSelectOption2 extends BaseSteps {
    @Test
    public void Option2VisibleText(){
        DropdownPage dropdownPage = homePage.clickOnDropdown();
        dropdownPage.selectByVisibleText("Option 2");
    }
}
