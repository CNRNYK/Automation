package com.cybertek.tests.day004_basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class tagNameLocator {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

    }
}
