package Games.runFundist;

import busines_Layer.GameLogic;
import core.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.HomePage;
import ui.MenuPage;
import ui.PopUpPage;

/**
 * Created by user on 21.05.2015.
 */
public class newTest extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private MenuPage menuPage;
    private GameLogic gameLogic;
    private Asserts asserts;

    //    PreConditions
    String email = "user6@lucky.com";
    String password = "123456789";

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
    public void runFundistGamePoker() {
        menuPage = new MenuPage();
        gameLogic = new GameLogic();

        menuPage.clickFundistGames();

        gameLogic.runFundistGame();





    }
}
