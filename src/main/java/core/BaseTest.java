package core;


import org.openqa.selenium.By;
import org.testng.annotations.*;
import ui.HomePage;

import static core.Utils.isElementPresent;

/**
 * Created by user on 03.12.2014.
 */
@Listeners(ScreenshotListener.class)

public class BaseTest {


    @BeforeSuite
    public void init() {
        Driver.init();
    }

    @BeforeClass
    public HomePage checkUnlogin() {
        HomePage.open();

        if (isElementPresent(By.xpath("//a[@id='logout']"))) {
            Driver.get().findElement(By.xpath("//a[@id='logout']")).click();
        }
        return new HomePage();

    }




    @AfterTest
    public void cleanup() {
        Driver.tearDown();

    }
}
