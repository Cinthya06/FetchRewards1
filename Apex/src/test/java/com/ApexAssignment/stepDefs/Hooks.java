package com.ApexAssignment.stepDefs;

import com.ApexAssignment.Utilities.ConfigurationReader;
import com.ApexAssignment.Utilities.UI.Driver;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Hooks {
   public static Logger logger=Logger.getLogger(Hooks.class);
    @BeforeClass
    public void setUp(){//set up the driver
        logger.info("Info = Hooks : setUp");//reports using log4j
        String browser= ConfigurationReader.getProperty("browser");

        Driver.get().manage().window().maximize();



    }
    @AfterClass
    public void cleanUp(){
        logger.info("Info = Hooks : cleanUp");

        Driver.get().close();

    }
}
