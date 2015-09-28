package Registration.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;

import java.util.Random;

/**
 * Created by user on 08.12.2014.
 */
public class C49077 extends BaseTest{

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;

    //PreConditions
    Random r = new Random();
    long random = r.nextInt();
    String nickname = "autotest" + random;
    String email = random + " st@e.mail";
    String password = "testpass";


    @Test(dataProvider = "C49077" , dataProviderClass = TestDataProvider.class)
    public void checkRegEmailWithSpace(String currency, String expectedErrorMsg, boolean bonus, boolean rules) {

        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickFastRegisterBtn();
        popUpPage.registration(nickname,email,password, currency, bonus,rules);

        asserts = new Asserts();
        asserts.checkEmailField(expectedErrorMsg);

    }
}
