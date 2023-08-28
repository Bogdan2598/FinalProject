package TestCases;

import Pages.BasePage;
import Pages.DeleteProductCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteProductCartTest extends BasePage {
    private DeleteProductCartPage deleteProductCartPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        deleteProductCartPage = new DeleteProductCartPage(driver);
    }

    @Test
    public void deleteProduct () throws InterruptedException{
        deleteProductCartPage.addFirstProduct();
        deleteProductCartPage.addSecondProduct();
        deleteProductCartPage.clickCart();
        deleteProductCartPage.clickTrashButton();
    }
}
