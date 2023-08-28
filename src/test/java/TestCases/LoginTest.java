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
        loginPage.clickonUsernameField();
        loginPage.normalUser();
        loginPage.clickonPasswordField();
        loginPage.uniquePassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void UserWithBugs() throws InterruptedException{
        loginPage.clickonPortalLogin();
        loginPage.clickonUsernameField();
        loginPage.userWithBugs();
        loginPage.clickonPasswordField();
        loginPage.uniquePassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void SloweUser() throws InterruptedException {
        loginPage.clickonPortalLogin();
        loginPage.clickonUsernameField();
        loginPage.slowUser();
        loginPage.clickonPasswordField();
        loginPage.uniquePassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void LockedOutUser() throws InterruptedException {
        loginPage.clickonPortalLogin();
        loginPage.clickonUsernameField();
        loginPage.lockedOutUser();
        loginPage.clickonPasswordField();
        loginPage.uniquePassword();
        loginPage.clickLoginButton();
    }
}
