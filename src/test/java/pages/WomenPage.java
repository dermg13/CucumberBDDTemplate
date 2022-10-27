package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class WomenPage {
    public WomenPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
