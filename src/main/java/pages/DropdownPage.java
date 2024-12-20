package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    Select select;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By dropdownlist= By.id("dropdown");


    //Actions
    public void selectByVisibleText(String visibletext){
        select = new Select(driver.findElement(dropdownlist));
        select.selectByVisibleText(visibletext);
    }
}
