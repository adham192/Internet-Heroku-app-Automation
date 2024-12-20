package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDeletePage {
    WebDriver driver;
    public AddDeletePage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By addbutton = By.cssSelector("button[onclick='addElement()'");
    private By deletebutton = By.xpath("//button[contains(text(),'Del')]");

    //Actions
    public void clickonaddbutton(){
        driver.findElement(addbutton).click();
    }
    public boolean Deletebuttonisdisplayed(){
        boolean check = driver.findElement(deletebutton).isDisplayed();
        return check;
    }

}
