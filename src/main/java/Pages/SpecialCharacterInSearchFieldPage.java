package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialCharacterInSearchFieldPage extends BasePage{

    public SpecialCharacterInSearchFieldPage(WebDriver driver){super(driver);}

    By clickSearchField = By.id("input-search");
    public void enterCharacter(){driver.findElement(clickSearchField).sendKeys("#%$^!");}
}