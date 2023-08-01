package com.intertrust.webui;

import com.intertrust.webui.common.LinksChecker;
import com.intertrust.webui.templates.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class WeatherHistoryPage extends Page{
    public WeatherHistoryPage isLocationDataValid(String location) {
        try {
            Assert.assertTrue(driver.getText("//a[@id=\"locationDropdownMenuButton\"]").trim().matches(location));
            driver.setWaitTime(1, 1);
            Assert.assertTrue(driver.getText("//div[text()=\"Max temp\"]/../div[2]").matches("^[0-9]{1,2}℃$"));
            Assert.assertTrue(driver.getText("//div[text()=\"Min temp\"]/../div[2]").matches("^[0-9]{1,2}℃$"));
            driver.setWaitTime(60, 30);
        } catch (Exception e) {
            Assert.fail();
        }
        return this;
    }
    public WeatherHistoryPage isLocationDataInValid() {
        try {
            driver.setWaitTime(1, 1);
            driver.getDriver().findElement(By.xpath("//div[text()=\"Max temp\"]/../div[2]"));
            driver.setWaitTime(driver.DEFAULT_EXPLICIT_WAIT, driver.DEFAULT_IMPLICIT_WAIT);
        } catch(NoSuchElementException e) {
            Assert.assertTrue(true);
        }
        return this;
    }
    public WeatherHistoryPage isTemperatureGraphVisible() {
        driver.setWaitTime(1,1);
        Assert.assertTrue(driver.isElementVisible("//div[@class=\"chartcontainer temp\"]"));
        driver.setWaitTime(driver.DEFAULT_EXPLICIT_WAIT,driver.DEFAULT_IMPLICIT_WAIT);
        return this;
    }
    public WeatherHistoryPage isPrecipitationGraphVisible() {
        driver.setWaitTime(1,1);
        Assert.assertTrue(driver.isElementVisible("//div[@class=\"chartcontainer precip\"]"));
        driver.setWaitTime(driver.DEFAULT_EXPLICIT_WAIT,driver.DEFAULT_IMPLICIT_WAIT);
        return this;
    }

    public WeatherHistoryPage isWindGraphVisible() {
        driver.setWaitTime(1,1);
        Assert.assertTrue(driver.isElementVisible("//div[@class=\"chartcontainer wind\"]"));
        driver.setWaitTime(driver.DEFAULT_EXPLICIT_WAIT,driver.DEFAULT_IMPLICIT_WAIT);
        return this;
    }

    public WeatherHistoryPage isDegreeDaysGraphVisible() {
        driver.setWaitTime(1,1);
        Assert.assertTrue(driver.isElementVisible("//div[@class=\"chartcontainer degreedays\"]"));
        driver.setWaitTime(driver.DEFAULT_EXPLICIT_WAIT,driver.DEFAULT_IMPLICIT_WAIT);
        return this;
    }

    public WeatherHistoryPage checkAllLinksInPage() {
        List<WebElement> allAnchors=driver.getDriver().findElements(By.tagName("a"));
        LinksChecker.checkLink(allAnchors,"200");
        return this;
    }

}
