package com.intertrust.webui.common;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LinksChecker {
    public static void checkLink(String url, String expectedStatusCode) {
        String statusCode=Integer.toString(RestAssured.given()
                        .baseUri(url)
                        .when()
                        .get()
                        .statusCode());
        new SoftAssert().assertEquals(statusCode,expectedStatusCode,"Assertion failed with status code: "+statusCode+" at: "+url);
    }
}
