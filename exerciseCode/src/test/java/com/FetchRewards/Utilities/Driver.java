package com.FetchRewards.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {
    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            System.out.println("browser = " + browser);
            switch (browser) {
                case "chrome":
                    ChromeOptions option = new ChromeOptions();
                    option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(option);
                    break;




            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}










