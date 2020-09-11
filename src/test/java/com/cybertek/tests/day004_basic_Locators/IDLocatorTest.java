package com.cybertek.tests.day004_basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IDLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button = driver.findElement(By.id("disappearing_button"));
        button.click();

        List<WebElement> myList = driver.findElements(By.tagName("button"));
        myList.get(3).click();
        button.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
