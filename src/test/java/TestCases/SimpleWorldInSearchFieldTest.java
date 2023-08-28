package TestCases;

import Pages.NumbersInSearchFieldPage;
import Pages.SimpleWorldInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleWorldInSearchFieldTest extends BasePage {
    private SimpleWorldInSearchFieldPage simpleWorldInSearchFieldPage;


    @BeforeMethod
    public void setUp(){
        super.setUp();
        simpleWorldInSearchFieldPage = new SimpleWorldInSearchFieldPage(driver);
    }

    @Test
    public void simpleWorld()throws InterruptedException{
        simpleWorldInSearchFieldPage.clickAddSimpleWorld();
        simpleWorldInSearchFieldPage.addSimpleWorld();
        simpleWorldInSearchFieldPage.submitSearch();
    }
}
