package Actions;

import PageObjects.LogoutObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LogoutActions extends LogoutObjects {
    WebDriver driver;

    public LogoutActions(WebDriver driver1){driver=driver1;}

    @Step("Click on burger menu button")
    public void  burgerIconAction() {driver.findElement(burgerMenuIcon).click();}

    @Step("Click on logout button")
    public void logoutAction(){driver.findElement(logoutIcon).click();}
}
