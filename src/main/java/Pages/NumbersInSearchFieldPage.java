package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NumbersInSearchFieldPage extends BasePage {
    public NumbersInSearchFieldPage(WebDriver driver){super(driver);}

    By searchField = By.id("input-search");
    public void clickAddnumbers (){driver.findElement(searchField).click();}
    public void addNumbers (){driver.findElement(searchField).sendKeys("1589");}

    By submit = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void submitSearch (){driver.findElement(submit).click();}
}