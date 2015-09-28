package UserProfile.ChangePassword.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 10.04.2015.
 */
public class C51540 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(dataProvider = "C49514" , dataProviderClass = TestDataProvider.class)
    public void checkInputSamePasswords(String currency) {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();
        userPage.clickUserProfile();

        userProfile = new UserProfile();
        userProfile.changePassword("globotest" , "globotest", "globotest");
        asserts.checkNegativePassChange("Новый пароль не должен совпадать со старым");
        popUpPage.closePopup();


        userPage.logOut();
    }
}

