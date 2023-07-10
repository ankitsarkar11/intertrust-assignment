package com.intertrust.webui.steps;

import com.intertrust.webui.CookiePopup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CookiePopupPageSteps {
    @When("User clicks on Accept all cookies button on the cookie popup")
    public void userAcceptsAllCookies() {
        new CookiePopup().clickOnAcceptAllCookies();
    }
    @Then("The cookie popup should disappear")
    public void theCookiePopupShouldDisappear() {
        new CookiePopup().isCookieModalDisappeared();
    }
}
