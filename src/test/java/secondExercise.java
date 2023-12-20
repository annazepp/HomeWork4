import DataObject.LoginData;
import Utils.BrowsActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.*;
import java.time.Duration;

import static DataObject.LoginData.*;
import static java.lang.Thread.sleep;

public class secondExercise extends BrowsActions {


    @Test
    public void loginWithInvalidCredentials() throws InterruptedException {

        LoginData incorrect1 = new LoginData(driver);
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
