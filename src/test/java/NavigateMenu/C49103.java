package NavigateMenu;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.Asserts;
import ui.MenuPage;

/**
 * Created by user on 24.12.2014.
 */
public class C49103 extends BaseTest {

    MenuPage menuPage;
    Asserts asserts;


    @Test
    public void checkFuterMenu() {


        menuPage = new MenuPage();
        asserts = new Asserts();

        menuPage.clickAboutUsPage();
        asserts.checkFuterTitlePage("О КАЗИНО");
        asserts.checkFuterPageURL("defaultLink","about");

        menuPage.clickLicensePage();
        asserts.checkFuterTitlePage("ЛИЦЕНЗИЯ");
        asserts.checkFuterPageURL("defaultLink","license");

        menuPage.clickRulesPage();
        asserts.checkFuterTitlePage("ПРАВИЛА КАЗИНО");
        asserts.checkFuterPageURL("defaultLink","rules");

        menuPage.clickSecurityPage();
        asserts.checkFuterTitlePage("БЕЗОПАСНОСТЬ");
        asserts.checkFuterPageURL("defaultLink","security");

        menuPage.clickPartnersPage();
        asserts.checkFuterPageURL("partnersLink","");

        menuPage.clickFaqPage();
        asserts.checkFuterTitlePage("ЧАСТЫЕ ВОПРОСЫ");
        asserts.checkFuterPageURL("defaultLink","faq");

        menuPage.clickContactPage();
        asserts.checkFuterTitlePage("КАК СВЯЗАТЬСЯ С СЛУЖБОЙ ПОДДЕРЖКИ?");
        asserts.checkFuterPageURL("defaultLink","support");


    }
}
