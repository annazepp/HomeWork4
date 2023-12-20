
import Pages.CartandCheckoutPage;
import Pages.LoginPage;
import Utils.BrowsActions;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static Pages.CartandCheckoutPage.*;
import static Pages.LoginPage.*;
import static java.lang.Thread.*;

public class firstExercise extends BrowsActions {

    public SoftAssert softAssertions;





        @Test(priority = 1)
        public void signIn () {
             LoginPage step1 = new LoginPage(driver);
             step1.usernameAction(correctUserName);
             step1.passwordAction(correctPassword);
             step1.buttonAction();

        }

        @Test(priority = 2)
        public void addItemsToTheCard () {

            CartandCheckoutPage step2 = new CartandCheckoutPage(driver);
            step2.clickBackpack();
            step2.clickTshirt();;
            softAssertions  = new SoftAssert();
            softAssertions.assertEquals(driver.findElement(By.id("item_4_title_link")).getText(), "Sauce Labs Backpack");
            softAssertions.assertEquals(driver.findElement(By.id("item_3_title_link")).getText(), "Test.allTheThings() T-Shirt (Red)");


        }


        @Test(priority = 3)
        public void checkout () {

            CartandCheckoutPage step3 = new CartandCheckoutPage(driver);
            step3.shoppingCartLink();
            step3.checkoutButton();
            step3.firstNameAction(firstName);
            step3.lastNameAction(lastName);
            step3.postalCodeAction(postalCode);

            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            driver.findElement(By.id("back-to-products")).click();
        }


        @Test(priority = 5)
        public void logOut () throws InterruptedException {
            driver.findElement(By.className("bm-burger-button")).click();
            sleep(3000);

            driver.findElement(By.id("logout_sidebar_link")).click();
        }

        @AfterTest
        public void verifySoftAssertions(){
            softAssertions.assertAll();
        }


    }



