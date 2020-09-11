package com.cybertek.tests.day004_basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // make window full screen
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("caner@gmail.com");


        // proper way
        WebElement button = driver.findElement(By.name("wooden_spoon"));
        button.click();

        // lazy waysame

        driver.findElement(By.id("wooden_spoon")).click();


        Thread.sleep(5000);
        driver.quit();

    }
}
