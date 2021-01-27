package com.FetchRewards.StepDef;

import com.FetchRewards.Utilities.ConfigurationReader;
import com.FetchRewards.Utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    private static Logger logger = Logger.getLogger(Hooks.class);
    @BeforeClass
    public void setup() {

        logger.info("Info: Hooks - setup "); //setting up the report
        String browser = ConfigurationReader.getProperty("browser");
        if (!browser.contains("remote") && !browser.contains("mobile")) {
            Driver.get().manage().window().maximize();
        }


    }
    @BeforeStep
    public void navigate(){
        logger.info("Info: Hooks - navigate ");

        Driver.get().get(ConfigurationReader.getProperty("url"));
    }
    @AfterClass
    public void cleanUp(){
        logger.info("Info : Hooks - cleanUp");

        Driver.closeDriver();



    }
    @After
    public void teardown(Scenario scenario) {
//      if test fails takes screenshot
        if (scenario.isFailed()) {
            logger.error("Test failed!");
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } else {
            logger.info("Info : Hooks - teardown");
            logger.info("Test completed!");
        }

        //after every test, we gonna close browser
        Driver.closeDriver();
    }


}
