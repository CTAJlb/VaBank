package ui;

import core.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 04.12.2014.
 */
public abstract class PageFactorySettings {

    public PageFactorySettings() {
        PageFactory.initElements(Driver.get(), this);}
}
