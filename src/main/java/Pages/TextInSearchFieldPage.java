package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInSearchFieldPage extends BasePage{

    public TextInSearchFieldPage(WebDriver driver){super(driver);}

    By clickOnSearchBar = By.id("input-search");
    public void clickOnSearchBar(){driver.findElement(clickOnSearchBar).sendKeys("alex");}
}