package Registration.Positive;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

import java.util.Random;

/**
 * Created by user on 08.12.2014.
 */
public class C49068 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //PreConditions
    Random r = new Random();
    long random = r.nextInt();
    String nickname = "autotest" + random;
    String email = "test" + random + "@e.mail";
    String password = "testpass";

   @Test(dataProvider = "C49068", dataProviderClass = TestDataProvider.class)
   public void registrationUSDCurWithoutBonus(String currency, boolean bonus, boolean rules) {

       homePage = new HomePage();
       popUpPage = new PopUpPage();

       homePage.clickFastRegisterBtn();
       popUpPage.registration(nickname, email, password, currency, bonus, rules);

       asserts = new Asserts();
       asserts.checkLoginIsSuccessful(currency);
       userPage = new UserPage();
       userProfile = new UserProfile();
       asserts.checkProfile(userPage, userProfile, nickname, email, nickname);

       userPage.logOut();







   }
}
