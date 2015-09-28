package Cash.GetTheWin;

import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 07.05.2015.
 */
public class C51315 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashOutMoneta() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts.checkLoginIsSuccessful("USD");

        cashPage.checkPayOutErrorMsg("moneta", "12345678", "200", "Insufficient funds");

        HomePage.open();
        userPage.logOut();

    }
}