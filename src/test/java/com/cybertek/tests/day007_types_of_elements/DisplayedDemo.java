package com.cybertek.tests.day007_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));

//        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        Assert.assertFalse(usernameInput.isDisplayed(),"verify input not displayed");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"start\"]/button"));
        button.click();
        Thread.sleep(5000);
//        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());
        Assert.assertTrue(usernameInput.isDisplayed(),"verify input not displayed");



        driver.quit();


    }

}
