
import Actions.CartActions;
import Actions.CheckoutActions;
import Actions.LoginActions;
import Actions.LogoutActions;
import Utils.BrowsActions;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static PageData.CheckoutData.*;
import static PageData.LoginData.*;
import static java.lang.Thread.*;

public class firstExercise extends BrowsActions {

    public SoftAssert softAssertions;





        @Test(priority = 1)
        public void signIn () {
             LoginActions step1 = new LoginActions(driver);
             step1.usernameAction(correctUserName);
             step1.passwordAction(correctPassword);
             step1.buttonAction();

        }

        @Test(priority = 2)
        public void addItemsToTheCard () {

            CartActions step2 = new CartActions(driver);
            step2.clickBackpack();
            step2.clickTshirt();
            softAssertions  = new SoftAssert();
            softAssertions.assertEquals(driver.findElement(By.id("item_4_title_link")).getText(), "Sauce Labs Backpack");
            softAssertions.assertEquals(driver.findElement(By.id("item_3_title_link")).getText(), "Test.allTheThings() T-Shirt (Red)");


        }


        @Test(priority = 3)
        public void checkout () {

            CheckoutActions step3 = new CheckoutActions(driver);
            step3.shoppingCartLink();
            step3.checkoutButton();
            step3.firstNameAction(firstName);
            step3.lastNameAction(lastName);
            step3.postalCodeAction(postalCode);
            step3.continueButton();
            step3.checkoutFinish();
            step3.backToProductsAction();
        }


        @Test(priority = 5)
        public void logOut () throws InterruptedException {

            LogoutActions step4 = new LogoutActions(driver);
            step4.burgerIconAction();
            sleep(3000);
            step4.logoutAction();
        }

        @AfterTest
        public void verifySoftAssertions(){
            softAssertions.assertAll();
        }


    }



