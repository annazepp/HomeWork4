import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSel {
    @Test(dataProvider = "loginData")

        public void login(String email, String password, boolean success) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        sleep(1000);
        driver.quit();
        }

        @DataProvider
        public Object [][] loginData(){
        Object[][] data = new Object[3][3];

            data [0] [0] = "standard_user";		data [0] [1] = "secret_sauce";			data [0] [2] = true;
            data [1] [0] = "locked_out_user";							data [1] [1] = "secret_sauce";			data [1] [2] = false;
            data [2] [0] = "error_user";			data [2] [1] = "secret_sauce";				data [2] [2] = false;

            return data;


        }
}