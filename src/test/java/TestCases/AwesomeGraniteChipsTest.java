package TestCases;

import Pages.AwesomeGraniteChipsPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AwesomeGraniteChipsTest extends BasePage {

    private AwesomeGraniteChipsPage awesomeGraniteChipsPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        awesomeGraniteChipsPage = new AwesomeGraniteChipsPage(driver);
    }

    @Test

    public void clickOnGraniteChips() throws InterruptedException {
        awesomeGraniteChipsPage.clickAwesomeGraniteChips();
        awesomeGraniteChipsPage.clickHearthButton();
    }
}
