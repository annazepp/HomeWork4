package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public static String
    correctUserName = "standard_user",
    correctPassword = "secret_sauce",
    incorrectUserName = "locked_out_user",
    incorrectPassword  = "secret_sauce";

    protected By
            usernameField = By.xpath("//input[@id='user-name' and @placeholder='Username']"),
            passwordField = By.xpath("//input[@id='password' and @placeholder='Password']"),
            loginButton = By.id("login-button");


    public LoginPage(WebDriver driver1){
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
