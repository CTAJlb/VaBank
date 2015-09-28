package Authorization.Positive;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;
import ui.UserPage;

/**
 * Created by user on 14.12.2014.
 */
public class C49084 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;

//    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(dataProvider = "C49084" , dataProviderClass = TestDataProvider.class)

    public void authorizationUser(String currency) {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();
        userPage.logOut();
    }

}
