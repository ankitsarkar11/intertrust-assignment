package com.intertrust.webui;

import com.intertrust.webui.common.Driver;
import org.testng.Assert;

public class HomePage {
    private final Driver driver;
    public HomePage() {
        this.driver=Driver.driver;
    }
    public HomePage openHomePage() {
        driver.openPage("https://www.visualcrossing.com/");
        return this;
    }
    public HomePage isHomePageOpen() {
        Assert.assertTrue(driver.getDriver().getTitle().matches("Weather Data & Weather API \\| Visual Crossing"));
        return this;
    }
    public HomePage clickONavigationLink(String navigationLinkText) {
        driver.clickOnElement("//li[@class=\"nav-item\"]//a[text()=\""+navigationLinkText+"\"]");
        return this;
    }
}
