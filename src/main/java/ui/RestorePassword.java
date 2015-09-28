package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 22.12.2014.
 */
public class RestorePassword extends PageFactorySettings {

    PopUpPage popUpPage;
    Asserts asserts;

    @FindBy(xpath = "//input[@id='remind_form_email']")
    private WebElement emailField;

    @FindBy(xpath = "//a[@class='pop_enter_btn dialog_send']")
    private WebElement submitBtn;

    public void inputValueAndSubmit(String value) {

        emailField.sendKeys(value);
        submitBtn.click();
    }




}
