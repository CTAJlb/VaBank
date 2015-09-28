package UserProfile.ChangePassword.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 21.01.2015.
 */
public class C49512 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserPage userPage;
    private UserProfile userProfile;

//    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(dataProvider = "C49512" , dataProviderClass = TestDataProvider.class)
    public void checkInputAnotherNewPassword(String currency) {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful(currency);

        userPage = new UserPage();
        userPage.clickUserProfile();

        userProfile = new UserProfile();
        userProfile.changePassword("globotest" , "globotest1", "globotest2");
        asserts.checkNegativePassChange("Пароли не совпадают.");
        popUpPage.closePopup();


        userPage.logOut();
    }

}
