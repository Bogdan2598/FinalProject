package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends BasePage{
    public PlaceOrderPage(WebDriver driver){super(driver);}

    By AddtoCart = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path");

    public void clickAddtoCartbutton(){driver.findElement(AddtoCart).click();}

    By CartIcon = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path");

    public void clickCartIcon(){driver.findElement(CartIcon).click();}

    By Checkout = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/a[2]");

    public void clickCheckoutbutton(){driver.findElement(Checkout).click();}

    By FirstNameField = By.id("first-name");

    public void clickFirstNameField(){driver.findElement(FirstNameField).click();}
    public void FirstName(){driver.findElement(FirstNameField).sendKeys("John");}

    By LastNameField = By.id("last-name");

    public void clickLastNameField(){driver.findElement(LastNameField).click();}
    public void LastName(){driver.findElement(LastNameField).sendKeys("Arrow");}

    By AdressField = By.id("address");
    public void clickAdressField(){driver.findElement(AdressField).click();}
    public void Adress(){driver.findElement(AdressField).sendKeys("Poland");}

    By ContinueCheckout = By.xpath("/html/body/div/div/div[2]/form/div/div[2]/button");
    public void clickContinueCheckoutbutton(){driver.findElement(ContinueCheckout).click();}

    By CompleteYourOrder = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/a[2]");

    public void clickCompleteYourOrderbutton(){driver.findElement(CompleteYourOrder).click();}

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
