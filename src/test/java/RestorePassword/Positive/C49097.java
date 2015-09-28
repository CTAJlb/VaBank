package RestorePassword.Positive;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.PopUpPage;
import ui.RestorePasswordPage;


/**
 * Created by user on 22.12.2014.
 */
public class C49097 extends BaseTest {

    HomePage homePage;
    PopUpPage popUpPage;
    RestorePasswordPage restorePasswordPage;
    Asserts asserts;

    @Test
    public void restorePassword() {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.clickForgotPasswordLink();

        asserts = new Asserts();
        asserts.checkRestorePasswordForm(
                "ВОССТАНОВЛЕНИЕ ПАРОЛЯ"
        );

        restorePasswordPage = new RestorePasswordPage();
        restorePasswordPage.inputValueAndSubmit("globotest14@test.net");


        asserts.checkRestorePasswordMsg("Ссылка для восстановления пароля отправлена Вам на почту");
        System.out.println("Password send to email");

    }
}
