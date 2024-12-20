package DropDownList;

import Base.BaseSteps;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class TestSelectOption1 extends BaseSteps {
    @Test
    public void Option1VisibleText(){
        DropdownPage dropdownPage = homePage.clickOnDropdown();
        dropdownPage.selectByVisibleText("Option 1");
    }
}
