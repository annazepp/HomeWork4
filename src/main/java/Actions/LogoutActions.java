package Actions;

import PageObjects.LogoutObjects;
import org.openqa.selenium.WebDriver;

public class LogoutActions extends LogoutObjects {
    WebDriver driver;

    public LogoutActions(WebDriver driver1){driver=driver1;}

    public void  burgerIconAction() {driver.findElement(burgerMenuIcon).click();}
    public void logoutAction(){driver.findElement(logoutIcon).click();}
}
