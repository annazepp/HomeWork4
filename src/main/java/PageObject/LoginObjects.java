package PageObject;

import org.openqa.selenium.By;

public class LoginObjects {
    protected By
        usernameField = By.xpath("//input[@id='user-name' and @placeholder='Username']"),
        passwordField = By.xpath("//input[@id='password' and @placeholder='Password']"),
    loginButton = By.id("login-button");

}
