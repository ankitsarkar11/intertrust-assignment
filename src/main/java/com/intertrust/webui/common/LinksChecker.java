package com.intertrust.webui.common;

import io.restassured.RestAssured;
import org.testng.Assert;

public class LinksChecker {
    public static void checkLink(String url, String expectedStatusCode) {
        String statusCode=Integer.toString(RestAssured.given()
                        .baseUri(url)
                        .when()
                        .get()
                        .statusCode());
        Assert.assertEquals(statusCode,expectedStatusCode,"Assertion failed with status code: "+statusCode+" at: "+url);
    }
}
