package TestCases;

import Pages.BasePage;
import Pages.PlaceOrderPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BasePage {
    private PlaceOrderPage placeOrderPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        placeOrderPage = new PlaceOrderPage(driver);
    }

    @Test
    public void PlaceOrderAsGuest() throws InterruptedException {
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.firstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.lastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }

    @Test
    public void PlaceOrderNormalUser() throws InterruptedException {
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.normalUser();
        placeOrderPage.uniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.firstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.lastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }

    @Test
    public void PlaceOrderUserWithBugs() throws InterruptedException {
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.clickonUsernameField();
        placeOrderPage.userWithBugs();
        placeOrderPage.clickonPasswordField();
        placeOrderPage.uniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.firstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.lastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }

    @Test
    public void PlaceOrderSlowerUser() throws InterruptedException{
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.slowUser();
        placeOrderPage.uniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.firstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.lastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
    @Test
    public void PlaceOrderLockedOurUser() throws InterruptedException{
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.lockedOutUser();
        placeOrderPage.uniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.firstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.lastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
}
