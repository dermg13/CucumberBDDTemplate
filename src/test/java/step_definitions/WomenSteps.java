package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import pages.CommonPage;
import pages.WomenPage;
import utils.BrowserUtils;

public class WomenSteps implements CommonPage {
    WomenPage page;

    public WomenSteps(){
        page = new WomenPage();
    }
    @Then("Verify my account {string} are displayed")
    public void verifyMyAccountAreDisplayed(String link) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, link))));
    }
}
