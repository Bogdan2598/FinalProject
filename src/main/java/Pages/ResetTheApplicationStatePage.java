package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetTheApplicationStatePage extends BasePage{

    public ResetTheApplicationStatePage(WebDriver driver){super(driver);}

    By ResetTheApplicationStatebutton = By.xpath("/html/body/div/div/div[3]/nav/div/div/div[2]/button");

    public void clickResetbutton(){driver.findElement(ResetTheApplicationStatebutton).click();}

    By AddtoCart = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path");

    public void clickAddtoCartbutton(){driver.findElement(AddtoCart).click();}

    By AddtoWishlist = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path");

    public void clickAddtoWishlistbutton(){driver.findElement(AddtoWishlist).click();}

    By PortalLogin = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/button");

    public void clickonPortalLogin(){driver.findElement(PortalLogin).click();}

    By UsernameFiled = By.id("user-name");

    public void clickonUsernameField(){driver.findElement(UsernameFiled).click();}
    public void NormalUser(){driver.findElement(UsernameFiled).sendKeys("dino");}
    public void UserWithBugs(){driver.findElement(UsernameFiled).sendKeys("beetle");}
    public void SlowUser(){driver.findElement(UsernameFiled).sendKeys("turtle");}
    public void LockedOutUser(){driver.findElement(UsernameFiled).sendKeys("locked");}


    By PasswordFiled = By.id("password");

    public void  clickonPasswordField(){driver.findElement(PasswordFiled).click();}
    public void UniquePassword(){driver.findElement(PasswordFiled).sendKeys("choochoo");}

    By LoginButton = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button");

    public void clickLoginButton(){driver.findElement(LoginButton).click();}


}
