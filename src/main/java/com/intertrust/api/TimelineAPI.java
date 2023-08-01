package com.intertrust.api;

import com.intertrust.api.common.APICredentials;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.testng.Assert;

import java.sql.Time;

public class TimelineAPI {
    private Response response;
    private String location;
    public TimelineAPI fetchTimelineDataForLocation(String location) {
        this.location=location;
        this.response=RestAssured.given()
                .baseUri("https://weather.visualcrossing.com")
                .when()
                    .get("/VisualCrossingWebServices/rest/services/timeline/"+location+"?unitGroup=metric&key="+APICredentials.apiKey+"&contentType=json");
        return this;

    }
    public TimelineAPI isStatusCode(int expectedStatusCode) {
        response.then().assertThat().statusCode(expectedStatusCode);
        return this;
    }
    public void printResponse() {
        System.out.print(response.asString());
    }
    public TimelineAPI isResolvedAddressAccurate() {
        response.then().assertThat().body("resolvedAddress", Matchers.containsStringIgnoringCase(this.location));
        return this;
    }
    public TimelineAPI isCostCorrect(String expectedCredit) {
        try{
            response.then().assertThat().body("queryCost",Matchers.equalTo(Integer.parseInt(expectedCredit)));
        } catch(NumberFormatException e){
            Assert.fail(expectedCredit+" is not a valid integer", e);
        }
        return this;
    }
    public TimelineAPI isTimeZoneCorrect(String expectedTimeZone) {
        response.then().assertThat().body("timezone",Matchers.equalTo(expectedTimeZone));
        return this;
    }
}