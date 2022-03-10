package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver,String customerName){

        return driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]")).getText();


    }

    //Method #2 info:
    //• Name: orderVerify ()
    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){
    String actual = driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]")).getText();

        Assert.assertEquals(actual,expectedOrderDate);


    }

    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate
    //This method should accept above mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.



}
/*
1. Create a new class called WebTableUtils.
2. Create two methods to verify order


Method #1 info:
• Name: returnOrderDate ()
• Return type: String
• Arg1: WebDriver driver
• Arg2: String costumerName
This method should accept a costumerName and return the costumer order date
as a String.
 */