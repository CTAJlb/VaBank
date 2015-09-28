package ui;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

import static core.Utils.*;


/**
 * Created by user on 19.12.2014.
 */
public class MenuPage extends PageFactorySettings {

    @FindBy(xpath = "//a[@class='reg_plate_close']")
    private WebElement hint_close;


    //    ===Header Menu===

    @FindBy(xpath = "//li/a[@href='/games']")
    private WebElement games_page;

    @FindBy(xpath = "//li/a[@class='dialog_open treasury_open']")
    private WebElement cash_page;

    @FindBy(xpath = "//li/a[@href='/news']")
    private WebElement news_page;

    @FindBy(xpath = "//li/a[@href='/promotions']")
    private WebElement promo_page;

    @FindBy(xpath = "//li/a[@href='/lotto']")
    private WebElement lottery_page;

    @FindBy(xpath = "//li/a[@href='/tournaments']")
    private WebElement tournaments_page;

    @FindBy(css = ".download_btn.download-launcher")
    private WebElement download_button;

    @FindBy(xpath = "//li/a[@href='/']")
    private WebElement logotype_vabank;

//    ===Games menu===

    @FindBy(xpath = "//a[@href='/fundist']")
    private WebElement fundist_games;

    @FindBy(xpath = "//a[@href='/games/popular']")
    private WebElement popular_games;

    @FindBy(xpath = "//a[@href='/games/jackpot']")
    private WebElement jackpot_games;

    @FindBy(xpath = "//a[@href='/games/slots']")
    private WebElement premium_slot_games;

    @FindBy(xpath = "//a[@href='/games/classic_slots']")
    private WebElement classic_slot_games;

    @FindBy(xpath = "//a[@href='/games/roulette']")
    private WebElement roulette_games;

    @FindBy(xpath = "//a[@href='/games/other']")
    private WebElement table_games;

    @FindBy(xpath = "//a[@href='/games/videopoker']")
    private WebElement video_poker_games;

    @FindBy(xpath = "//a[@href='/games/allgames']")
    private WebElement all_games;

    @FindBy(xpath = "//div[@class='mix game_item']")
    private List<WebElement> gameLocator;

//    ===Futter menu===

    @FindBy(xpath = "//a[@href='/info/about']")
    private WebElement about_us_page;

    @FindBy(xpath = "//a[@href='/info/license']")
    private WebElement license_page;

    @FindBy(xpath = "//a[@href='/info/rules']")
    private WebElement rules_page;

    @FindBy(xpath = "//a[@href='/info/security']")
    private WebElement security_page;

    @FindBy(xpath = "//a[@href='http://www.ggsaffiliates.com/']")
    private WebElement partners_page;

    @FindBy(xpath = "//a[@href='/info/faq']")
    private WebElement faq_page;

    @FindBy(xpath = "//a[@href='/info/support']")
    private WebElement contacts_page;

    public void closeHint() {
        if (isElementPresent(By.xpath("//a[@class='reg_plate_close']"))) {
            hint_close.click();
        }
    }

    public void clickGamesPage() {
        games_page.click();
    }

    public void clickCashPage() {
        cash_page.click();
    }

    public void clickNewsPage() {
        news_page.click();
    }

    public void clickPromoPage() {
        promo_page.click();
    }

    public void clickLottoPage() {
        lottery_page.click();
    }

    public void clickTournamentsPage() {
        tournaments_page.click();
    }

    public void clickDownloadButton() {
//        clickJSAll(download_button);

        download_button.click();
    }

    public void clickLogotypeVabank() {
        logotype_vabank.click();
    }

    public MenuPage clickFundistGames() {
        fundist_games.click();
        return new MenuPage();
    }

    public void clickPopularGames() {
        popular_games.click();
    }

    public void clickJackpotGames() {
        jackpot_games.click();
    }

    public void clickPremiumGames() {
        premium_slot_games.click();
    }

    public void clickSlotsGames() {
        classic_slot_games.click();
    }

    public void clickRouletteGames() {
        roulette_games.click();
    }

    public void clickTableGames() {
        table_games.click();
    }

    public void clickVideopokerGames() {
        video_poker_games.click();
    }

    public void clickAllGames() {
        closeHint();
        clickJS(all_games);
    }

    public void clickAboutUsPage() {
        clickJSAll(about_us_page);
    }

    public void clickLicensePage() {
        clickJSAll(license_page);
    }

    public void clickRulesPage() {
        clickJSAll(rules_page);
    }

    public void clickSecurityPage() {
        clickJSAll(security_page);
    }

    public void clickPartnersPage() {
        clickJSAll(partners_page);

    }

    public void clickFaqPage() {
        clickJSAll(faq_page);
    }

    public void clickContactPage(){
        clickJSAll(contacts_page);
    }


    public void checkGamesQtt(int size){
        Assert.assertEquals(gameLocator.size(), size, "Game quantity was not as expected");
    }
}
