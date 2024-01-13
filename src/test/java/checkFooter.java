import Actions.LoginActions;
import Utils.BrowsActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static PageData.LoginData.*;
import static java.lang.Thread.sleep;

public class checkFooter extends BrowsActions {


    @Test
    @Description("check that footer is presented")
   public void checkFooter() throws InterruptedException {
       LoginActions logIn = new LoginActions(driver);
       logIn.usernameAction(correctUserName);
       logIn.passwordAction(correctPassword);
       logIn.buttonAction();

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1500)");

       sleep(5000);


        WebElement footerElem = driver.findElement(By.className("footer"));
        Assert.assertNotNull(footerElem);

   }



}
