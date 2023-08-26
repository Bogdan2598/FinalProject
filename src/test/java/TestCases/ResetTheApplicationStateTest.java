package TestCases;

import Pages.BasePage;
import Pages.LoginPage;
import Pages.ResetTheApplicationStatePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResetTheApplicationStateTest extends BasePage {
    private ResetTheApplicationStatePage resetTheApplicationStatePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        resetTheApplicationStatePage = new ResetTheApplicationStatePage(driver);
    }
    @Test
    public void AsGuest() throws InterruptedException {
        resetTheApplicationStatePage.clickAddtoCartbutton();
        resetTheApplicationStatePage.clickAddtoWishlistbutton();
        resetTheApplicationStatePage.clickResetbutton();
    }
    @Test
    public void NormalUser() throws InterruptedException {
        resetTheApplicationStatePage.clickonPortalLogin();
        resetTheApplicationStatePage.NormalUser();
        resetTheApplicationStatePage.UniquePassword();
        resetTheApplicationStatePage.clickLoginButton();
        resetTheApplicationStatePage.clickAddtoCartbutton();
        resetTheApplicationStatePage.clickAddtoWishlistbutton();
        resetTheApplicationStatePage.clickResetbutton();
    }
    @Test
    public void UserWithBugs() throws InterruptedException{
        resetTheApplicationStatePage.clickonPortalLogin();
        resetTheApplicationStatePage.UserWithBugs();
        resetTheApplicationStatePage.UniquePassword();
        resetTheApplicationStatePage.clickLoginButton();
        resetTheApplicationStatePage.clickAddtoCartbutton();
        resetTheApplicationStatePage.clickAddtoWishlistbutton();
        resetTheApplicationStatePage.clickResetbutton();
    }

    @Test
    public void SlowerUser() throws InterruptedException {
        resetTheApplicationStatePage.clickonPortalLogin();
        resetTheApplicationStatePage.SlowUser();
        resetTheApplicationStatePage.UniquePassword();
        resetTheApplicationStatePage.clickLoginButton();
        resetTheApplicationStatePage.clickAddtoCartbutton();
        resetTheApplicationStatePage.clickAddtoWishlistbutton();
        resetTheApplicationStatePage.clickResetbutton();
    }

    @Test
    public void LockedOutUser() throws InterruptedException {
        resetTheApplicationStatePage.clickonPortalLogin();
        resetTheApplicationStatePage.LockedOutUser();
        resetTheApplicationStatePage.UniquePassword();
        resetTheApplicationStatePage.clickLoginButton();
        resetTheApplicationStatePage.clickAddtoCartbutton();
        resetTheApplicationStatePage.clickAddtoWishlistbutton();
        resetTheApplicationStatePage.clickResetbutton();
    }
}
