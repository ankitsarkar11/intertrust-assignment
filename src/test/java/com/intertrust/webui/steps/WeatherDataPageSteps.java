package com.intertrust.webui.steps;

import com.intertrust.webui.WeatherDataPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherDataPageSteps {
    @Then("The Weather Data page should be open")
    public void thePageShouldBeOpen() {
        new WeatherDataPage().isWeatherDataPageOpen();
    }
    @When("User enters {string} in the location search box and clicks on Search button")
    public void userEntersTheLocationAndClicksOnSearchButton(String location) {
        new WeatherDataPage().enterLocation(location).clickOnSearchButton();
    }
}
