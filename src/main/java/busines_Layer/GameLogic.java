package busines_Layer;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ui.HomePage;
import ui.UserPage;

import static core.Utils.isElementPresent;
import static core.Utils.waitSleep;

/**
 * Created by user on 14.04.2015.
 */
public class GameLogic {

    private UserPage userPage;






    private static WebDriverWait wait = new WebDriverWait(Driver.get(), 80);
    private static final String gameLoadedCSS = ".gameLoaded";
    private static final String datagamenameCSS = ".gameLoaded";
    private static final String closeCashPopUpCss = "#popup-cashbox>.popup_close";
    private static final String submitRunFundistXPATH = "//a[@class='button_play start_game_btn popup_btn']";
    private static final String cashToFundist = "//a[@class='fundist-cash-link to_live link']";
    private static final String cashToVabank = "//a[@class='fundist-cash-link to_real link']";




    public void runDemo(String gameName, String expGameName, String expURL) {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".main")));


        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", Driver.get().findElement(By.xpath("//a[@href='/play/" + gameName + "/demo']")));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(gameLoadedCSS)));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-gamename='" + expGameName + "']")));

        Assert.assertEquals(Driver.get().findElement(By.cssSelector("#swf_container")).getAttribute("data-gamename"), expGameName, "Game name was not as expected");

        Assert.assertEquals(Driver.get().getCurrentUrl(), System.getProperty("test.baseURL") + expURL, "Current URL was not as expected");

        if (isElementPresent(By.xpath("//a[@class='close check_redirect']"))) {
            Driver.get().findElement(By.xpath("//a[@class='close check_redirect']")).click();
        } else {
            HomePage.open();
        }


    }


    public void runReal(String gameName, String expGameName, String expURL) {

        userPage = new UserPage();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".main")));
//        System.out.println(Driver.get().findElement(By.xpath("//a[@class='game_play_btn game_play_now_btn game_play_real '][@href='/play/RouletteEuroV]")));

//        if (isElementPresent(By.xpath("//a[@class='game_play_btn game_play_now_btn game_play_real has-tables'][@href='/play/" + gameName + "']"))) {
//            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", Driver.get().findElement(By.xpath("//a[@class='game_play_btn game_play_now_btn game_play_real has-tables'][@href='/play/" + gameName + "']")));
//        }
//        else {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", Driver.get().findElement(By.xpath("//a[@href='/play/" + gameName + "']")));
//        }

        waitSleep(500);

        String postUrl = "";
//
        postUrl = userPage.setTheGameTable(gameName);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(gameLoadedCSS)));

        Assert.assertEquals(Driver.get().findElement(By.cssSelector("#swf_container")).getAttribute("data-gamename"), expGameName, "Game name was not as expected");

        Assert.assertEquals(Driver.get().getCurrentUrl(), System.getProperty("test.baseURL") + expURL, "Current URL was not as expected");

        if (isElementPresent(By.xpath("//a[@class='close check_redirect']"))) {
            Driver.get().findElement(By.xpath("//a[@class='close check_redirect']")).click();
        } else {
            HomePage.open();
        }


    }


    public void runFundistGame() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".main")));
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", Driver.get().findElement(By.xpath("//a[@data-url='/fundist/popup/holdem']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='live_games']")));
        if (Integer.parseInt(Driver.get().findElement(By.xpath("//span[@class='host-balance']//input[@type='text']")).getAttribute("value"))>0) {
        Driver.get().findElement(By.xpath(cashToFundist)).click();


            Driver.get().findElement(By.xpath(submitRunFundistXPATH)).click();



        }

    }



    }

