package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US5_Tests_Vehicle_Models_Table extends TestBase {

    @Test
    public void verify_columns_as_sales_manager(){
        //login as sales manager
        VytrackUtils.loginAsSalesManager();
        //go to fleet tab
        String fleetTabElementLocator = "//*[@id=\"main-menu\"]/ul/li[2]/a/span";
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath(fleetTabElementLocator))).perform();
        BrowserUtils.sleep(5);


    }


}
