package com.intertrust.webui.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private WebDriver webDriver;
    private WebDriverWait wait;
    public final int DEFAULT_IMPLICIT_WAIT=30;
    public final int DEFAULT_EXPLICIT_WAIT=60;
    private Driver() {}
    public static Driver driver=new Driver();
    public WebDriver getDriver() {
        return this.webDriver;
    }
    public void startBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        webDriver=new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait=new WebDriverWait(this.webDriver,Duration.ofSeconds(60));
    }
    public void openPage(String url) {
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }
    public void clickOnElement(String xpath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }
    public void enterText(String xpath,String text) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).sendKeys(text);
    }
    public String getText(String xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
    }
    public void closeBrowser() {
        webDriver.quit();
    }
    public void setWaitTime(int explicitWaitInSeconds) {
        this.wait=new WebDriverWait(webDriver,Duration.ofSeconds(explicitWaitInSeconds));
    }
    public void setWaitTime(int explicitWaitInSeconds,int implicitWaitInSeconds) {
        this.wait=new WebDriverWait(webDriver,Duration.ofSeconds(explicitWaitInSeconds));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitInSeconds));
    }
    public Boolean isElementVisible(String xpath) {
        try {
            return webDriver.findElement(By.xpath(xpath)).isDisplayed();
        } catch(Exception e) {
            return false;
        }
    }
}
