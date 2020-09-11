package com.cybertek.tests.day005_xPATH;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");
        
    }
}
