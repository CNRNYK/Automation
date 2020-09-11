package com.cybertek.tests.day007_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttiributeTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueButton = driver.findElement(By.id("blue"));
        blueButton.getAttribute("value");

        System.out.println("blueButton.getAttribute(\"type\") = " + blueButton.getAttribute("type"));
        System.out.println("blueButton.getAttribute(\"name\") = " + blueButton.getAttribute("name"));
        System.out.println("blueButton.getAttribute(\"checked\") = " + blueButton.getAttribute("checked"));
        System.out.println("blueButton.getAttribute(\"href\") = " + blueButton.getAttribute("href"));
        System.out.println("blueButton.getAttribute(\"outerHTML\") = " + blueButton.getAttribute("outerHTML"));
        System.out.println("blueButton.getAttribute(\"outerHTML\") = " + blueButton.getAttribute("innerHTML") + "/n");


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));

        System.out.println(button2.getAttribute("outerHTML"));
        String outerHTML = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHTML.contains("Button 2"));

        System.out.println("Inner HTML: "+button2.getAttribute("innerHTML"));

        driver.quit();

    }
}
