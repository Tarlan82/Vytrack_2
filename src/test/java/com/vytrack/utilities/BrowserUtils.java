package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {


    public static   void  sleep (int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    //When method is called, it should switch window and verify title.
    public static void switchWindowVerify(WebDriver driver,String expectedInUrl,String expectedTitle){
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    //This method accepts a String expectedTitle and Asserts if it is true
    public static void verifyTitle(WebDriver driver,String expectedTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

    }


}
/*
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.


Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
 */