package com.cybertek.tests.day012_PropertiesTest;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void OpenBrowserWithConf(){

        driver.get(ConfigurationReader.get("url"));

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.TAB);

    }

    @Test
    public void Test(){
        Driver.get();

        Driver.closeDriver();

    }
}