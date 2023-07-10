package com.intertrust.api.steps;

import com.intertrust.api.TimelineAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

public class TimelineAPISteps {
    private TimelineAPI timelineAPI;
    @Given("Users hits the timeline API with location as {string}")
    public void userHitsTheTimelineAPIWithLocation(String location) {
        timelineAPI=new TimelineAPI();
        timelineAPI.fetchTimelineDataForLocation(location);
    }
    @Then("Status code for the timeline API should be {string}")
    public void statusCodeForTheTimelineAPIShouldBe(String statusCode) {
        timelineAPI.isStatusCode(Integer.parseInt(statusCode));
    }
    @Then("Timeline API should return data of the given location")
    public void timelineAPIShouldReturnDataOfGivenLocation() {
        timelineAPI.isResolvedAddressAccurate();
    }
    @Then("Timeline API should cost {string} credit")
    public void timelineAPIShouldCostCredit(String credit) {
        timelineAPI.isCostCorrect(credit);
    }
    @Then("Timeline API should respond in the {string} timezone")
    public void timelineAPIShouldRespondInTheExpectedTimeZone(String timeZone) {
        timelineAPI.isTimeZoneCorrect(timeZone);
    }

}
