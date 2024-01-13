package Actions;

import PageObjects.FilterObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class FilterActions extends FilterObjects {

    WebDriver driver;

    public FilterActions(WebDriver driver1){driver=driver1;}


    @Step("Choose  each possible option from dropdown list")
   public void filterProducts() throws InterruptedException {
       By sortProduct = By.className("product_sort_container");
       driver.findElement(sortProduct).click();

       Select selectFormList = new Select(driver.findElement(sortProduct));
       int sizeofList = selectFormList.getOptions().size();


       for (int i = 0; i < sizeofList; i++) {
           selectFormList = new Select(driver.findElement(sortProduct));
           selectFormList.selectByIndex(i);

           sleep(3000);
       }

   }

}
