package TestCases;

import Pages.NumbersInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumbersInSearchFieldTest extends BasePage {
    private NumbersInSearchFieldPage numbersInSearchFieldPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        numbersInSearchFieldPage = new NumbersInSearchFieldPage(driver);
    }

    @Test
    public void addNumbers ()throws InterruptedException{
        numbersInSearchFieldPage.clickAddnumbers();
        numbersInSearchFieldPage.addNumbers();
        numbersInSearchFieldPage.submitSearch();
    }
}



