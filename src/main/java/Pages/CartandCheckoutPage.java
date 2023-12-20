package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartandCheckoutPage {
    WebDriver driver;

    public static String

    firstName = "test",
    lastName = "test",
    postalCode= "1234";

   public static By
        backpack = By.id("add-to-cart-sauce-labs-backpack"),
        tshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)"),
        shoppingCartLink = By.className("shopping_cart_link"),
        checkoutButton = By.xpath("//button[@id='checkout']"),
        checkoutFirstName = By.xpath("//input[@id='first-name']"),
           checkoutLastName = By.xpath("//input[@id='last-name']"),
           checkoutPostalCode = By.xpath("//input[@id='postal-code']");







    public CartandCheckoutPage(WebDriver driver2){
        driver = driver2;
    }


    public void clickBackpack() {
        driver.findElement(backpack).click();
    }

    public void clickTshirt (){
        driver.findElement(tshirt).click();
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


}
