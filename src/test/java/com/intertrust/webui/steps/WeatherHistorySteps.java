package com.intertrust.webui.steps;

import com.intertrust.webui.WeatherHistoryPage;
import io.cucumber.java.en.Then;

public class WeatherHistorySteps {
    @Then("The Weather History page should open {string} as location")
    public void theWeatherHistoryPageShouldOpen(String location) {
        new WeatherHistoryPage().isLocationDataValid(location);
    }
    @Then("The Weather History page should open with empty data")
    public void theWeatherHistoryPageShouldOpenWithEmptyData() {
        new WeatherHistoryPage().isLocationDataInValid();
    }

    @Then("The Weather History page should show all the relevant graphs")
    public void theWeatherHistoryPageShouldShowAllTheRelevantGraphs() {
        new WeatherHistoryPage()
                .isTemperatureGraphVisible()
                .isPrecipitationGraphVisible()
                .isWindGraphVisible()
                .isDegreeDaysGraphVisible();
    }

    @Then("The Weather History page should have all the links working")
    public void theWeatherHistoryPageShouldHaveAllTheLinksWorking() {
        new WeatherHistoryPage().checkAllLinksInPage();
    }
}
