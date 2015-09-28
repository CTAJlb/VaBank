package HomePage;

import core.BaseTest;
import org.testng.annotations.Test;
import ui.HomePage;

public class HomePageOpen extends BaseTest {

    private HomePage homePage;

    @Test
    public void visitHomepage () {

    HomePage homePage = HomePage.open();
    }
}
