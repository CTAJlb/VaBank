package GloboLogin;

import Data.TestDataProvider;
import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.SocialControllsPage;
import ui.UserPage;

/**
 * Created by user on 17.12.2014.
 */
public class C49089 extends BaseTest {


    private SocialControllsPage socialControllsPage;
    private Asserts asserts;
    private UserPage userPage;
    private HomePage homePage;


    @Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "C49089", dataProviderClass = TestDataProvider.class)

    public void loginVkontakte(String iFrmaeNumber, String socNetwork, String email, String pass, String currency) {

            socialControllsPage = new SocialControllsPage();
            socialControllsPage.runStepsAuthorization(Integer.parseInt(iFrmaeNumber), socNetwork, email, pass);

            asserts = new Asserts();
            asserts.checkLoginIsSuccessful(currency);

            userPage = new UserPage();
            userPage.logOut();

    }
}




