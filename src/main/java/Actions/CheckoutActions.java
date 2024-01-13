package Actions;

import PageObjects.CheckoutObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CheckoutActions extends CheckoutObjects {

    WebDriver driver;
    public CheckoutActions(WebDriver driver1){
        driver = driver1;
    }

    @Step("Click on shopping cart button")
    public void shoppingCartLink(){
        driver.findElement(shoppingCartLink).click();
    }

    @Step("Click on checkout button")
    public void checkoutButton(){
        driver.findElement(checkoutButton).click();
    }

    @Step("Enter first name")
    public void firstNameAction (String firstname){driver.findElement(checkoutFirstName).sendKeys(firstname);}

    @Step("Enter last name")
    public void lastNameAction (String lastname){driver.findElement(checkoutLastName).sendKeys(lastname);}


    @Step("Enter postalCode")
    public void postalCodeAction (String postalcode){driver.findElement(checkoutPostalCode).sendKeys(postalcode);}

    @Step("Click continue button to continue checkout process")
    public void continueButton (){driver.findElement(checkoutContinue).click();}

    @Step("Click checkout finish button")
    public void checkoutFinish(){driver.findElement(checkoutFinishButton).click();}

    @Step("Go back to the products page")
    public void backToProductsAction(){driver.findElement(backToProductsButton).click();}


    @Step("delete item from the cart")
    public void deleteItemFromCart(){
        driver.findElement(deleteButton).click();
    }

}
