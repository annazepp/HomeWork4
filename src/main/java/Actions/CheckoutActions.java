package Actions;

import PageObjects.CheckoutObjects;
import org.openqa.selenium.WebDriver;

public class CheckoutActions extends CheckoutObjects {

    WebDriver driver;
    public CheckoutActions(WebDriver driver1){
        driver = driver1;
    }

    public void shoppingCartLink(){
        driver.findElement(shoppingCartLink).click();
    }

    public void checkoutButton(){
        driver.findElement(checkoutButton).click();
    }

    public void firstNameAction (String firstname){driver.findElement(checkoutFirstName).sendKeys(firstname);}

    public void lastNameAction (String lastname){driver.findElement(checkoutLastName).sendKeys(lastname);}

    public void postalCodeAction (String postalcode){driver.findElement(checkoutPostalCode).sendKeys(postalcode);}

    public void continueButton (){driver.findElement(checkoutContinue).click();}

    public void checkoutFinish(){driver.findElement(checkoutFinishButton).click();}

    public void backToProductsAction(){driver.findElement(backToProductsButton).click();}

}
