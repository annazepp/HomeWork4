package Actions;

import PageObjects.LoginObjects;
import org.openqa.selenium.WebDriver;

public class LoginActions extends LoginObjects {
    WebDriver driver;

    public LoginActions(WebDriver driver1){
        driver = driver1;
    }
    public void usernameAction(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void passwordAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void buttonAction(){
        driver.findElement(loginButton).click();
    }
}
