package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.TShirtsPage;
import utils.BrowserUtils;

import java.util.List;

public class TShirtsSteps implements CommonPage {
    TShirtsPage page;

    public TShirtsSteps(){
        page = new TShirtsPage();
    }
    @Then("Verify the following {string} are displayed")
    public void verify_the_following_are_displayed(String linkTextBtn) {

           BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                   By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkTextBtn))));
       }
    }

