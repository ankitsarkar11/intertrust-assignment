package com.intertrust.webui;

import com.intertrust.webui.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CookiePopup {
    private final Driver driver;
    public CookiePopup() {
        this.driver= Driver.driver;
    }
    public CookiePopup clickOnAcceptAllCookies() {
        driver.clickOnElement("//button[text()=\"Accept all cookies\"]");
        return this;
    }
    public CookiePopup isCookieModalDisappeared() {
        Assert.assertFalse(driver.getDriver().findElement(By.id("cookieModalLabel")).isDisplayed());
        return this;
    }
}
