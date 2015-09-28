package UserProfile.ChangePassword.Positive;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 02.01.2015.
 */
public class C49189 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";
    String newPassword = "globotest1";

    @Test(dataProvider = "C49189" , dataProviderClass = TestDataProvider.class)

    public void changeUserPassword(String currency) {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();
        userPage.clickUserProfile();

        userProfile = new UserProfile();
        userProfile.changePassword("globotest" , "globotest1", "globotest1");
        asserts.checkChangePasswordMsg("Ваш пароль был успешно изменен");
        userProfile.clickPopupClose();

        userPage.logOut();

        popUpPage = homePage.clickAuthBtn();
        popUpPage.authorization(email, newPassword);

        asserts.checkLoginIsSuccessful(currency);

        userPage.clickUserProfile();

        userProfile.changePassword("globotest1" , "globotest", "globotest");
        asserts.checkChangePasswordMsg("Ваш пароль был успешно изменен");
        userProfile.clickPopupClose();

        userPage.logOut();
    }   
}
