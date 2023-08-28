package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortFieldPage extends BasePage{
    public SortFieldPage(WebDriver driver){super(driver);}

    By clickOnSortBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select");
    public void clickSortField(){ driver.findElement(clickOnSortBox).click();}

    By clickOnAZOption = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[2]/select/option[1]");
    public void clickFirstOption(){ driver.findElement(clickOnAZOption).click();}

    By clickOnZAOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[2]");
    public void clickSecondOption (){driver.findElement(clickOnZAOption).click();}

    By clickOnLowToHighOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[3]");
    public void clickThirdOption (){driver.findElement(clickOnLowToHighOption).click();}

    By clickOnHighToLowOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[4]");
    public void clickFourthOption (){driver.findElement(clickOnHighToLowOption).click();}
}