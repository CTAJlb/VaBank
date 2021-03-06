package UserProfile.ChangeUserName.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 14.04.2015.
 */
public class C51541 extends BaseTest {


    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(dataProvider = "C49550", dataProviderClass = TestDataProvider.class)
    public void inputSpace(String currency) {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();
        userPage.clickUserProfile();

        userProfile = new UserProfile();
        userProfile.inputUserName("");
        asserts.checkErrorMsgNickField("Никнейм не должен быть пустым");

        userProfile.clickPopupClose();

        userPage.logOut();
    }
}