package Cash.UpAccount;

import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 05.05.2015.
 */
public class C51299 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashUpWebMoney() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");

        cashPage.fillInPayForm("webmoney", "", "[50, 100, 150, 200, 500, ]", "100");

        cashPage.checkCashWindowUrl("webmoney", "https://merchant.webmoney.ru/", "//table[@class='maintable_new']");

        HomePage.open();
        userPage.logOut();

    }
}