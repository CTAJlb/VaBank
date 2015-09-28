package core;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 03.12.2014.
 */
public class Utils {

    public static String ID = "";

    public static String getGameSessionId() {
        //String id = "This is not game Test";
        if (isElementExist(By.xpath("/html/head/script[contains(., 'var game_session_id')]"))) {
            ID = Driver.get().findElement(By.xpath("/html/head/script[contains(., 'var game_session_id')]")).getAttribute("innerHTML");

            //System.out.print("START:");
            //id = id.replaceFirst("\n", "");
            ID = ID.replaceFirst("^[\n ]+[$var ]{4}", "");
            ID = ID.substring(0, 37);
            //ID = ID.replaceFirst("[';]{2}+[\na-z]", "XX");
            //System.out.print(id);

            //WebElement script = Driver.get().findElement(By.xpath("/html/head/script[contains(., 'var game_session_id')]"));
            //System.out.println(script.getAttribute("innerHTML"));
        }
        return ID;
    }

    public static boolean isElementPresent(By locator) {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> elements = Driver.get().findElements(locator);
        Driver.get().manage().timeouts().implicitlyWait(Integer.parseInt(System.getProperty("test.timeout")), TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    public static boolean isElementPresent(By locator, int timeout) {
        Driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        List<WebElement> elements = Driver.get().findElements(locator);
        Driver.get().manage().timeouts().implicitlyWait(Integer.parseInt(System.getProperty("test.timeout")), TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    public static boolean isElementExist(By locator) {
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> elements = Driver.get().findElements(locator);
        Driver.get().manage().timeouts().implicitlyWait(Integer.parseInt(System.getProperty("test.timeout")), TimeUnit.SECONDS);
        return elements.size() > 0;
    }

    public static void clickJSAll(WebElement someButton) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", someButton);
    }

    public static void clickJS(WebElement someButton) {
        if (System.getProperty("test.browser").equals("iexplore")) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", someButton);
        } else {
            someButton.click();
        }
    }

//    public static String switchCurrency(String... number) {
//        String result = number[0];
//        for(int i=1; i<number.length;i++){
//            result = String.valueOf(Double.valueOf(result)+Double.valueOf(number[i]));
//        }
//        if(result.substring(result.indexOf(".")).length()<3){
//            result = result+"0";
//        }
//        return result;
//    }

//    public static String switchCurrency() {
//        Driver.get().findElement(By.xpath("//span[@class='host-balance']/input[@type='text']")).getAttribute("value")
//    }


    public static WebElement setTextJS(WebElement someField, String someText) {
        if (System.getProperty("test.browser").equals("iexplore")) {
            someField.clear();
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].value='" + someText + "';", someField);
        } else {
            someField.sendKeys(someText);
        }
        return someField;
    }

    public static WebElement setTextAllJS(WebElement someField, String someText) {
        if (System.getProperty("test.browser").equals("htmlunit")) {
            someField.clear();
            someField.sendKeys(someText);
        } else {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].value='" + someText + "';", someField);
        }
        return someField;
    }

    public static WebElement setText(WebElement someField, String someText){
        someField.clear();
        someField.sendKeys(someText);
        return someField;
    }

    public static String getCurrentURL() {
        return Driver.get().getCurrentUrl();
    }

    public static WebElement setCheckbox(WebElement checkbox, boolean check) {
        if (true == check) {
            if (!checkbox.isSelected()) {
                clickJS(checkbox);
                //checkbox.click();
            }
        } else {
            if (checkbox.isSelected()) {
                clickJS(checkbox);
                //checkbox.click();
            }
        }
        return checkbox;
    }

    public static WebElement setCheckbox2(WebElement checkbox, boolean check) {
        if (false == check) {
            if (!checkbox.isSelected()) {
                clickJS(checkbox);
                //checkbox.click();
            }
        }
        return checkbox;
    }

    public static void waitSleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignore) {
        }
    }

    public static JSONArray getJson(String url) {

        JSONArray jsonArray = null;
        try {
            HttpGet request = new HttpGet(url);
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            String entityContents = EntityUtils.toString(entity);
            Object obj = JSONValue.parse(entityContents);
            jsonArray = (JSONArray) obj;
        } catch (Exception e) {
        }
        return jsonArray;
    }
}

