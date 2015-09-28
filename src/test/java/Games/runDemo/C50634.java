package Games.runDemo;

import Data.TestDataProvider;
import busines_Layer.GameLogic;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.MenuPage;

/**
 * Created by user on 14.04.2015.
 */
public class C50634 extends BaseTest {

    private MenuPage menuPage;
    private GameLogic gameLogic;


    @Test(dataProvider = "C50634", dataProviderClass = TestDataProvider.class)

    public void checkRunGameDemo(String gameName, String expGameName, String expURL) {

        menuPage = new MenuPage();
        gameLogic = new GameLogic();

        menuPage.clickAllGames();

        gameLogic.runDemo(gameName, expGameName, expURL);

//        HomePage.open();





    }


}
