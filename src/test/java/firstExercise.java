
import DataObject.LoginData;
import Utils.BrowsActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static DataObject.LoginData.*;
import static java.lang.Thread.*;

public class firstExercise extends BrowsActions {

//    public SoftAssert softAssertions;





        @Test(priority = 1)
        public void signIn () {
             LoginData step1 = new LoginData(driver);
             step1.usernameAction(correctUserName);
             step1.passwordAction(correctPassword);
             step1.buttonAction();

        }

//        @Test(priority = 2)
//        public void addItemsToTheCard () {
//            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//            softAssertions  = new SoftAssert();
//            String expectedBackpack = "Sauce Labs Backpack";
//            softAssertions.assertEquals(driver.findElement(By.id("item_4_title_link")).getText(), expectedBackpack);
//
//            driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//            String expectedTshirt = "Test.allTheThings() T-Shirt (Red)";
//            softAssertions.assertEquals(driver.findElement(By.id("item_3_title_link")).getText(), expectedTshirt);
//
//
//        }
//
//
//        @Test(priority = 3)
//        public void checkout () {
//            driver.findElement(By.className("shopping_cart_link")).click();
//            driver.findElement(By.xpath("//button[@id='checkout']")).click();
//            driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("test");
//            driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("test");
//            driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1234");
//            driver.findElement(By.id("continue")).click();
//            driver.findElement(By.id("finish")).click();
//            driver.findElement(By.id("back-to-products")).click();
//        }
//
//        @Test(priority = 4)
//        public void checkFilters () throws InterruptedException {
//            By sortProduct = By.className("product_sort_container");
//            driver.findElement(sortProduct).click();
//
//            Select selectFormList = new Select(driver.findElement(sortProduct));
//            int sizeofList = selectFormList.getOptions().size();
//
//
//            for (int i = 0; i < sizeofList; i++) {
//                selectFormList = new Select(driver.findElement(sortProduct));
//                selectFormList.selectByIndex(i);
//
//                sleep(3000);
//            }
//
//        }
//
        @Test(priority = 5)
        public void logOut () throws InterruptedException {
            driver.findElement(By.className("bm-burger-button")).click();
            sleep(3000);

            driver.findElement(By.id("logout_sidebar_link")).click();
        }

//        @AfterTest
//        public void verifySoftAssertions(){
//            softAssertions.assertAll();
//        }


    }



