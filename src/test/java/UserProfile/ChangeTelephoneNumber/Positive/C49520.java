package UserProfile.ChangeTelephoneNumber.Positive;

import Data.TestDataProvider;
import Registration.Positive.C49069;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

import java.util.Random;

/**
 * Created by user on 21.01.2015.
 */
public class C49520 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //    PreConditions
    String login = "globotest16";
    String password = "globotest";

    @Test(dataProvider = "C49520", dataProviderClass = TestDataProvider.class)
    public void changeTelephoneNumber(String currency, boolean bonus, boolean rules) {

        //PreConditions
        Random r = new Random();
        long random = r.nextInt();
        String login = "autotest" + random;
        String email = "test" + random + "@e.mail";
        String password = "testpass";




        homePage = HomePage.open();

        popUpPage = homePage.clickFastRegisterBtn();
//        popUpPage.registration(login, email, password, currency, bonus, rules);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);
        userPage = new UserPage();
        userPage.clickUserProfile();
        userProfile = new UserProfile();
        userProfile.changeTelephoneNumber("test");

    }
}
