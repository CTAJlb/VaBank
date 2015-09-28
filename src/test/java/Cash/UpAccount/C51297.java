package Cash.UpAccount;

import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 05.05.2015.
 */
public class C51297 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashUpQiwi() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");

        cashPage.fillInPayForm("qiwi", "+380939362520", "[10, 50, 100, 200, 400, ]", "100");

        cashPage.checkCashWindowUrl("qiwi", "https://w.qiwi.com/", "//div[@class='payment-description']");

        HomePage.open();
        userPage.logOut();

    }
}
