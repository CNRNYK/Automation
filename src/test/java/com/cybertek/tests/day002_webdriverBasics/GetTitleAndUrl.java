package com.cybertek.tests.day002_webdriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        System.out.println(driver.getTitle());

        System.out.printf("caner", driver.getTitle());

        String title = driver.getTitle();

        System.out.println("title = " + title);

        System.out.println("driver = " + driver);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("driver.getPageSource() = " + driver.getPageSource());

    }
}
