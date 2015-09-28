package Registration.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;

/**
 * Created by user on 08.12.2014.
 */
public class C49072 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;


    @Test(dataProvider = "C49072", dataProviderClass = TestDataProvider.class)
    public void checkAllEmptyFields(String expectedErrorMsg) {

        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickFastRegisterBtn();
        popUpPage.clickRulesCheckBoxAndRegisterBtn(true);

        asserts = new Asserts();
        asserts.checkRegEmptyFields(expectedErrorMsg);
    }
}
