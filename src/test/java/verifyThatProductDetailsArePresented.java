import Actions.CartActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static PageData.LoginData.*;
import static java.lang.Thread.sleep;
import static org.testng.Assert.*;

public class verifyThatProductDetailsArePresented extends BrowsActions {



    @Test
    public void verifyThatProductDetailsArePresented() throws InterruptedException {
        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(correctUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();

        CartActions viewProduct = new CartActions(driver);
        viewProduct.openProduct();
        sleep(8000);

        WebElement productTitle = driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
        assertTrue(productTitle.isDisplayed(), "Product title is presented");

    }
}
