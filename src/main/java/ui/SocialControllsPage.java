package ui;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.util.Set;

import static core.Utils.clickJS;
import static core.Utils.setTextAllJS;
import static core.Utils.waitSleep;

/**
 * Created by user on 17.12.2014.
 */
public class SocialControllsPage extends PageFactorySettings {

    SocialNetworkPage socialNetworkPage;

    @FindBy(xpath = "//div[@class='info']//input[@name='email']")
    private WebElement vkEmailFld;

    @FindBy(xpath = "//div[@class='info']//input[@name='pass']")
    private WebElement vkPassFld;

    @FindBy(xpath = "//div[@class='popup_login_btn']//button[@type='submit']")
    private WebElement vkSubmitBtn;



    @FindBy(xpath = "//div[@class='form_row clearfix']//input[@name='email']")
    private WebElement fbEmailFld;

    @FindBy(xpath = "//div[@class='form_row clearfix']//input[@name='pass']")
    private WebElement fbPassFld;

    @FindBy(xpath = "//div[@id='login_button_inline']/label[@id='loginbutton']")
    private WebElement fbSubmitBtn;

    @FindBy(xpath = "//label[@id='login-label']//input[@name='Login']")
    private WebElement mrEmailFld;

    @FindBy(xpath = "//label[@id='password-label']//input[@name='Password']")
    private WebElement mrPassFld;

    @FindBy(xpath = "//div[@class='login-form__footer']//button[@type='submit']")
    private WebElement mrSubmitBtn;

    @FindBy(xpath = "//div[@class='it_w']//input[@name='fr.email']")
    private WebElement okEmailFld;

    @FindBy(xpath = "//div[@class='it_w']//input[@name='fr.password']")
    private WebElement okPassFld;

    @FindBy(xpath = "//div[@class='form-actions']/input[@class='button-pro']")
    private WebElement okSubmitBtn;

    @FindBy(xpath = "//div[@class='domik-field']//input[@id='login']")
    private WebElement yaLoginFld;

    @FindBy(xpath = "//div[@class='domik-field']//input[@id='passwd']")
    private WebElement yaPassFld;

    @FindBy(xpath = "//div[@class='domik-submit-button']//button[@type='submit']")
    private WebElement yaSubmitBtn;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement gEmailFld;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement gPassFld;

    @FindBy(xpath = "//input[@id='signIn']")
    private WebElement gSignInBtn;

    @FindBy(xpath = "//input[@id='next']")
    private WebElement gNextBtn;

    @FindBy(xpath = "//input[@id='username_or_email']")
    private WebElement twLoginFld;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement twPassFld;

    @FindBy(xpath = "//input[@id='allow']")
    private WebElement twSubmitBtn;

    private WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    public void stepVkontakte(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(vkEmailFld));
        this.vkEmailFld.sendKeys(email);
        this.vkPassFld.sendKeys(pass);
        vkSubmitBtn.click();
    }

    public void stepFacebook(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(fbEmailFld));
        this.fbEmailFld.sendKeys(email);
        this.fbPassFld.sendKeys(pass);
        fbSubmitBtn.click();
    }

    public void stepMailRu(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(mrEmailFld));
        this.mrEmailFld.sendKeys(email);
        this.mrPassFld.sendKeys(pass);
        mrSubmitBtn.click();
    }

    public void stepOdnoklasniki(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(okEmailFld));
        this.okEmailFld.sendKeys(email);
        this.okPassFld.sendKeys(pass);
        okSubmitBtn.click();
    }

    public void stepYandex(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(yaLoginFld));
        this.yaLoginFld.sendKeys(email);
        this.yaPassFld.sendKeys(pass);
        yaSubmitBtn.click();
    }

    public void stepGmail(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(gEmailFld));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(G_EMAIL_FLD)));
        setTextAllJS(gEmailFld, email);
        waitSleep(300);
        clickJS(gNextBtn);
//        wait.until(ExpectedConditions.elementToBeClickable(gSignInBtn));
        setTextAllJS(gPassFld, pass);
        waitSleep(300);
        clickJS(gSignInBtn);
    }

    public void stepTwitter(String email, String pass) {
        wait.until(ExpectedConditions.visibilityOf(twLoginFld));
        this.twLoginFld.sendKeys(email);
        this.twPassFld.sendKeys(pass);
        twSubmitBtn.click();
////        if (isElementPresent(By.xpath("//input[@type='submit']"))) {
////            twSubmitBtn.click();
//        }

    }

    public void clickIcon(String socNetwork) {
        socialNetworkPage = new SocialNetworkPage();
        switch (socNetwork) {
            case "vkontakte":
                socialNetworkPage.clickVkIcon();
                break;
            case "facebook":
                socialNetworkPage.clickFbIcon();
                break;
            case "mailru":
                socialNetworkPage.clickMrIcon();
                break;
            case "odnoklasniki":
                socialNetworkPage.clickOkIcon();
                break;
            case "yandex":
                socialNetworkPage.clickYaIcon();
                break;
            case "gmail":
                socialNetworkPage.clickGIcon();
                break;
            case "twitter":
                socialNetworkPage.clickTwIcon();
                break;
            default:
                throw new AssertionError("unsupported social network identifier");

        }

    }


    public HomePage runStepsAuthorization(int iFrameNumber, String socNetwork, String emailInput, String passInput) {
        switch (iFrameNumber) {
            case 1:
                clickIcon(socNetwork);
                break;
            default:
                System.out.println("error ID");
        }


        Set<String> handles = Driver.get().getWindowHandles();
        int k = 0;
        while (handles.size() < 2){
            if (k > 35){
                break;
            }
            waitSleep(1000);
            k++;
        }


        Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]); //Переход в окно авторизации
//        wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='social']"))));


        try {
            switch (socNetwork) {
                case "vkontakte":
                    stepVkontakte(emailInput, passInput);
                    break;
                case "facebook":
                    stepFacebook(emailInput, passInput);
                    break;
                case "mailru":
                    stepMailRu(emailInput, passInput);
                    break;
                case "odnoklasniki":
                    stepOdnoklasniki(emailInput, passInput);
                    break;
                case "yandex":
                    stepYandex(emailInput, passInput);
                    break;
                case "gmail":
                    stepGmail(emailInput, passInput);
                    break;
                case "twitter":
                    stepTwitter(emailInput, passInput);
                    break;
                default:
                    throw new AssertionError("unsupported social network identifier");
            }

        } catch (NoSuchElementException noEl) {
            System.out.println("NoSuchElement Exception");
            Driver.get().close();
        } catch (Exception e) {
            System.out.println("EXCEPTION:" + e.toString());
            Driver.get().close();
        } finally {
            //System.out.println("2) FINALLY");
            Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);

            return new HomePage();
        }


    }
}