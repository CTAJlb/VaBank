package UserProfile.ChangeTelephoneNumber.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

import java.util.Random;

/**
 * Created by user on 21.01.2015.
 */
public class C49522 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserProfile userProfile;
    private UserPage userPage;

    //    PreConditions
    String login = "globotest16";
    String password = "globotest";

    @Test(dataProvider = "C49522", dataProviderClass = TestDataProvider.class)
    public void inputLongTelephoneNumber(String currency, boolean bonus, boolean rules) {

        //PreConditions
        Random r = new Random();
        long random = r.nextInt();
        String login = "autotest" + random;
        String email = "test" + random + "@e.mail";
        String password = "testpass";


        homePage = HomePage.open();

        popUpPage = homePage.clickFastRegisterBtn();
        popUpPage.registration(login, email, password, currency, bonus, rules);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);
        userPage = new UserPage();
        userPage.clickUserProfile();
        userProfile = new UserProfile();
        userProfile.changeTelephoneNumber("764564524324");
        asserts.checkSendTelephoneNumber("Ошибка верификации телефона,\n" +
                "обратитесь в \"Службу поддержки\".");
        userProfile.clickPopupClose();

        userPage.logOut();
    }
}
