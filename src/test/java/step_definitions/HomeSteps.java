package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps(){
        page = new HomePage();
    }

    @Given("User opens url of homepage")
    public void user_opens_url_of_homepage() {
        BrowserUtils.getDriver();
    }
    @Then("Verify title of page")
    public void verify_title_of_page() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "My Store");
    }

    @When("User clicks on search field")
    public void userClicksOnSearchField() {
        BrowserUtils.click(page.searchField);
    }

    @And("User enters something in field")
    public void userEntersSomethingInField() {
        BrowserUtils.sendKeys(page.searchField, "dress");
    }

    @Then("Verify search button is enabled")
    public void verifySearchButtonIsEnabled() {
        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.searchBtn));
    }


    }

