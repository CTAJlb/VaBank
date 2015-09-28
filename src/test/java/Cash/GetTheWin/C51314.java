package Cash.GetTheWin;

import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 07.05.2015.
 */
public class C51314 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashOutYandex() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts.checkLoginIsSuccessful("USD");

        cashPage.checkPayOutErrorMsg("yandex", "12331231312321", "100", "Insufficient funds");

        HomePage.open();
        userPage.logOut();

    }
}