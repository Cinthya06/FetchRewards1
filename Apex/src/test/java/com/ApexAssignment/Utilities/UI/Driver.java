package com.ApexAssignment.Utilities.UI;

import com.ApexAssignment.Utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private Driver() {//making private Driver to make sure just one instance of Driver is being called
    }

    private static WebDriver driver; //making static driver instance to use it globally through project

    public static WebDriver get() {// method to get driver, ex :chrome,firefox, ie, etc
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");//reading from properties files where we can hide data
            System.out.println("Browser = " + browser);
            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    break;

                default:
                    System.out.println("No Browser found");

            }
        }
        return driver;

    }

    public void closeDriver(){
        driver.close();
    }
}





