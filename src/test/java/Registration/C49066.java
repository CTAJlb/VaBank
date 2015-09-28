package Registration;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;

/**
 * Created by user on 09.12.2014.
 */
public class C49066 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;

    @Test(dataProvider = "C49066", dataProviderClass = TestDataProvider.class)
    public void checkRulesPageLink(String expextedResult) {

        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickFastRegisterBtn();
        popUpPage.clickRulesLink();

        asserts = new Asserts();
        asserts.checkRulesPageOpen(expextedResult);


    }
}
