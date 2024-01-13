import Actions.CartActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static PageData.LoginData.*;
import static java.lang.Thread.sleep;

public class verifyThatProductDetailsArePresented extends BrowsActions {



    @Test
    @Description("verify that roduct details like description is presented after open item")
    public void verifyThatProductDetailsArePresented() throws InterruptedException {
        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(correctUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();



        sleep(8000);
        CartActions viewProduct = new CartActions(driver);
        viewProduct.openProduct();
        sleep(8000);

        String productTitle = driver.findElement(By.cssSelector("div.inventory_details_name")).getText();
        Assert.assertNotNull(productTitle);
        System.out.println(productTitle);

        String productDescription = driver.findElement(By.cssSelector("div.inventory_details_desc")).getText();
        Assert.assertNotNull(productDescription);
        System.out.println(productDescription);

    }
}
