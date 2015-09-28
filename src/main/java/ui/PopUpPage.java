package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static core.Utils.*;

/**
 * Created by user on 07.12.2014.
 */
public class PopUpPage extends PageFactorySettings {



    public final String partRadiobuttonLocator = "//input[@name='currency'][@value=']";
//
//         === Registration/Authorization FORM ===
    @FindBy(xpath = "//div[label/input[@name='currency']]")
    private WebElement parentCurrency;
//
//    //*[label[@for='inputLogin']]//*[@class='error_message']
    @FindBy(xpath = "//div[@class='items']/div[4]/label[2]")
    private WebElement rubCurrency;
//
    @FindBy(xpath = "//div[@class='items']/div[4]/label[3]")
    private WebElement usdCurrency;
//
    @FindBy(xpath = "//div[@class='items']")
    private WebElement registerElementsBox;

    @FindBy(xpath = "//form[@id='registration_form']/div/div[5]/i[@class='checkbox']")
    private WebElement bonusCheckBox;
//
    @FindBy(xpath = "//div[@id='agreed']/i[@class='checkbox checkbox-checked']")
    private WebElement rulesCapture;
//
    @FindBy(xpath = "//div[@id='agreed']/i[@class='checkbox checkbox-checked']")
    private WebElement activeRulesCapture;
//
    @FindBy(xpath = "//button[@class='register_btn_wide dialog_send']")
    private WebElement submitRegistration;
//


    @FindBy(xpath = "//a[@class='dialog_open reg_enter_btn']")
    private WebElement authFormButton;

    @FindBy(xpath = "//label[@class='p_label']/a[@class='blue']")
    private WebElement rulesPageLink;

    @FindBy(xpath = "//a[@class='dialog_open forgot_passw']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[@class='popup_close']")
    private WebElement closePopup;

    @FindBy(xpath = "//input[@id='register_form_nickname']")
    private WebElement nicknameField;

    @FindBy(xpath = "//input[@class='field_email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='_password']")
    private WebElement passwordAuthField;

    @FindBy(xpath = "//input[@id='register_form_password']")
    private WebElement passwordRegField;

    @FindBy(xpath = "//a[@class='pop_enter_btn dialog_send']")
    private WebElement submitAuthorization;

    public void setNickname(String nicknameValue) {
        nicknameField.sendKeys(nicknameValue);
    }

    public void setEmail(String emailValue) {
        emailField.sendKeys(emailValue);
    }

    public void setAuthPassword(String passwordValue) {
        passwordAuthField.sendKeys(passwordValue);
    }
    public void setRegPassword(String passwordValue) {
        passwordRegField.sendKeys(passwordValue);
    }

    public UserPage authorization(String emailValue, String passwordValue) {
        setEmail(emailValue);
        setAuthPassword(passwordValue);
        submitAuthorization.click();
        return new UserPage();
    }




//
    public void setBonusCheckbox(boolean value) {
        setCheckbox(bonusCheckBox, value);
    }
//
    public void setRulesCheckbox(boolean value) {
        setCheckbox2(rulesCapture, value);
    }

    public void clickSubmitRegButton() {
    submitRegistration.click();
    }
    public void  clickSubmitAuthButton() {
    submitAuthorization.click();
    }


    public void clickEnterAuthPopup() {
        authFormButton.click();
    }
    public void clickRulesLink() {
        rulesPageLink.click();
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }

//    public void clickToNeedRadioButton(String currency) {
//        System.out.println(partRadiobuttonLocator + currency + "']");
////        clickJS(parentCurrency.findElement(By.xpath(partRadiobuttonLocator + currency + "']")));
//        parentCurrency.findElement(By.xpath(partRadiobuttonLocator + currency + "']")).click();
//    }
    public UserPage clickRulesCheckBoxAndRegisterBtn(boolean rulesValue ) {
        setRulesCheckbox(rulesValue);
        clickSubmitRegButton();
        return new UserPage();
    }

    public UserPage doubleClickRulesCheckBox() {
        setRulesCheckbox(true);
        if (true == isElementPresent(By.xpath("//i[@class='checkbox checkbox-checked']"))) {
            activeRulesCapture.click();
        }
        return new UserPage();
    }

    public UserPage changeFormAuth() {
        clickEnterAuthPopup();
        return new UserPage();
    }

    public UserPage openRulesPage() {
        clickRulesLink();
        return new UserPage();
    }


    public void selectNeedCurrency(String currency) {
       registerElementsBox.findElement(By.xpath("//*[span[@class='" + currency +  "']]//i")).click();
//        if (isElementPresent(By.xpath("//*[span[@class='RUB']]//*[@class='radio radio-checked']"))) {
//
//        }
    }
//
//
//
//
//
//
//
//
    public UserPage registration(String nicknameValue, String emailValue, String passValue, String currency, boolean bonusValue, boolean rulesValue) {
        setNickname(nicknameValue);
        setEmail(emailValue);
        setRegPassword(passValue);
//        if (currency.equals("USD")) {
//        usdCurrency.click();
//        }
//        else {
//            rubCurrency.click();
//        }
        selectNeedCurrency(currency);
        setBonusCheckbox(bonusValue);
        setRulesCheckbox(rulesValue);
        clickSubmitRegButton();
        return new UserPage();
    }


//
    public PopUpPage closePopup() {
        closePopup.click();
        return new PopUpPage();
    }
//

}


















