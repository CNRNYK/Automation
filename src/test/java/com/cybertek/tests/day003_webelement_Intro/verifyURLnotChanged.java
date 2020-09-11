package com.cybertek.tests.day003_webelement_Intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {
        /*Verify URL not changed
            -open chrome browser
            -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
            -click on Retrieve password
            -verify that url did not change

         */

        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedURL = driver.getCurrentUrl();

        // click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        String  actualURL = driver.getCurrentUrl();

        // verify that url did not change

        if (expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else System.out.println("fail");

        // close your driver
        driver.quit();

    }
}
