package NavigateMenu;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.MenuPage;

/**
 * Created by user on 22.12.2014.
 */
public class C49102 extends BaseTest {

    MenuPage menuPage;
    Asserts asserts;


    @Test
    public void checkSubMenu() {

        asserts = new Asserts();
        menuPage = new MenuPage();

        menuPage.closeHint();

        menuPage.clickFundistGames();
        asserts.checkFundistGameUrl("fundist");

        menuPage.clickPopularGames();
        asserts.checkGamePageURL("popular");

        menuPage.clickJackpotGames();
        asserts.checkGamePageURL("jackpot");

        menuPage.clickPremiumGames();
        asserts.checkGamePageURL("slots");

        menuPage.clickSlotsGames();
        asserts.checkGamePageURL("classic_slots");

        menuPage.clickRouletteGames();
        asserts.checkGamePageURL("roulette");

        menuPage.clickTableGames();
        asserts.checkGamePageURL("other");

        menuPage.clickVideopokerGames();
        asserts.checkGamePageURL("videopoker");

        menuPage.clickAllGames();
        asserts.checkGamePageURL("allgames");
    }

}
