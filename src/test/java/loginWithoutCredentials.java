import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static PageData.LoginData.withoutPassword;
import static PageData.LoginData.withoutUserName;
import static java.lang.Thread.sleep;

public class loginWithoutCredentials extends BrowsActions {

    SoftAssert softAssertions;

    @Test
    @Description("login without credentials")
    public void loginWithoutCredentials() throws InterruptedException {
        LoginActions withoutCredentials = new LoginActions(driver);
        withoutCredentials.usernameAction(withoutUserName);
        withoutCredentials.passwordAction(withoutPassword);
        withoutCredentials.buttonAction();


        sleep(5000);


        softAssertions = new SoftAssert();
        String errorActual = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        softAssertions.assertEquals(errorActual, "Epic sadface: Username is required");

    }

    @AfterTest
    public void verifySoftAssertions(){
        softAssertions.assertAll();
    }

}
