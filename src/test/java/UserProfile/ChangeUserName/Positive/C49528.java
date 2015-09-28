package UserProfile.ChangeUserName.Positive;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 12.05.2015.
 */
public class C49528 extends BaseTest {


    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(dataProvider = "C49550", dataProviderClass = TestDataProvider.class)
    public void changeNickName(String currency) {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();
        userPage.clickUserProfile();

        userProfile = new UserProfile();
        userProfile.inputUserName("testnick");
        asserts.checkChangeNick("testnick");

        HomePage.open();
        userPage.logOut();
    }
}