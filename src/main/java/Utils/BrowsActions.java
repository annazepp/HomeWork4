package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.time.Duration;

public class BrowsActions {

    public static WebDriver driver;

    @BeforeClass
    public void openBrowser () {
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @AfterClass
    public void closeBrowser () {
        driver.close();
    }

}
