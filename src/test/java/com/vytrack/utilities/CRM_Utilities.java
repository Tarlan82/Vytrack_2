package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {


    //This method will login with helpedesk1 user when it is called
    public static void crm_login(WebDriver driver){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        inputPassword.sendKeys("UserUser");
        WebElement loginBTN = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBTN.click();


    }

    public static void crm_login(WebDriver driver,String username,String password){

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        inputPassword.sendKeys(password);
        WebElement loginBTN = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBTN.click();


    }


}
/*
Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password
 */