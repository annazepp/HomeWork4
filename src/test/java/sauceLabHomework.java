import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class sauceLabHomework {

    @Test
    public void loginWithInvalidCredentils() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='submit-button btn_action' and @id='login-button']")).click();

       sleep(3000);

       WebElement errorMessage = driver.findElement(By.className("error-message-container"));
          String actualColor = errorMessage.getCssValue("background-color");
          String actualColorHex = Color.fromString(actualColor).asHex();
         String expectedErrorBackgroundColor = "#e2231a";
          Assert.assertEquals(actualColorHex,expectedErrorBackgroundColor);


        System.out.println("first");

        driver.quit();

   }


   @Test
    public void loginwithvalidcreds() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




            WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name' and @placeholder='Username']"));
            usernameField.sendKeys("standard_user");

            WebElement passwordField = driver.findElement(By.xpath("//input[@id='password' and @placeholder='Password']"));
            passwordField.sendKeys("secret_sauce");

            driver.findElement(By.id("login-button")).click();

            System.out.println("sign in worked correct");


            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            String actualBackpack = driver.findElement(By.id("item_4_title_link")).getText();
            String expectedBackpack = "Sauce Labs Backpack";
            Assert.assertEquals(expectedBackpack, actualBackpack);
            driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
            String actualTshirt = driver.findElement(By.id("item_3_title_link")).getText();
            String expectedTshirt = "Test.allTheThings() T-Shirt (Red)";
            Assert.assertEquals(actualTshirt, expectedTshirt);



            driver.findElement(By.className("shopping_cart_link")).click();
            driver.findElement(By.xpath("//button[@id='checkout']")).click();
            driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("test");
            driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("test");
            driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1234");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            driver.findElement(By.id("back-to-products")).click();



            By sortProduct = By.className("product_sort_container");
            driver.findElement(sortProduct).click();

            Select selectFormList = new Select(driver.findElement(sortProduct));
            int sizeofList = selectFormList.getOptions().size();


            for (int i = 0; i < sizeofList; i++) {
                selectFormList = new Select(driver.findElement(sortProduct));
                selectFormList.selectByIndex(i);

                sleep(3000);

        }



            driver.findElement(By.className("bm-burger-button")).click();
            sleep(3000);

            driver.findElement(By.id("logout_sidebar_link")).click();


            driver.quit();

            System.out.println("second");

       }

   }

