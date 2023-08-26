package TestCases;

import Pages.BasePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest  extends BasePage {
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void NormalUser() throws InterruptedException {
        loginPage.clickonPortalLogin();
        loginPage.NormalUser();
        loginPage.UniquePassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void UserWithBugs() throws InterruptedException{
        loginPage.clickonPortalLogin();
        loginPage.UserWithBugs();
        loginPage.UniquePassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void SloweUser() throws InterruptedException {
        loginPage.clickonPortalLogin();
        loginPage.SlowUser();
        loginPage.UniquePassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void LockedOutUser() throws InterruptedException {
        loginPage.clickonPortalLogin();
        loginPage.LockedOutUser();
        loginPage.UniquePassword();
        loginPage.clickLoginButton();
    }
}
