package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TotalCartSumPage extends BasePage{
    public TotalCartSumPage(WebDriver driver){super(driver);}


    By incredibleConcreteHat = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-center.card-body > a");
    public void clickProduct (){driver.findElement(incredibleConcreteHat).click();}

    By addToCart = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg");
    public void addProductInCart (){driver.findElement(addToCart).click();}

    By addSecondProductInCart = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg");
    public void addSecondProductinCart (){driver.findElement(addSecondProductInCart).click();}

    By accessCart = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg");
    public void openCart (){driver.findElement(accessCart).click();}

    By totalInCart = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]/span");
    public double getTotalInCart() {String totalText = driver.findElement(totalInCart).getText();
        return Double.parseDouble(totalText);
    }
}
