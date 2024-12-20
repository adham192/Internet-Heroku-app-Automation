package Base;

import org.testng.annotations.BeforeClass;
import pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSteps {
    public WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        openHome();
    }
    @BeforeMethod
    public void openHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
