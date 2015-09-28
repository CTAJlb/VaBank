package Cash.UpAccount;


import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

public class C51296 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String login = "globotest14@test.net";
    String password = "globotest";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashUpCreditCard() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(login, password);

        asserts.checkLoginIsSuccessful("USD");

        cashPage.fillInPayForm("credCards", "5487 3510 1790 8533", "[500, 1000, 2000, 5000, 10000, ]", "100");

        cashPage.checkCashWindowUrl("credCards", "", "");

        HomePage.open();
        userPage.logOut();

    }
}
