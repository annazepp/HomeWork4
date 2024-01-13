package Actions;

import PageObjects.LoginObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginActions extends LoginObjects {
    WebDriver driver;

    public LoginActions(WebDriver driver1){
        driver = driver1;
    }

    @Step("Enter Username")
    public void usernameAction(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    @Step("Enter password")
    public void passwordAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("Click login buton")
    public void buttonAction(){
        driver.findElement(loginButton).click();
    }
}
