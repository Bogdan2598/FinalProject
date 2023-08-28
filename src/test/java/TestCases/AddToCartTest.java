package TestCases;

import Pages.AddtoCartPage;
import Pages.BasePage;
import Pages.SearchFieldPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends BasePage {
    private AddtoCartPage AddtoCartPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        AddtoCartPage = new AddtoCartPage(driver);
    }

    @Test
    public void clickOnCartButton () throws InterruptedException{
        AddtoCartPage.clickAwesomeMetalChair();
        AddtoCartPage.addToCart();
    }
}
