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
public class C49076 extends BaseTest{

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;

    //PreConditions
    Random r = new Random();
    long random = r.nextInt();
    String login = "autotest01";
    String email = "test01@e.mail";
    String password = "testpass";

    @Test(dataProvider = "C49076" , dataProviderClass = TestDataProvider.class)
    public void checkRegDuplicateLoginAndEmail(String currency, String expectedErrorMsgLogin, String expectedErrorMsgEmail, boolean bonus, boolean rules) {


        homePage = HomePage.open();
        popUpPage = homePage.clickFastRegisterBtn();
        popUpPage.registration(login,email,password,currency, bonus,rules);

        asserts = new Asserts();
//        asserts.duplicateUserLoginEmailMsg(expectedErrorMsgLogin, expectedErrorMsgEmail);
    }
}
