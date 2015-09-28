package UserProfile.ChangeTelephoneNumber.Negative;

import Data.TestDataProvider;
import core.BaseTest;
import org.testng.annotations.Test;
import ui.*;

/**
 * Created by user on 21.01.2015.
 */
public class C49525 extends BaseTest {

    private HomePage homePage;
    private PopUpPage popUpPage;
    private Asserts asserts;
    private UserProfile userProfile;
    private UserPage userPage;

    //    PreConditions
    String login = "globotest16";
    String password = "globotest";

    @Test(dataProvider = "C49522", dataProviderClass = TestDataProvider.class)
    public void inputLongTelephoneNumber(String currency, boolean bonus, boolean rules) {

    }
}
