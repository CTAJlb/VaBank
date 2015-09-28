package Games;

import core.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 08.05.2015.
 */
public class C51531 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private MenuPage menuPage;
    private Asserts asserts;
    private UserPage userPage;

    //    PreConditions
    String email = "globotest14@test.net";
    String password = "globotest";

    @BeforeClass
    public void loginBeforeTest() {
        homePage = new HomePage();
        popUpPage = new PopUpPage();

        homePage.clickAuthBtn();
        popUpPage.authorization(email, password);
        asserts = new Asserts();
        asserts.checkLoginIsSuccessful("USD");
    }

    @Test
    public void checkGamesQuantity(){

        menuPage = new MenuPage();
        userPage = new UserPage();

        menuPage.closeHint();

        menuPage.clickFundistGames();
        asserts.checkFundistGameUrl("fundist");
        menuPage.checkGamesQtt(4);

        menuPage.clickPopularGames();
        asserts.checkGamePageURL("popular");
        menuPage.checkGamesQtt(20);

        menuPage.clickJackpotGames();
        asserts.checkGamePageURL("jackpot");
        menuPage.checkGamesQtt(9);

        menuPage.clickPremiumGames();
        asserts.checkGamePageURL("slots");
        menuPage.checkGamesQtt(26);

        menuPage.clickSlotsGames();
        asserts.checkGamePageURL("classic_slots");
        menuPage.checkGamesQtt(102);

        menuPage.clickRouletteGames();
        asserts.checkGamePageURL("roulette");
        menuPage.checkGamesQtt(10);

        menuPage.clickTableGames();
        asserts.checkGamePageURL("other");
        menuPage.checkGamesQtt(16);

        menuPage.clickVideopokerGames();
        asserts.checkGamePageURL("videopoker");
        menuPage.checkGamesQtt(13);

        menuPage.clickAllGames();
        asserts.checkGamePageURL("allgames");
        menuPage.checkGamesQtt(175);

        //menuPage.clickAllGamesBtn();

        userPage.logOut();
    }

}
