package Registration;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;

/**
 * Created by user on 12.12.2014.
 */
public class C49067 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;


    @Test(dataProvider = "C49067", dataProviderClass = TestDataProvider.class)
    public void checkAuthFormPopup(String expectedResult) {

        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickFastRegisterBtn();
        popUpPage.changeFormAuth();

        asserts = new Asserts();
        asserts.checkAuthPopupOpen(asserts, expectedResult);
    }
}
