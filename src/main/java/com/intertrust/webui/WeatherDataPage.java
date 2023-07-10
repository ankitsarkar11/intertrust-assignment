package com.intertrust.webui;

import com.intertrust.webui.common.Driver;
import org.testng.Assert;

public class WeatherDataPage {
    private Driver driver;
    public WeatherDataPage() {
        this.driver=Driver.driver;
    }
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
