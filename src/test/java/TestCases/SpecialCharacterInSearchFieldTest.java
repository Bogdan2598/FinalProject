package TestCases;

import Pages.SpecialCharacterInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpecialCharacterInSearchFieldTest extends BasePage {

    private SpecialCharacterInSearchFieldPage specialCharacterInSearchFieldPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        specialCharacterInSearchFieldPage = new SpecialCharacterInSearchFieldPage(driver);
    }
    
    @Test
    public void useSearchField() throws InterruptedException{
        specialCharacterInSearchFieldPage.enterCharacter();
    }
}
