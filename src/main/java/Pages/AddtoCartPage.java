package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCartPage extends BasePage {
    public AddtoCartPage(WebDriver driver) {
        super(driver);
    }
    By clickOnItem = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/a");
    public void clickAwesomeMetalChair (){driver.findElement(clickOnItem).click();}

    By clickOnCartButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg");
    public void addToCart (){driver.findElement(clickOnCartButton).click();}
}
