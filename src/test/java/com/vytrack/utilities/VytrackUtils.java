package com.vytrack.utilities;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VytrackUtils {

    public static void login(String username,String password){


        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);

        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);


        Driver.getDriver().findElement(By.tagName("button")).click();



    }



    public static void loginAsDriver(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));

        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("driver_password"));


        Driver.getDriver().findElement(By.tagName("button")).click();


    }

    public static void loginAsSalesManager(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));

        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));


        Driver.getDriver().findElement(By.tagName("button")).click();


    }




    public static void waitTillLoaderMaskDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
