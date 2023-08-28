package TestCases;

import Pages.BasePage;
import Pages.GuestUserBuyProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GuestUserBuyProductTest extends BasePage {
    private GuestUserBuyProductPage guestUserBuyProductPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        guestUserBuyProductPage = new GuestUserBuyProductPage(driver);
    }

    @Test
    public void specificProduct () throws InterruptedException{
        guestUserBuyProductPage.metalMouse();
        guestUserBuyProductPage.searchMouse();
        guestUserBuyProductPage.enterSearch();
        guestUserBuyProductPage.accessProduct();
        guestUserBuyProductPage.productInCart();
        guestUserBuyProductPage.viewCart();
    }
}
