package ui;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 18.12.2014.
 */
public class SocialNetworkPage extends PageFactorySettings {

    @FindBy(xpath = "//span[@class='globologin-vk']" )
    private WebElement vkIcon;

    @FindBy(xpath = "//span[@class='globologin-fb']")
    private WebElement fbIcon;

    @FindBy(xpath = "//span[@class='globologin-ok']")
    private WebElement  okIcon;

    @FindBy(xpath = "//span[@class='globologin-ya']")
    private WebElement  yaIcon;

    @FindBy(xpath = "//span[@class='globologin-mr']" )
    private WebElement  mrIcon;

    @FindBy(xpath = "//span[@class='globologin-tw']")
    private WebElement  twIcon;

    @FindBy(xpath = "//span[@class='globologin-gg']")
    private WebElement  gIcon;

    public SocialNetworkPage clickVkIcon() {
        vkIcon.click();
        return new SocialNetworkPage();
    }

    public SocialNetworkPage clickFbIcon() {
        fbIcon.click();
        return new SocialNetworkPage();

    }

    public SocialNetworkPage clickOkIcon() {
        okIcon.click();
        return new SocialNetworkPage();

    }

    public SocialNetworkPage clickYaIcon() {
        yaIcon.click();
        return new SocialNetworkPage();

    }

    public SocialNetworkPage clickMrIcon() {
        mrIcon.click();
        return new SocialNetworkPage();
    }

    public SocialNetworkPage clickTwIcon() {
        twIcon.click();
        return new SocialNetworkPage();
    }

    public SocialNetworkPage clickGIcon() {
        gIcon.click();
        return new SocialNetworkPage();
    }





}
