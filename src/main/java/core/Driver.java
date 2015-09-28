package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 03.12.2014.
 */
public class Driver {

    public static WebDriver driver;

    public static void set(WebDriver driverInput) {
       driver = driverInput;
    }

    public static WebDriver get() {return driver;}

    public static void init() {
        Properties properties = new Properties();
        FileInputStream propFile;
        try {
            propFile = new FileInputStream("test.properties");
            properties.load(propFile);
        }
        catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        Enumeration<String> e = (Enumeration<String>) properties.propertyNames();
        while (e.hasMoreElements()) {
            String key = e.nextElement();
            System.setProperty(key, properties.getProperty(key));
            Reporter.log(key + " - " + properties.getProperty(key), 2, true);
        }

        switch (System.getProperty("test.browser")) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome" :
//                System.out.println(System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "./../../chromedriver");
//                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().deleteAllCookies();
                break;
            case "safari":
                DesiredCapabilities safariCapabilities = DesiredCapabilities.safari();
                safariCapabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
                safariCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                driver = new SafariDriver(safariCapabilities);
//              driver = new SafariDriver();
                break;
            default:
        }

        System.out.println();       //WebDriver driverInput = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(
                Integer.parseInt(System.getProperty("test.timeout")),
                TimeUnit.SECONDS
        );
        driver.manage().window().maximize();
        Driver.set(driver);
    }

//    public static void deleteCookies() {
//        driver.manage().deleteAllCookies();
//    }







    public static void tearDown() {
        Driver.get().quit();
    }
}