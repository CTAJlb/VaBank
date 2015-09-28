package ui;


import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static core.Utils.*;

/**
 * Created by user on 23.12.2014.
 */
public class CashPage extends PageFactorySettings {

    public final String cashTerminalCSS = "div.kassa_terminal";
    public final String validThruNAME = ".sel_arraw";
    public final String bankCardsErrMsgXPATH = ".//div[@class='text other_error']";
    public final String smsInstructorXPATH = "//div[@class='payment_message sms_sent']//h4";

    @FindBy(xpath = "//*[@alt='Bank Cards']")
    private WebElement creditCardBtn;

    @FindBy(xpath = "//*[@alt='Qiwi']")
    private WebElement qiwiBtn;

    @FindBy(xpath = "//*[@alt='Yandex Money']")
    private WebElement yandexBtn;

    @FindBy(xpath = "//*[@alt='WebMoney']")
    private WebElement webMoneyBtn;

    @FindBy(xpath = "//*[@alt='PSB online']")
    private WebElement psbBtn;

    @FindBy(xpath = "//*[@alt='Alfa-Click']")
    private WebElement alfaclickBtn;

    @FindBy(xpath = "//*[@alt='Moneta.ru']")
    private WebElement monetaBtn;

    @FindBy(xpath = "//*[@alt='LiqPay']")
    private WebElement liqPayBtn;

    @FindBy(xpath = "//*[@alt='Interkassa']")
    private WebElement intercassaBtn;

    @FindBy(xpath = "//*[@alt='Mobile Commerce']")
    private WebElement sMsBtn;

    @FindBy(xpath = "//*[@alt='Moneybookers']")
    private WebElement skrillBtn;

    @FindBy(xpath = "//*[@alt='W1.Ru']")
    private WebElement w1Btn;

    @FindBy(css = "#phone")
    private WebElement phoneFld;

    @FindBy(xpath = "//li[@class='menu_clickable item__payout']")
    private WebElement payOutBtn;

    @FindBy(xpath = "//li[@class='menu_clickable item__finance']")
    private WebElement paymentHistoryBtn;




    @FindBy(xpath = "//label[@for='new_card']")
    private WebElement addNewCard;

    @FindBy(xpath = "//input[@id='new_card_number']")
    private WebElement cardNumberField;

    @FindBy(xpath = "//input[@id='card_holder']")
    private WebElement cardHolderField;

    @FindBy(xpath = "//input[@id='cvv']")
    private WebElement cvvField;

    @FindBy(css = ".customer_purse.zf")
    private WebElement customerWalletFld;

    @FindBy(css = ".zf.custom_amount")
    private WebElement payOutAmountFld;

    @FindBy(css = ".zf.zf-submit")
    private WebElement getMoneyBtn;

    @FindBy(css = ".message_content_inner>h2")
    private WebElement noMoneyMsg;

    @FindBy (css = cashTerminalCSS)
    private WebElement cashTerminal;


    @FindBy(xpath = "//div[@class='popup_close']")
    private WebElement close_popup_cash;

    @FindBy(xpath = "//ul[@id='payment_amount_list']//label")
    private List<WebElement> amountValues;

    @FindBy(xpath = "//input[@id='amount_input']")
    private WebElement customSumField;

    @FindBy(xpath = "//button[@id='submit_button']")
    private WebElement submitPayButton;

    @FindBy(xpath = "//button[@class='pretty_button']")
    private WebElement submitErrorMsg;

    @FindBy(xpath = "//th[@class='order_number']/div")
    private WebElement historyNumber;

    @FindBy(xpath = "//th[@class='date']")
    private WebElement historyDate;

    @FindBy(xpath = "//th[@class='amount']/div")
    private WebElement historyAmount;

    @FindBy(xpath = "//th[@class='type']")
    private WebElement historyoperType;

    @FindBy(xpath = "//th[@class='payment_info']")
    private WebElement historyWallet;

    private MenuPage menuPage;
    private WebDriverWait wait = new WebDriverWait(Driver.get(), 35);

    public void checkHistoryColumns(String numberText, String dateText, String sumText, String typeText, String walletText) {

        menuPage = new MenuPage();
        menuPage.clickCashPage();
        waitSleep(1500);
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector("#iframeBank + iframe")));

        paymentHistoryBtn.click();

        Assert.assertEquals(historyNumber.getText(), numberText);
        Assert.assertEquals(historyDate.getText(), dateText);
        Assert.assertEquals(historyAmount.getText(), sumText);
        Assert.assertEquals(historyoperType.getText(), typeText);
        Assert.assertEquals(historyWallet.getText(), walletText);

    }

    public void checkCashPaylocator(String locator) {
        isElementPresent(By.xpath(locator));

    }


    public void closeCashPopup() {
        close_popup_cash.click();
    }

    public void doubleClickValidThru(String locatorNAME) {
        cashTerminal.findElement(By.cssSelector(locatorNAME)).click();
        cashTerminal.findElement(By.cssSelector(locatorNAME)).click();
    }

    public void fillInPayForm(String paySystem, String addParameter, String expAmountValues, String sumToPay) {
        menuPage = new MenuPage();
        menuPage.clickCashPage();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#iframeBank + iframe")));
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector("#iframeBank + iframe")));

        switch (paySystem) {
            case "credCards":
                checkCashPaylocator("//*[@alt='Bank Cards']");
                creditCardBtn.click();
                if (isElementPresent(By.xpath("//label[@for='new_card']"))) {
                    addNewCard.click();
                }

                wait.until(ExpectedConditions.visibilityOf(cardNumberField));
                setTextJS(cardNumberField, addParameter);
                cardNumberField.click();
                cardNumberField.sendKeys(Keys.END);

                setTextJS(cardHolderField, "TEST EGOR BATKOVICH");
                cardHolderField.click();
                cardHolderField.sendKeys(Keys.END);

                setTextJS(cvvField, "123");
                cvvField.click();
                cvvField.sendKeys(Keys.END);
//                cardHolderField.sendKeys(Keys.END);
                doubleClickValidThru(validThruNAME);
                break;

            case "qiwi":
                checkCashPaylocator("//*[@alt='Qiwi']");
                qiwiBtn.click();
                waitSleep(500);
                phoneFld.clear();
                setTextJS(phoneFld, addParameter);
                break;

            case "yandex":
                checkCashPaylocator("//*[@alt='Yandex Money']");
                yandexBtn.click();
                break;

            case "webmoney":
                checkCashPaylocator("//*[@alt='WebMoney']");
                webMoneyBtn.click();
                break;

            case "psb":
                checkCashPaylocator("//*[@alt='PSB online']");
                psbBtn.click();
                break;

            case "alfa":
                checkCashPaylocator("//*[@alt='Alfa-Click']");
                alfaclickBtn.click();
                break;

            case "moneta":
                checkCashPaylocator("//*[@alt='Moneta.ru']");
                monetaBtn.click();
                break;

            case "liqpay":
                checkCashPaylocator("//*[@alt='LiqPay']");
                liqPayBtn.click();
                break;

            case "inercassa":
                checkCashPaylocator("//*[@alt='Interkassa']");
                intercassaBtn.click();
                break;

            case "sms":
                checkCashPaylocator("//*[@alt='Mobile Commerce']");
                sMsBtn.click();
                waitSleep(500);
                phoneFld.clear();
                setTextJS(phoneFld, addParameter);
                break;

            case "skrill":
                checkCashPaylocator("//*[@alt='Moneybookers']");
                skrillBtn.click();
                break;

            case "w1":
                checkCashPaylocator("//*[@alt='W1.Ru']");
                w1Btn.click();
                break;

        }
        checkAmountValues(expAmountValues);
        customSumField.click();
        customSumField.clear();
        setTextJS(customSumField, sumToPay);
        customSumField.click();
        customSumField.sendKeys(Keys.END);
        wait.until(ExpectedConditions.elementToBeClickable(submitPayButton));
        submitPayButton.click();
    }

    public void checkPayOutErrorMsg(String payTool, String wallet, String sum, String errorMsg) {
        menuPage = new MenuPage();
        menuPage.clickCashPage();
        waitSleep(1500);
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector("#iframeBank + iframe")));

        //paymentHistoryBtn.click();

        //depositBtn.click();

        payOutBtn.click();
        switch (payTool) {
            case "qiwi":
                qiwiBtn.click();
                break;
            case "skrill":
                skrillBtn.click();
                break;
            case "webMoney":
                webMoneyBtn.click();
                break;
            case "yandex":
                yandexBtn.click();
                break;
            case "moneta":
                monetaBtn.click();
                break;
            default:
                throw new AssertionError("unsupported payTool identifier");

        }





        //#customerWalletFld.clear();
        //#customerWalletFld.sendKeys(wallet);
        customerWalletFld.clear();

        setTextJS(customerWalletFld, wallet);
        //*customerWalletFld.click();
        //*customerWalletFld.sendKeys(Keys.END);

        //#payOutAmountFld.clear();
        //#waitSleep(200);
        //#payOutAmountFld.sendKeys(sum);
        //*customerWalletFld.click();
        payOutAmountFld.clear();
        //#amountFld.sendKeys(sumToPay);
        setTextJS(payOutAmountFld, sum);
        payOutAmountFld.click();
        payOutAmountFld.sendKeys(Keys.END);

        getMoneyBtn.click();

        Assert.assertEquals(noMoneyMsg.getText(), errorMsg, "Error message was not as expected");
    }

    public void checkCashWindowUrl(String paySystem, String expURL, String waitLocator) {
        String mwh = Driver.get().getWindowHandle();
        waitSleep(5000);

//        payCreditCardBtn.click();

        switch (paySystem) {
            case "credCards":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bankCardsErrMsgXPATH)));
                System.out.println(Driver.get().findElement(By.xpath(bankCardsErrMsgXPATH)).getText());
                Assert.assertEquals(Driver.get().findElement(By.xpath(bankCardsErrMsgXPATH)).getText(), "Произошла системная ошибка. Служба поддержки: support@va-bank.com +44 208 123 5605");
                break;
            case "sms":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='payment_message sms_sent']")));
                System.out.println(Driver.get().findElement(By.xpath(smsInstructorXPATH)).getText());
                Assert.assertEquals(Driver.get().findElement(By.xpath(smsInstructorXPATH)).getText(), "На указанный вами номер отправлено SMS с инструкциями для совершения оплаты");
                break;

            default:
                Set s = Driver.get().getWindowHandles();
                //System.out.println(s);
                Iterator ite = s.iterator();

                while (ite.hasNext()) {
                    String popupHandle = ite.next().toString();

                    if (!popupHandle.contains(mwh)) {
                        Driver.get().switchTo().window(popupHandle);
                        //System.out.println(popupHandle);
                    }
                }

                try {
                    WebDriverWait wait1 = new WebDriverWait(Driver.get(), 90);
                    wait1.until(ExpectedConditions.visibilityOf(Driver.get().findElement(By.xpath(waitLocator))));
//                    wait.until(ExpectedConditions.visibilityOf(Driver.get().findElement(By.xpath(waitLocator))));
                    Assert.assertTrue(Driver.get().getCurrentUrl().contains(expURL), "URL Cash Pay System was not as expected");
                } finally {


                    Driver.get().close();
                    Driver.get().switchTo().window(mwh);
                }
        }
    }




    private String getAmountValues() {
        waitSleep(500);
        List<String> amValues = new ArrayList<>();
        for (int i = 0; i < amountValues.size(); i++) {
            amValues.add(i, amountValues.get(i).getText());
        }

        return amValues.toString();
    }

    private void checkAmountValues(String expAmountVal) {
        String actAmountVal = getAmountValues();
        //System.out.println(actAmountVal);

        Assert.assertEquals(actAmountVal, expAmountVal, "Amoutn values were not as expected");


    }
}











