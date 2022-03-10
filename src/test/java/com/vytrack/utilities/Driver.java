package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public  class Driver {

    /*
    Creating a private constructor so we are closing access
    to create the object of this class from outside of the class
     */

    private Driver(){}

    /*
    We make driver private because we want to close from outside of the class
     */
    private static WebDriver driver;

    /*
    create a re-usable utility method which will return same driver instance when we call it
     */

    public static WebDriver getDriver(){

        if (driver == null){
            /*
            We read oyr browserType from configuration.properties
            This way,we can control which browser is opened from outside our code from config.properties
             */
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }


        }
        return driver;

    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();//this line will terminate the existing session value will not even be null
            driver = null;
        }


    }



}
