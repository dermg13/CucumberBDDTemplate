package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import pages.CommonPage;
import pages.DressesPage;

import utils.BrowserUtils;

public class DressesSteps implements CommonPage {
    DressesPage page;

    public DressesSteps(){
        page = new DressesPage();
    }


    @Then("Verify {string} are displayed")
    public void verifyAreDisplayed(String link) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, link))));
    }

    @When("user click {string} button")
    public void userClickButton(String dressesBtn) {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, dressesBtn)))
        );
    }
}


