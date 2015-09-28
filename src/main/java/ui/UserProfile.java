package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static core.Utils.*;

/**
 * Created by user on 16.12.2014.
 */
public class UserProfile extends PageFactorySettings {



    @FindBy(xpath = "//div[@class='popup_close']")
    private WebElement closePopupBtn;

    @FindBy(xpath = "//td[@class='player_profile']")
    private WebElement userProfileSection;

    @FindBy(xpath = "//td[@class='casino_chips active']")
    private WebElement compointsSection;

    @FindBy(xpath = "//a[@class='blue']")
    private WebElement changePasswordBtn;

    @FindBy(xpath = "//a[@class='dialog_open inline-link blue']")
    private WebElement changeTelephoneNumberBtn;

    @FindBy(xpath = "//input[@id='ph_phone_input']")
    private WebElement popUpTelephoneField;

    @FindBy(xpath = "//label[@class='ph_label']")
    private WebElement popUpDDLcountry;

    @FindBy(xpath = "//*[@data-flag='uah']")
    private WebElement popUpUkraneCountry;

    @FindBy(xpath = "//button[@class='send_pop_btn dialog_send']")
    private WebElement popUpSendButton;

    @FindBy(xpath = "//div[@class='jspPane']")
    private WebElement popUpCountryPannel;

    @FindBy(css = "#user_change_password_form_current_password")
    private WebElement old_password_field;

    @FindBy(css = "#user_change_password_form_new_password_first")
    private WebElement new_password_field;

    @FindBy(css = "#user_change_password_form_new_password_second")
    private WebElement confirm_new_password_field;

    @FindBy(xpath = "//a[@class='select_btn popup_btn save_btn dialog_send']")
    private WebElement submit_button;

    @FindBy(xpath = "//input[@id='user_profile_form_nickname']")
    private WebElement inputNameUserField;

//    ====User main section====
    @FindBy(xpath = "//td[@class='player_profile']")
    private WebElement mainUserSection;

//    ====Bonus section====
    @FindBy(xpath = "//td[@class='bonuses']")
    private WebElement bonusSection;




    public UserProfile clickPopupClose() {
        closePopupBtn.click();
        return new UserProfile();
    }

    public UserProfile clickBonusSection() {
        bonusSection.click();
        return new UserProfile();
    }

    public UserProfile clickMainUserProfile(){
        mainUserSection.click();
        return new UserProfile();
    }

    public UserProfile changePassword(String oldPass, String newPass, String confirmPass) {
        changePasswordBtn.click();
        old_password_field.sendKeys(oldPass);
        new_password_field.sendKeys(newPass);
        confirm_new_password_field.sendKeys(confirmPass);
        submit_button.click();
        return new UserProfile();
    }

    public UserProfile inputUserName(String value) {
        inputNameUserField.clear();
        waitSleep(300);
        inputNameUserField.sendKeys(value);
        submit_button.click();
        if (isElementPresent(By.xpath("//span[@class='help-block form-error']"))) {
            submit_button.click();
        }
        return new UserProfile();
    }

    public UserProfile inputUserName2(String value) {
        inputUserName(value);
        submit_button.click();
        return new UserProfile();
    }

    private Select getCountrySelect() {
        Select select = new Select(this.popUpCountryPannel);
        return select;
    }
//
    public void setCountrySelect(String value) {
        getCountrySelect().selectByVisibleText(value);
    }

    public UserProfile changeTelephoneNumber(String value) {
        changeTelephoneNumberBtn.click();

        popUpDDLcountry.click();
        clickJS(popUpUkraneCountry);
        popUpTelephoneField.clear();
        popUpTelephoneField.sendKeys(value);
        popUpSendButton.click();
        return new UserProfile();
    }


}
