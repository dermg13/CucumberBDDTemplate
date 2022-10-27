package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class DressesPage {
    public DressesPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}


