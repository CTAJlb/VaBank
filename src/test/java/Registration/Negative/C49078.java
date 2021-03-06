package Registration.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;

import java.util.Random;

/**
 * Created by user on 09.12.2014.
 */
public class C49078 extends BaseTest{

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;

    //PreConditions
    Random r = new Random();
    long random = r.nextInt();
    String nickname = "тест" + random;
    String email = "test" + random + "@e.mail";
    String password = "testpass";

    @Test(dataProvider = "C49078" , dataProviderClass = TestDataProvider.class)
    public void checkRegNicknameRuText(String currency, String expectedErrorMsg, boolean bonus, boolean rules) {

        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickFastRegisterBtn();
        popUpPage.registration(nickname,email,password,currency, bonus,rules);

        asserts = new Asserts();
        asserts.checkNicknameField(expectedErrorMsg);

    }
}
