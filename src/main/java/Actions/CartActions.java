package Actions;

import PageObjects.AddToTheCartObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CartActions extends AddToTheCartObjects {
    WebDriver driver;
    public CartActions(WebDriver driver1){
        driver = driver1;
    }


    @Step("Add backpack product to the cart")
    public void clickBackpack() {
        driver.findElement(backpack).click();
    }

    @Step("Add Tshirt product to the cart")
    public void clickTshirt (){
        driver.findElement(tshirt).click();
    }

    @Step("Add backpack to the card for problem user")
    public void clickBackpackForProblemUser() {
        driver.findElement(backpackFroProblemUser).click();
    }

    @Step("Open product")
    public void openProduct(){
        driver.findElement(backpackOpen).click();
    }
}
