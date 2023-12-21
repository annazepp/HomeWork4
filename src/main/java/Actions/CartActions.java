package Actions;

import PageObjects.AddToTheCartObjects;
import org.openqa.selenium.WebDriver;

public class CartActions extends AddToTheCartObjects {
    WebDriver driver;
    public CartActions(WebDriver driver1){
        driver = driver1;
    }


    public void clickBackpack() {
        driver.findElement(backpack).click();
    }

    public void clickTshirt (){
        driver.findElement(tshirt).click();
    }
}
