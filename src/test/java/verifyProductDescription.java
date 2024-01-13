import Actions.CartActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static PageData.LoginData.*;
import static java.lang.Thread.sleep;

public class verifyProductDescription extends BrowsActions {
    SoftAssert softAssertions;

    @Test
    @Description("Verify that product description matches outside and inside the product for problem user")
    public void verifyProductDetails() throws InterruptedException {

        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(problemUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();


        CartActions viewProduct = new CartActions(driver);
        String productDescriptionOutside= driver.findElement(By.className("inventory_item_desc")).getText();
        viewProduct.clickBackpackForProblemUser();

        sleep(5000);
        softAssertions = new SoftAssert();

        String productDescriptionInside = driver.findElement(By.cssSelector("div.inventory_details_desc")).getText();

        softAssertions.assertEquals(productDescriptionInside, productDescriptionOutside);


    }

    @Test
    @Description("Verify that product description matches outside and inside the product for normal user")
    public void verifyProductDetailsNormalUser() throws InterruptedException {

        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(correctUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();


        CartActions viewProduct = new CartActions(driver);
        String productNameOutside= driver.findElement(By.className("inventory_item_name")).getText();
        viewProduct.clickBackpackForProblemUser();

        sleep(5000);
        softAssertions = new SoftAssert();

        String productNameInside = driver.findElement(By.cssSelector("div.inventory_details_name")).getText();

        softAssertions.assertEquals(productNameInside, productNameOutside);


    }

    @AfterTest
    public void verifySoftAssertions(){
        softAssertions.assertAll();
    }



}
