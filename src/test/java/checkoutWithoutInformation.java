import Actions.CheckoutActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static PageData.LoginData.correctPassword;
import static PageData.LoginData.correctUserName;

public class checkoutWithoutInformation extends BrowsActions {

    SoftAssert softAssertions;

    @Test
    @Description("Checkout without fill in information")
    public void checkoutWithoutInformation(){
        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(correctUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();

        CheckoutActions checkoutWithoutInformation = new CheckoutActions(driver);
        checkoutWithoutInformation.shoppingCartLink();
        checkoutWithoutInformation.checkoutButton();
        checkoutWithoutInformation.continueButton();

        softAssertions = new SoftAssert();
        String missingInformationErrorActual = driver.findElement(By.xpath("//h3[contains(., 'Error: First Name is required')]")).getText();
        softAssertions.assertEquals(missingInformationErrorActual, "Error: First Name is required");

    }

    @AfterTest
    public void verifySoftAssertions(){
        softAssertions.assertAll();
    }
}
