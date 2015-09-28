package ui;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static core.Utils.isElementPresent;
import static core.Utils.waitSleep;

/**
 * Created by user on 07.12.2014.
 */
public class UserPage extends PageFactorySettings {

    public final String firstTableCSS = "#table.popup_container";

    @FindBy(xpath = "//a[@id='logout']")
    private WebElement logoutBtn;

    @FindBy(xpath = "//a[@class='profile_dialog_open my_cabinet_link']" )
    private WebElement userProfile;

    @FindBy(xpath = "//a[@class='standart']/..//a[@class='select_btn_fix select_btn popup_btn choice_submit_btn']")
    private WebElement firstTableBtn;




   public void clickUserProfile() {
       userProfile.click();
   }





   public void logOut() {

       if (isElementPresent(By.xpath("//a[@id='logout']"))) {
           logoutBtn.click();
           waitSleep(10000);
       }
   }

    public String setTheGameTable(String gameName) {
        String postURL = "";
        if (isElementPresent(By.cssSelector(firstTableCSS), 3)) {
            System.out.println( Driver.get().findElement(By.xpath("//a[@href='/play/" + gameName + "/1']")));
            Driver.get().findElement(By.xpath("//a[@href='/play/" + gameName + "/1']")).click();
            postURL = "/play/"+ gameName + "/1";
            //} else if (isElementPresent(By.xpath(firstTable2BtnXPATH))) {
            //    clickFirstTable2Btn();
            //    postURL = "/1";
        }


        return postURL;

    }
}
