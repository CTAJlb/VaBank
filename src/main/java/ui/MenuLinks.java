package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 07.12.2014.
 */
public class MenuLinks extends PageFactorySettings {
//
//    public final String menuLiXPATH = "//ul[@class='menu']/li";
//    public final String gamesXPATH = ".//a[text()='ИГРЫ']";
//    public final String cashXPATH = ".//a[text()='КАССА']";
//    public final String newsXPATH = ".//a[text()='Новости']";
//    public final String promotionsXPATH = ".//a[text()='Акции']";
//    public final String lotteryXPATH = ".//a[text()='Лотерея']";
//    public final String tournamentsXPATH = ".//a[text()='Турниры']";
//
////    Sub menu
//
//    public final String submenuXPATH = "//table[@class='sub_menu']/tbody/tr/td";
//    public final String liveDillersXPATH = ".//a[text()='Живые дилеры']";
//    public final String populargamesXPATH = ".//a[text()='Популярные']";
//    public final String jackpotgamesXPATH = ".//a[text()='Джекпоты']";
//    public final String premiumgamesXPATH = ".//a[text()='Премиум Слоты']";
//    public final String slotgamesXPATH = ".//a[text()='Слоты']";
//    public final String roulettegamesXPATH = ".//a[text()='Рулетки']";
//    public final String tablegamesXPATH = ".//a[text()='Столы']";
//    public final String videoPokergameXPATH = ".//a[text()='Видеопокеры']";
//    public final String allgamesXPATH = ".//a[text()='Все']";

//    Futter menu

//    public final String futmenuXPATH = ""
//    public final String aboutXPATH = ""
//    public final String licenseXPATH = ""
//    public final String rulesXPATH = ""
//    public final String securityXPATH = ""
//    public final String partnersXPATH = ""
//    public final String faqXPATH = ""
//    public final String contactsXPATH = ""





//    @FindBy(xpath = menuLiXPATH)
//    private WebElement menuLi;
//    @FindBy(xpath = "//li[@class='logo']")
//    WebElement logotype_VaBank;
//    @FindBy(xpath = "//ul[@class='menu']//a[@href='/games']")
//    WebElement games_link;
//    @FindBy(xpath = "//ul[@class='menu']//a[@href='/users/popup/bank']")
//    WebElement cash_button;
//    @FindBy(xpath = "//ul[@class='menu']//a[@href='/news]")
//    WebElement news_link;
//    @FindBy(xpath = "//ul[@class='menu']//a[@href='/promotions']")
//    WebElement promotions_link;
//    @FindBy(xpath = "//ul[@class='menu']//a[@href='/lotto']")
//    WebElement lottery_link;
//    @FindBy(xpath = "//ul[@class='menu']//a[@href='/tournaments']")
//    WebElement tournaments_link;

//   Games type links (sub-menu)
//    @FindBy(xpath = submenuXPATH)
//    private WebElement submenu;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/fundist']")
//    WebElement live_dillers_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/popular']")
//    WebElement popular_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/jackpot']")
//    WebElement jackpot_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/slots]")
//    WebElement premiumSlots_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/classic_slots]")
//    WebElement classicSlots_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/roulette")
//    WebElement roulette_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/other")
//    WebElement other_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/videopoker']")
//    WebElement videopoker_games_button;
//    @FindBy(xpath = "//table[@class='sub_menu']//a[href='/games/category/allgames']")
//    WebElement all_games_button;
//
//    public String getMenuLi() {
//        return menuLi.getText();
//    }
//
//    public void clickGame_hall() {
//        menuLi.findElement(By.xpath(gamesXPATH)).click();
//    }
//    public void clickCashButton() {
//        menuLi.findElement(By.xpath(cashXPATH)).click();
//    }
//    public void clickNewsPage() {
//        menuLi.findElement(By.xpath(newsXPATH)).click();
//    }
//    public void clickPromoPage() {
//        menuLi.findElement(By.xpath(promotionsXPATH)).click();
//    }
//    public void clickLotteryPage() {
//        menuLi.findElement(By.xpath(lotteryXPATH)).click();
//    }
//    public void clickTournamentsPage() {
//        menuLi.findElement(By.xpath(tournamentsXPATH)).click();
//    }
//
//    public String getSubMenu() {
//        return submenu.getText();
//    }
//    public void clickLiveDillersGames() {
//        submenu.findElement(By.xpath(liveDillersXPATH)).click();
//    }
//    public void clickPupularGames() {
//        submenu.findElement(By.xpath(populargamesXPATH)).click();
//    }
//    public void clickJackpotsGames() {
//        submenu.findElement(By.xpath(jackpotgamesXPATH)).click();
//    }
//    public void clickPremiumSlotsGames() {
//        submenu.findElement(By.xpath(premiumgamesXPATH)).click();
//    }
//    public void clickSlotGames() {
//        submenu.findElement(By.xpath(slotgamesXPATH)).click();
//    }
//    public void clickRouletteGames() {
//        submenu.findElement(By.xpath(roulettegamesXPATH)).click();
//    }
//    public void clickTableGames() {
//        submenu.findElement(By.xpath(tablegamesXPATH)).click();
//    }
//    public void clickvideoPokerGames() {
//        submenu.findElement(By.xpath(videoPokergameXPATH)).click();
//    }
//    public void clickAllGames() {
//        submenu.findElement(By.xpath(allgamesXPATH)).click();
//    }
//
//
    @FindBy(xpath = "//li/a[@href='/games']")
    private WebElement games_menu;

    @FindBy(xpath = "//li/a[@class='dialog_open']")
    private WebElement cash_menu;

    @FindBy(xpath = "//li/a[@href='/news']")
    private WebElement news_menu;

    @FindBy(xpath = "//li/a[@href='/promotions']")
    private WebElement promo_menu;

    @FindBy(xpath = "//li/a[@href='/lotto']")
    private WebElement lottery_menu;

    @FindBy(xpath = "//li/a[@href='/tournaments']")
    private WebElement tournaments_menu;

    @FindBy(xpath = "//li/a[@target='_blank']")
    private WebElement download_button;

    @FindBy(xpath = "//li/a[@href='/']")
    private WebElement logotype_vabank;

    public void clickGamesMenu() {
        games_menu.click();
    }

    public void clickCashMenu() {
        cash_menu.click();
    }

    public void clickNewsMenu() {
        news_menu.click();
    }

    public void clickPromoMenu() {
        promo_menu.click();
    }

    public void clickLottoMenu() {
        lottery_menu.click();
    }

    public void clickTournamentsMenu() {
        tournaments_menu.click();
    }

    public void clickDownloadButton() {
        download_button.click();
    }

    public void clickLogotypeVabank() {
        logotype_vabank.click();
    }

}
