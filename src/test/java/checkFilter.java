import Actions.FilterActions;
import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static PageData.FilterData.*;
import static PageData.LoginData.*;


public class checkFilter extends BrowsActions {
    SoftAssert softAssertions;
    @Test
    @Description("Choose all options from dropdown list and verify last one")
    public void checkFilters() throws InterruptedException {
        LoginActions logIn = new LoginActions(driver);
        logIn.usernameAction(correctUserName);
        logIn.passwordAction(correctPassword);
        logIn.buttonAction();

        softAssertions = new SoftAssert();
        softAssertions.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");


        FilterActions filterItems = new FilterActions(driver);
        filterItems.filterProducts();

        List<WebElement> itemPrices = driver.findElements(By.className("inventory_item_price"));

        for (WebElement priceElement : itemPrices) {
            System.out.println(priceElement.getText());
        }
    }

    @AfterTest
    public void verifySoftAssertions(){
        softAssertions.assertAll();
    }
}
