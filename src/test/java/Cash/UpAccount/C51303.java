package Cash.UpAccount;

import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 12.05.2015.
 */
public class C51303 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkCashUpLiqPay() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();


        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");

        cashPage.fillInPayForm("liqpay", "", "[50, 100, 150, 200, 500, ]", "100");

//        cashPage.checkCashWindowUrl("liqpay", "https://www.payanyway.ru", "//*[@class='tab-container']//*[@title='Монета.Ру']");

        HomePage.open();
        userPage.logOut();

    }
}
