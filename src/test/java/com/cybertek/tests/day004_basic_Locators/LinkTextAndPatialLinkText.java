package com.cybertek.tests.day004_basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPatialLinkText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link1 = driver.findElement(By.linkText("Example 2: Element on the page that is rendered after the trigger"));
        link1.click();
        WebElement link2 = driver.findElement(By.partialLinkText("Example 3"));
        link1.click();

    }
}
