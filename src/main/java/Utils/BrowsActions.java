package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BrowsActions {

    public static WebDriver driver = new FirefoxDriver();

    @BeforeSuite
    public void openBrowser () {
//        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @AfterSuite
    public void closeBrowser () {
        driver.close();
    }

}
