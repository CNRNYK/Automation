package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    // Write a static method that takes a string parameter name: browserType
    // it will setup the

    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;

        switch ((browserType.toLowerCase())){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("*********** wrong information *********** for browserType : " + browserType+
                        "\nbrowserType should be firefox , chrome or ie");
        }
        return driver;
    }

}
