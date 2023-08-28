package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteProductCartPage extends BasePage{
    public DeleteProductCartPage(WebDriver driver){super(driver);}

    By addProductInCart = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void addFirstProduct (){driver.findElement(addProductInCart).click();}
    public void addSecondProduct (){driver.findElement(addProductInCart).click();}

    By enterInCart = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg");
    public void clickCart (){driver.findElement(enterInCart).click();}

    By deleteFirstTowItem = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div:nth-child(1) > div > div:nth-child(5) > button > svg");
    public void clickTrashButton (){driver.findElement(deleteFirstTowItem).click();}
}
