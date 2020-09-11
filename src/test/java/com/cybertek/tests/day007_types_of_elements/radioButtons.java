package com.cybertek.tests.day007_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class radioButtons {

        @BeforeMethod
        public void test1() throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/radio_buttons");

            //locating radio buttons
            WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
            WebElement redRadioBtn = driver.findElement(By.id("red"));

            //how to check radio button is selected ?
            System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
            System.out.println("redRadioBtn.isSelected() = " + redRadioBtn.isSelected());


            //verify blue is selected red is not selected
            //blue --> true
            Assert.assertTrue(blueRadioBtn.isSelected(),"verify that blue is selected");
            //red-->false
            Assert.assertFalse(redRadioBtn.isSelected(),"verify that red is NOT selected");

            //how to click radio button ?
            //clicking red radio button
            redRadioBtn.click();

            //blue --> false
            Assert.assertFalse(blueRadioBtn.isSelected(),"verify that blue is NOT selected");
            //red-->false
            Assert.assertTrue(redRadioBtn.isSelected(),"verify that red is selected");


            Thread.sleep(3000);
            driver.quit();
        }

        @Test
    public void test2() throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/dynamic_controls");

            WebElement enable = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
            enable.click();
            Thread.sleep(4000);
            enable = enable.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
            enable.sendKeys("caner");

        }


    }