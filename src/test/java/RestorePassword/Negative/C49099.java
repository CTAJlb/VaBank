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
public class C49099 extends BaseTest {

    HomePage homePage;
    PopUpPage popUpPage;
    RestorePasswordPage restorePasswordPage;
    Asserts asserts;

    @Test
    public void checkEmptyField() {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.clickForgotPasswordLink();

        restorePasswordPage = new RestorePasswordPage();
        restorePasswordPage.inputValueAndSubmit("");

        asserts = new Asserts();
        asserts.checkEmailFieldRestorePswd("Значение не должно быть пустым.\n" +
                "Пользователь не найден.");
    }

}
