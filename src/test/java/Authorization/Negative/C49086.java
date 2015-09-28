package Authorization.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;

/**
 * Created by user on 14.12.2014.
 */
public class C49086 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;

    //    PreConditions
    String email = "test098@qwerty.net";
    String password = "globotest";


    @Test(dataProvider = "C49086" , dataProviderClass = TestDataProvider.class)
    public void incorrectEmail() {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email,password);

        asserts = new Asserts();
        asserts.checkAuthErrorMsg();
    }
}
