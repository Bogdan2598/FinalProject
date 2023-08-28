package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CombinationWorldSearchPage extends BasePage{
    public CombinationWorldSearchPage(WebDriver driver){super(driver);}

    By clickOnSearchField = By.id("input-search");
    public void clickAddtext (){driver.findElement(clickOnSearchField).click();}
    public void introduceText (){driver.findElement(clickOnSearchField).sendKeys("n@#1?");}

    By enter = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void search (){driver.findElement(enter).click();}
}
