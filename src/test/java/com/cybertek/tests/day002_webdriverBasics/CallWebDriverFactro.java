package com.cybertek.tests.day002_webdriverBasics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactro {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("title = " + title);

    }
}
