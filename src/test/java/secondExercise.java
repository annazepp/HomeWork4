import Actions.LoginActions;
import Utils.BrowsActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.*;

import static PageData.LoginData.*;
import static java.lang.Thread.sleep;

public class secondExercise extends BrowsActions {


    @Test
    public void loginWithInvalidCredentials() throws InterruptedException {

        LoginActions incorrect1 = new LoginActions(driver);
        incorrect1.usernameAction(incorrectUserName);
        incorrect1.passwordAction(incorrectPassword);
        incorrect1.buttonAction();


        sleep(3000);

        WebElement errorMessage = driver.findElement(By.className("error-message-container"));
        String actualColor = errorMessage.getCssValue("background-color");
        String actualColorHex = Color.fromString(actualColor).asHex();
        String expectedErrorBackgroundColor = "#e2231a";
        Assert.assertEquals(actualColorHex,expectedErrorBackgroundColor);

    }

}
