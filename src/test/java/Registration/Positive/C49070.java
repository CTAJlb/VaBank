package Registration.Positive;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

import java.util.Random;

/**
 * Created by user on 08.12.2014.
 */
public class C49070 extends BaseTest {
    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //PreConditions
    Random r = new Random();
    long random = r.nextInt();
    String login = "autotest" + random;
    String email = "test" + random + "@e.mail";
    String password = "testpass";


    @Test(dataProvider = "C49070" , dataProviderClass = TestDataProvider.class)
    public void registrationRUBCurWithBonus(String currency, boolean bonus, boolean rules) {

        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickFastRegisterBtn();
        popUpPage.registration(login, email, password, currency, bonus, rules);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();

        userProfile = new UserProfile();
        asserts.checkProfile(userPage, userProfile, login, email, login);
        userPage = new UserPage();
        userPage.logOut();
    }
}
