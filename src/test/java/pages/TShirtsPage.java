package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class TShirtsPage {
    public TShirtsPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
