package testCase;

import Pages.CombinationWorldSearchPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CombinationWorldSearchTest extends BasePage {

    private CombinationWorldSearchPage combinationWorldSearchPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        combinationWorldSearchPage = new CombinationWorldSearchPage(driver);
    }
    @Test
    public void enterTextInField () throws InterruptedException{
        combinationWorldSearchPage.clickAddtext();
        combinationWorldSearchPage.introduceText();
        combinationWorldSearchPage.search();
    }
}
