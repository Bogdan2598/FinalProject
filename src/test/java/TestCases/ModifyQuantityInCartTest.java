package TestCases;

import Pages.BasePage;
import Pages.ModifyQuantityInCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModifyQuantityInCartTest extends BasePage {
    private ModifyQuantityInCartPage modifyQuantityInCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        modifyQuantityInCartPage = new ModifyQuantityInCartPage(driver);
    }
    @Test
    public void ModifyQuantity() throws InterruptedException {
        modifyQuantityInCartPage.clicktoCarticon();
        modifyQuantityInCartPage.clickCartPage();
        modifyQuantityInCartPage.plusQuatity();
        modifyQuantityInCartPage.plusQuatity();
        modifyQuantityInCartPage.plusQuatity();
    }
}
