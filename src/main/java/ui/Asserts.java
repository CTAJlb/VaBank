package ui;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

import static core.Utils.*;

/**
 * Created by user on 08.12.2014.
 */
public class Asserts extends PageFactorySettings {

    private CashPage cashPage;
    private MenuPage menuPage;
    private WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    //    Error Messages Verification
    private final String enterButtonXPATH = "//div[@class='center_btn']//a[@class='dialog_open reg_enter_btn']";


    //====Reg window====
    @FindBy(xpath = "//*[input[@id='register_form_nickname']]/*[@class='help-block']")
    private WebElement nickRegNameMsg;

    @FindBy(xpath = "//*[input[@id='register_form_email']]/*[@class='help-block']")
    private WebElement emailRegMsg;

    @FindBy(xpath = "//*[@class='hideShowPassword-wrapper']/../span[@class='help-block']")
    private WebElement passwordRegMsg;

    @FindBy(xpath = "//div[@class='error_message hidden agreed_error']")
    private WebElement confirmRulesMsg;

    //  ====Auth window====
    @FindBy(xpath = "//div[@class='popup_header']//div[@class='popup_header_item']")
    private WebElement auth_title;

    @FindBy(xpath = "//div[@class='error_message login_error_message']")
//    Не правильный логин или пароль
    private WebElement errorMsgAuth;

    @FindBy(xpath = "//span[@class='help-block form-error']")
//    Используйте только латинские буквы, цифры, @ и .
    private WebElement incorrectInput;

//    ====Restore Password form====

    @FindBy(xpath = "//*[@class='help-block']")
    private WebElement errorMsgRestoreForm;

//     ====Change Password Form====

    @FindBy(xpath = "//div[@class='error_fix_wrapper']/span[@class='help-block']")
    private WebElement errorMsgChangePassForm;


    //    ====Rules page====
    @FindBy(xpath = "//div[@class='colored_title white_bg']")
    private WebElement rules_title;


    ////  ====User Page====
    @FindBy(xpath = "//a[@class='profile_dialog_open my_cabinet_link']")
    private WebElement userProfile;

    @FindBy(xpath = "//div[@class='info_column with_money']//div[@class='money_info']")
    private WebElement cashInfo;

    @FindBy(xpath = "//div[@class='money_info']//span[@id='user_balance']")
    private WebElement userBalance;

    //    ===Restore Password Page===
    @FindBy(xpath = "//div[@class='popup_header_item']")
    private WebElement restorePasswordTitle;

    @FindBy(xpath = "//div[@class='text_center big_message white']")
    private WebElement restoreWhiteMsg;



//    Profile

    @FindBy(xpath = "//div[@class='item']//div[@class='login']")
    private WebElement userLogin;

    @FindBy(xpath = "//*[div[text()='Email: ']]//div[2]")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='user_profile_form_nickname']")
    private WebElement userName;

    @FindBy(xpath = "//div[@class='success']")
    private WebElement successChangePassMsg;

    @FindBy(xpath = "//div[@class='error_message']")
    private WebElement errorPassMsg;

    @FindBy(xpath = "//div[@class='error_wrapp error_border']/span[@class='help-block']")
    private WebElement errorNickMsg;

    @FindBy(xpath = "//div[@class='error_message']")
    private WebElement errorNickMsg2;

    @FindBy(xpath = "//input[@id='user_profile_form_nickname']")
    private WebElement expectedNickName;

//    Telephone PopUp
    @FindBy(xpath = "//div[@class='error_text']")
    private WebElement errorSendMsg;


    //     Bonus_info


    @FindBy(xpath = "//div[@class='checkbox_wr on_bonus_wr']//label[@id='bonusoff']")
//  @FindBy(css= "[for=on_bonus]>[type=checkbox]")
    private WebElement stateCheckBox;

    @FindBy(xpath = "//div[@class='page_h']")
    private WebElement page_h;

    @FindBy(xpath = "//div[@class='page_title']")
    private WebElement page_title;

    @FindBy(xpath = "//div[@class='colored_title white_bg']")
    private WebElement futer_pages_title;

    public static String getCurrentUrl() {
        return Driver.get().getCurrentUrl();
    }

    public String getRulesFormName() {
        return this.rules_title.getText();
    }

//    public boolean getBonusChBox() {
//        return this.bonusCheckBoxName.isSelected();
//    }

    public Asserts checkRulesPageOpen(String expTitle) {
        Set<String> handles = Driver.get().getWindowHandles();
        Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        Assert.assertEquals(rules_title.getText(), expTitle, "*Rules_casino* title was not present");
        Assert.assertEquals(getCurrentURL(), System.getProperty("test.baseURL") + "info/rules", "Current URL is not as expected");
        Driver.get().close();
        Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
        return new Asserts();
    }

//====REGISTRATION asserts====

    public void checkConfirmRulesMsg(String errorMsg) {
        Assert.assertEquals(confirmRulesMsg.getText(), errorMsg, "Information required message was not as expected!");
    }

    public void checkRegEmptyFields(String errorMsg) {
        checkNicknameField(errorMsg);
        checkEmailField(errorMsg);
        checkPasswordField(errorMsg);
    }

    public void duplicateUserNickEmailMsg(String errorNicknameMsg, String errorEmailMsg) {
        checkNicknameField(errorNicknameMsg);
        checkEmailField(errorEmailMsg);

    }

    public void checkNicknameField(String errorMsg) {
        Assert.assertEquals(nickRegNameMsg.getText(), errorMsg, "Information required message was not as expected!");
    }

    public void checkEmailField(String errorMsg) {
        System.out.println(emailRegMsg.getText());
        Assert.assertEquals(emailRegMsg.getText(), errorMsg, "Information required message was not as expected!");
    }

    public void checkEmailFieldRestorePswd(String errorMsg) {
        System.out.println(errorMsgRestoreForm.getText());
        Assert.assertEquals(errorMsgRestoreForm.getText(), errorMsg, "Information required message was not as expected!");
    }

    public void checkPasswordField(String errorMsg) {
//        System.out.println(passwordRegMsg.getText());
        Assert.assertEquals(passwordRegMsg.getText(), errorMsg, "Information required message was not as expected!");
    }


//    ====AUTHORIZATION Window====

    public String getAuthFormName() {
        return this.auth_title.getText();
    }

    public Asserts checkAuthPopupOpen(Asserts asserts, String expTitle) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='sign_up']")));
        Assert.assertTrue(isElementPresent(By.xpath(asserts.enterButtonXPATH), 5), "Enter button was not present");
        Assert.assertEquals(asserts.getAuthFormName(), expTitle, "*Enter* title was not present");

        return new Asserts();

    }

    public void checkAuthInputEror(String errorMsg) {
        Assert.assertEquals(incorrectInput.getText(), errorMsg, "Information required message was not as expected!");
    }

    public void checkAuthErrorMsg() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error_message login_error_message']")));
//        System.out.println(errorMsgAuth.getText());
            Assert.assertEquals(errorMsgAuth.getText(), "Не правильный логин или пароль", "Information required message was not as expected!");
        if (isElementPresent(By.xpath("//span[@class='help-block form-error']"))) {
            Assert.assertEquals(incorrectInput.getText(), "Используйте только латинские буквы, цифры, @ и .", "Information required message was not as expected!");
        }

    }

    public void checkAuthEmptyFields(String errorMsg) {
        checkNicknameField(errorMsg);
        checkPasswordField(errorMsg);
    }

    public void checkAuthRuLogin(String errorMsg) {
        checkNicknameField(errorMsg);
    }


//    ==== User Page ====

    public UserPage checkLoginIsSuccessful(String currency) {
        
//       Assert.assertEquals(userBalance.getText(), "0.00", "User balance incorrect!");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='info_column with_money']//div[@class='money_info']")));
        Assert.assertEquals(cashInfo.getText(), currency + " 0", "User balance or currency incorrect!");
        Assert.assertTrue(isElementPresent(By.xpath("//a[@class='profile_dialog_open my_cabinet_link']"), 5));
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='title']/a[@class='dialog_open treasury_open']"), 5));
        Assert.assertFalse(isElementPresent(By.xpath("//div[@class='top_btns']//a[@class='dialog_open quick_reg_btn']"), 5));
        return new UserPage();
    }

    public void checkProfile(UserPage userPage, UserProfile userProfile, String login, String email, String name) {

        userPage.clickUserProfile();
        Assert.assertEquals(userLogin.getText(), login, "Login was not as expected");
        Assert.assertEquals(userEmail.getText(), email, "Email was not as expected");
        Assert.assertEquals(userName.getAttribute("value"), name, "UserName was not as expected");
        userProfile.clickBonusSection();
        if (true == isElementPresent(By.xpath("//input[@id='SearchForm_code']"))) {
            System.out.println("in if");
            Assert.assertEquals(stateCheckBox.getText(), "Выключить бонусы", "Bonus state not as expected");
        }
        else {
            System.out.println(stateCheckBox.getText());
            System.out.println("in else");
            Assert.assertEquals(stateCheckBox.getText(), "Включить бонусы", "Bonus state not as expected");
//            System.out.println(stateCheckBox.getText());

        }
//        Assert.assertEquals(getBonusChBox(), bonus, "Bonus was not as expected");
        userProfile.clickPopupClose();

    }

//   public void checkProfileBonus(boolean bonus) {
//       Assert.assertEquals(getBonusChBox(), bonus, "Bonus was not as expected");
//
//   }


    public void checkRestorePasswordForm(String expTitle) {
        waitSleep(1000);
        Assert.assertTrue(isElementPresent(By.xpath("//a[@class='pop_enter_btn dialog_send']"), 5));
        Assert.assertEquals(restorePasswordTitle.getText(), expTitle, "Title was not as expected");


    }

    public void checkRestorePasswordMsg(String message) {
        Assert.assertEquals(restoreWhiteMsg.getText(), message, "Restore message was not as expected");
    }

    public void checkPageURL(String postURL) {
        waitSleep(1000);
        //WebDriverWait waiter = new WebDriverWait(Driver.get(), 10);
        //waiter.until(ExpectedConditions.visibilityOf(leftMenu.getWrappedElement()));
        //Assert.assertEquals(Driver.get().getCurrentUrl(), Config.getProperty("test.baseURL") + postURL, "Page menu URL was not as expected");
        Assert.assertEquals(Driver.get().getCurrentUrl(), System.getProperty("test.baseURL") + postURL, "Page menu URL was not as expected");
    }

    public void checkFundistGameUrl(String gameMenuUrl) {

//        Set<String> handles = Driver.get().getWindowHandles();
//        Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        Assert.assertEquals(Driver.get().getCurrentUrl(), System.getProperty("test.baseURL") + gameMenuUrl, "Page game URL was not as expected");
//        Driver.get().close();
//        Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
    }

    public void checkGamePageURL(String gameMenuUrl) {
        waitSleep(1000);
        Assert.assertEquals(Driver.get().getCurrentUrl(), System.getProperty("test.baseURL") + "games/" + gameMenuUrl, "Page game URL was not as expected");

    }

    public void checkCashPopUpOpen() {
        Driver.get().switchTo().frame(Driver.get().findElement(By.xpath("//*[iframe]//*[@id='bank_iframe']")));

        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='kassa_terminal']")));

        cashPage = new CashPage();
        Set<String> handles = Driver.get().getWindowHandles();
        Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
        if (isElementPresent(By.xpath("//div[@class='popup_header_item']"))) {
            cashPage.closeCashPopup();

        }

    }

    public void checkHeaderTitlePage(String expHeaderTitle) {

        if (expHeaderTitle.equals("НОВОСТИ") || expHeaderTitle.equals("АКЦИИ")) {
//            System.out.println(page_h.getText());
            Assert.assertEquals(page_h.getText(), expHeaderTitle, "Title was incorrect");
        } else {
//            System.out.println(page_title.getText());
            Assert.assertEquals(page_title.getText(), expHeaderTitle, "Title was incorrect");
        }
    }

    public void checkFuterTitlePage(String expFuterTitle) {
        Assert.assertEquals(futer_pages_title.getText(), expFuterTitle, "Title was incorrect");
    }

    public void checkFuterPageURL(String menuSettings, String futerMenuUrl) {

        switch (menuSettings) {
            case "defaultLink":
                waitSleep(300);
                Assert.assertEquals(Driver.get().getCurrentUrl(), System.getProperty("test.baseURL") + "info/" + futerMenuUrl, "Page game URL was not as expected");
                break;
            case "partnersLink":
                Set<String> handles = Driver.get().getWindowHandles();
                Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
                if (getCurrentUrl().equals("http://www.ggsaffiliates.com/")) {
                    Assert.assertTrue(getCurrentUrl().equals("http://www.ggsaffiliates.com/"));
                }
                if (getCurrentUrl().equals("http://luckypartners.com/")) {
                    Assert.assertTrue(getCurrentUrl().equals("http://luckypartners.com/"));
                }
                Driver.get().close();
                Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
                break;
        }
        }


    public void checkGamesPageOpen() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[@class='sort_default sort act']")));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@class='sort scorename']")));
        Assert.assertTrue(isElementPresent(By.xpath("//input[@id='searchContainer']")));
    }

    public void checkNegativePassChange(String expErrorMsg) {
        System.out.println(errorMsgChangePassForm.getText());
        Assert.assertEquals(errorMsgChangePassForm.getText(), expErrorMsg, "Message was incorrect or something went wrong");
    }

    public void checkDownloadButton() {
        isElementPresent(By.cssSelector(".download_btn.download-launcher"));

    }

    public void checkChangePasswordMsg(String expMsg) {
        Assert.assertEquals(successChangePassMsg.getText(), expMsg, "Message was not as expected");
    }

    public void checkOldPassword(String expMsg) {
        Assert.assertEquals(errorPassMsg.getText(), expMsg, "Message was not as expected");
    }

    public void checkChangeNick(String expText) {
        Assert.assertEquals(expectedNickName.getAttribute("value"), expText, "NickName was incorrect");
    }

    public void checkErrorMsgNickField(String expMsg) {
        Assert.assertEquals(errorNickMsg.getText(), expMsg, "Message was not as expected" );
    }

//    public void checkErrorMsgNickField2(String expMsg) {
//        Assert.assertEquals(errorNickMsg2.getText(), expMsg, "Message was not as expected" );
//    }

    public void checkSendTelephoneNumber(String exoMsg) {
        Assert.assertEquals(errorSendMsg.getText(), exoMsg, "Message was not as expected");
    }





}