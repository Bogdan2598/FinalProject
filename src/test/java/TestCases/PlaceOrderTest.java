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
        placeOrderPage.FirstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.LastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.Adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
    @Test
    public void PlaceOrderNormalUser() throws InterruptedException {
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.NormalUser();
        placeOrderPage.UniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.FirstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.LastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.Adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
    @Test
    public void PlaceOrderUserWithBugs() throws InterruptedException {
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.UserWithBugs();
        placeOrderPage.UniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.FirstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.LastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.Adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
    @Test
    public void PlaceOrderSlowerUser() throws InterruptedException{
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.SlowUser();
        placeOrderPage.UniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.FirstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.LastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.Adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
    @Test
    public void PlaceOrderLockedOurUser() throws InterruptedException{
        placeOrderPage.clickonPortalLogin();
        placeOrderPage.LockedOutUser();
        placeOrderPage.UniquePassword();
        placeOrderPage.clickLoginButton();
        placeOrderPage.clickAddtoCartbutton();
        placeOrderPage.clickCartIcon();
        placeOrderPage.clickCheckoutbutton();
        placeOrderPage.clickFirstNameField();
        placeOrderPage.FirstName();
        placeOrderPage.clickLastNameField();
        placeOrderPage.LastName();
        placeOrderPage.clickAdressField();
        placeOrderPage.Adress();
        placeOrderPage.clickContinueCheckoutbutton();
        placeOrderPage.clickCompleteYourOrderbutton();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }

}
