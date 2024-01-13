package PageObjects;

import org.openqa.selenium.By;

public class CheckoutObjects {

    protected By
            shoppingCartLink = By.className("shopping_cart_link"),
            checkoutButton = By.xpath("//button[@id='checkout']"),
            checkoutFirstName = By.xpath("//input[@id='first-name']"),
            checkoutLastName = By.xpath("//input[@id='last-name']"),
            checkoutPostalCode = By.xpath("//input[@id='postal-code']"),

            checkoutContinue =  By.id("continue"),
    checkoutFinishButton = By.id("finish"),
    backToProductsButton = By.id("back-to-products"),
    deleteButton = By.xpath("//button[@name='remove-sauce-labs-backpack']");
}
