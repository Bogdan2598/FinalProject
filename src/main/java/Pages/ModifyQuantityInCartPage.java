package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyQuantityInCartPage extends BasePage {
    public ModifyQuantityInCartPage(WebDriver driver){super(driver);}

    By RefinedFrozenMouse = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg");
    public void clicktoCarticon(){driver.findElement(RefinedFrozenMouse).click();}

    By CartPage = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path");
    public void clickCartPage(){driver.findElement(CartPage).click();}

    By PlusButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(1) > div > button:nth-child(2) > svg");
    public void PlusQuatity(){driver.findElement(PlusButton).click();}
}
