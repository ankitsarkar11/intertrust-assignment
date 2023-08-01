package com.intertrust.webui;

import com.intertrust.webui.templates.Page;

import org.testng.Assert;

public class WeatherDataPage extends Page{
    public WeatherDataPage isWeatherDataPageOpen() {
        Assert.assertTrue(driver.getDriver().getTitle().matches("Historical Weather Data & Weather Forecast Data \\| Visual Crossing"));
        return this;
    }
    public WeatherDataPage enterLocation(String location) {
        driver.enterText("//input[@id=\"wxlocation\" and @type=\"text\"]",location);
        return this;
    }
    public WeatherDataPage clickOnSearchButton() {
        driver.clickOnElement("//button[@type=\"submit\" and text()=\"Search\"]");
        return this;
    }
}
