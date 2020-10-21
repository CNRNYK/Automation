package com.cybertek.tests.day010_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class javaActions {

    WebDriver driver;
    Faker faker;

    @BeforeMethod
    public void beforeMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void afterMethod(){

        driver.quit();

    }

    @Test
    public void dragAndDrop() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        driver.findElement(By.xpath("//*[.='Accept Cookies']")).click();
        Thread.sleep(1000);
        actions.dragAndDrop(source,target).perform();

    }

}
