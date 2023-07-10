package com.intertrust.webui.common;

import io.restassured.RestAssured;
import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LinksChecker {
    public static void checkLink(List<WebElement> urls, String expectedStatusCode) {
        SoftAssert softAssert=new SoftAssert();
        for(WebElement url: urls) {
            String href=url.getAttribute("href");
            if(href.contains("visualcrossing.com") && href.startsWith("https://")) {
                try {
                    String statusCode = Integer.toString(RestAssured.given()
                            .baseUri(href)
                            .when()
                            .get()
                            .statusCode());
                    softAssert.assertEquals(statusCode, expectedStatusCode, "Assertion failed with status code: " + statusCode + " at: " + href);
                } catch (NullPointerException e) {
                    softAssert.fail("Assertion failed due to failure in sending request at: " + href);
                } catch (Exception e) {
                    softAssert.fail("Assertion failed due to malformed response at: " + href);
                }
            }
        }
        softAssert.assertAll();
    }
}
