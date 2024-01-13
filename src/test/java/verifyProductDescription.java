import Actions.CartActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

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

    @AfterTest
    public void verifySoftAssertions(){
        softAssertions.assertAll();
    }



}
