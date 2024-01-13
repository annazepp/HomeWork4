import Actions.CartActions;
import Actions.CheckoutActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static PageData.LoginData.*;

public class deleteItemFromTheCart extends BrowsActions {


    @Test
    @Description("Delete item from the cart and verify that it no longer presented")
    public void deleteItem(){
        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(correctUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();



        CartActions deleteItem = new CartActions(driver);
        deleteItem.clickBackpack();

        CheckoutActions goToCart = new CheckoutActions(driver);
        goToCart.shoppingCartLink();
        goToCart.deleteItemFromCart();

        try {
            WebElement cartItem = driver.findElement(By.className("cart-item"));
            Assert.fail("Element 'cart-item' is still present in the cart");
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true, "Element 'cart-item' is not present in the cart");
        }
    }


}
