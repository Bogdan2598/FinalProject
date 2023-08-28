package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuestUserBuyProductPage extends BasePage{
    public GuestUserBuyProductPage(WebDriver driver){super(driver);}

    By searchProduct = By.id("input-search");
    public void metalMouse (){driver.findElement(searchProduct).click();}
    public void searchMouse (){driver.findElement(searchProduct).sendKeys("Practical");}

    By submitSearch = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.justify-content-end.row > form > div:nth-child(1) > button");
    public void enterSearch (){driver.findElement(submitSearch).click();}

    By accessProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div/div[1]/a");
    public void accessProduct (){driver.findElement(accessProduct).click();}

    By addProductInCart = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg");
    public void productInCart (){driver.findElement(addProductInCart).click();}

    By checkCart = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg");
    public void viewCart (){driver.findElement(checkCart).click();}
}
