package Games.runReal;

import Data.TestDataProvider;
import busines_Layer.GameLogic;
import core.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.MenuPage;
import ui.PopUpPage;

/**
 * Created by user on 14.04.2015.
 */
public class C50635 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private MenuPage menuPage;
    private GameLogic gameLogic;
    private Asserts asserts;

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

    @Test(dataProvider = "C50635", dataProviderClass = TestDataProvider.class)
    public void checkRunGameReal(String gameName, String expGameName, String expURL) {

        menuPage = new MenuPage();
        gameLogic = new GameLogic();

        menuPage.clickAllGames();

        gameLogic.runReal(gameName, expGameName, expURL);

    }
}
