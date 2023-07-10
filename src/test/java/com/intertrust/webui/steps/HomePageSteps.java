package com.intertrust.webui.steps;

import com.intertrust.webui.HomePage;
import com.intertrust.webui.WeatherDataPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    @Given("User opens the visual crossing website")
    public void userOpenTheVisualCrossingWebsite() {
        new HomePage().openHomePage();
    }
    @Then("The home page should be open")
    public void theHomePageShouldBeOpen() {
        new HomePage().isHomePageOpen();
    }
    @When("User clicks on {string} navigation link")
    public void userClicksOnNavigationLink(String linkText) {
        new HomePage().clickONavigationLink(linkText);
    }
}
