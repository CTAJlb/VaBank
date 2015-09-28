package Cash.PaymentHistory;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 07.05.2015.
 */
public class C51310 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private CashPage cashPage;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test
    public void checkPaymentHistory() {

        cashPage = new CashPage();
        userPage = new UserPage();
        asserts = new Asserts();
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");

        cashPage.checkHistoryColumns("№", "Дата", "Сумма", "Тип операции", "Кошелек");

        HomePage.open();
        userPage.logOut();

    }
}