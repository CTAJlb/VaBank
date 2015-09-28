package ui;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static core.Utils.clickJS;
import static core.Utils.isElementPresent;

/**
 * Created by user on 04.12.2014.
 */
public class HomePage extends PageFactorySettings {


//    public final String close_popupXPATH = "//div[@id='promo_popup']/div[@class='popup_close']";



    @FindBy(xpath = "//div[@id='promo_popup']")
    private WebElement popup_hello;
//
    @FindBy(xpath = "//div[@id='promo_popup']//a[@class='promo_popup_go_btn close']")
    private WebElement closeMainPopUp;

    @FindBy(xpath = "//div[@class='top_btns']//a[@class='dialog_open quick_reg_btn']")
    WebElement open_quick_register_popup;

    @FindBy(xpath = "//div[@class='top_btns']//a[@class='dialog_open enter_btn']")
    WebElement open_quick_auth_popup;


    public PopUpPage clickFastRegisterBtn() {
        clickJS(open_quick_register_popup);
        return new PopUpPage();
    }



    public PopUpPage clickAuthBtn() {
        clickJS(open_quick_auth_popup);
        return new PopUpPage();
    }

//    public static void clickPopUpClose() {
//        closeMainPopUp.click();
//    }
//
//    public void closeMainPopup() {
//        if (true == isElementPresent((By.xpath("//div[@id='promo_popup']")))) {
//            clickPopUpClose();
//        }
//    }
//
//
//
//
//    public HomePage homepageOpen() {
//        //Driver.get().get(Config.getProperty("test.baseURL"));
//        Driver.get().get(System.getProperty("test.baseURL"));
//        closeMainPopup();
//
//        return new HomePage();
//    }

    public static HomePage open() {
        //Driver.get().get(Config.getProperty("test.baseURL"));
        Driver.get().get(System.getProperty("test.baseURL"));
        if (true == isElementPresent((By.xpath("//div[@id='promo_popup']")))) {
        Driver.get().findElement(By.xpath("//div[@id='promo_popup']//a[@class='promo_popup_go_btn close']")).click();
        }
        return new HomePage();
    }


}
