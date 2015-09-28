package NavigateMenu;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 22.12.2014.
 */
public class C49101 extends BaseTest {

    HomePage homePage;
    MenuPage menuPage;
    PopUpPage popUpPage;
    Asserts asserts;
    UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @Test
    public void checkMenuHeader() {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);

        popUpPage = new PopUpPage();
//        popUpPage.authorization(System.getProperty("test.login"), System.getProperty("test.pass"));


        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");

        menuPage = new MenuPage();

        menuPage.clickGamesPage();
        asserts.checkPageURL("games");
        asserts.checkGamesPageOpen();

        /**
         * This case need in relese. Cash not work on DEV platform
         */
//        menuPage.clickCashPage();
//        asserts.checkCashPopUpOpen();


        menuPage.clickNewsPage();
        asserts.checkPageURL("news");
        asserts.checkHeaderTitlePage("НОВОСТИ");

        menuPage.clickPromoPage();
        asserts.checkPageURL("promotions");
        asserts.checkHeaderTitlePage("АКЦИИ");

//        menuPage.clickLottoPage();
//        asserts.checkPageURL("lotto");
//        asserts.checkHeaderTitlePage("ЛОТЕРЕЯ");

        menuPage.clickTournamentsPage();
        asserts.checkPageURL("tournaments");
        asserts.checkHeaderTitlePage("ТЕКУЩИЕ ТУРНИРЫ");

        asserts.checkDownloadButton();


        menuPage.clickLogotypeVabank();
        asserts.checkPageURL("" + "");

        userPage = new UserPage();
        userPage.logOut();

    }



}
