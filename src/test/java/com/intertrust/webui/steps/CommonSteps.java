package com.intertrust.webui.steps;

import com.intertrust.webui.common.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
    @After
    public void cleanUp() {
        Driver.driver.closeBrowser();
    }
    @Before
    public void startUp() {
        Driver.driver.startBrowser();
    }
}
