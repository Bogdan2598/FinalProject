package TestCases;

import Pages.BasePage;
import Pages.SearchFieldPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchFieldTest extends BasePage {

    private SearchFieldPage searchFieldPage;


    @BeforeMethod
    public void setup() {
        super.setUp();
        searchFieldPage = new SearchFieldPage(driver);
    }

    @Test
    public void clickOnSearchField() throws InterruptedException{
        searchFieldPage.clickSearchField();
    }
}
