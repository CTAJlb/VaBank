package RestorePassword.Negative;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;
import ui.RestorePasswordPage;

/**
 * Created by user on 22.12.2014.
 */
public class C49100 extends BaseTest {


    HomePage homePage;
    PopUpPage popUpPage;
    RestorePasswordPage restorePasswordPage;
    Asserts asserts;

    @Test
    public void incorrectEmailInput() {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.clickForgotPasswordLink();

        restorePasswordPage = new RestorePasswordPage();
        restorePasswordPage.inputValueAndSubmit("глоботест@sdasd.net");

        asserts = new Asserts();
        asserts.checkEmailFieldRestorePswd("Пользователь не найден.");
    }
}
