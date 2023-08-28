package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFieldPage extends BasePage {

    public SearchFieldPage(WebDriver driver){super(driver);}

    By clickOnSearchField = By.id("input-search");
    public void clickSearchField(){driver.findElement(clickOnSearchField).click();}
}