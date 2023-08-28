package TestCases;
import Pages.TextInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextInSearchFieldTest extends BasePage {

    private TextInSearchFieldPage textInSearchFieldPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        textInSearchFieldPage = new TextInSearchFieldPage(driver);
    }

    @Test
    public void clickOnSearchField() throws InterruptedException{
        textInSearchFieldPage.clickOnSearchBar();
    }
}
