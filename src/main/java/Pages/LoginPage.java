package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){super(driver);}

    By PortalLogin = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/button");
    public void clickonPortalLogin(){driver.findElement(PortalLogin).click();}

    By UsernameFiled = By.id("user-name");
    public void clickonUsernameField(){driver.findElement(UsernameFiled).click();}
    public void normalUser(){driver.findElement(UsernameFiled).sendKeys("dino");}
    public void userWithBugs(){driver.findElement(UsernameFiled).sendKeys("beetle");}
    public void slowUser(){driver.findElement(UsernameFiled).sendKeys("turtle");}
    public void lockedOutUser(){driver.findElement(UsernameFiled).sendKeys("locked");}


    By PasswordFiled = By.id("password");
    public void  clickonPasswordField(){driver.findElement(PasswordFiled).click();}
    public void uniquePassword(){driver.findElement(PasswordFiled).sendKeys("choochoo");}

    By LoginButton = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button");
    public void clickLoginButton(){driver.findElement(LoginButton).click();}
}
