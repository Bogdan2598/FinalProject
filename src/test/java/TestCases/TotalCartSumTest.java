package TestCases;

import Pages.BasePage;
import Pages.TotalCartSumPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TotalCartSumTest extends BasePage {
    private TotalCartSumPage TotalCartSumPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        TotalCartSumPage = new TotalCartSumPage(driver);
    }

    @Test
    public void sumOfCart () throws InterruptedException{
        TotalCartSumPage.clickProduct();
        TotalCartSumPage.addProductInCart();
        TotalCartSumPage.addSecondProductinCart();
        TotalCartSumPage.openCart();
        TotalCartSumPage.getTotalInCart();
    }
}
