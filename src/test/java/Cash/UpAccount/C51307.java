package Cash.UpAccount;

import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 05.05.2015.
 */
public class C51307 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashUpSms() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");

        cashPage.fillInPayForm("sms", "9657199205", "[10, 30, 50, 100, 200, ]", "100");

        cashPage.checkCashWindowUrl("sms", "", "");

        HomePage.open();
        userPage.logOut();

    }
}