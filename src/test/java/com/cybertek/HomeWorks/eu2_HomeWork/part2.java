package com.cybertek.HomeWorks.eu2_HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class part2 {

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
    public void test6(){

        driver.get("https://www.tempmailaddress.com/");
        String email = driver.findElement(By.xpath("//span[@id='email']")).getText();

        driver.navigate().to("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[43]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/input")).sendKeys("username");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//h3"));
        driver.navigate().to("https://www.tempmailaddress.com/");
        driver.findElement(By.xpath("//*[contains(text(),'Thanks for subs')]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[@id='odesilatel']")).getText().toString(), "do-not-reply@practice.cybertekschool.com");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@id='predmet']")).getText().toString(), "Thanks for subscribing to practice.cybertekschool.com!");

    }


    @Test
    public void test7() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/upload']")).click();
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/cnrnyk/Desktop/testUpload.txt");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='uploaded-files']")).getText(), "testUpload.txt");

    }
    @Test
    public void test8(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/autocomplete']")).click();
        driver.findElement(By.xpath("//input[@id='myCountry']")).sendKeys("United States of America");
        driver.findElement(By.xpath("//strong")).click();
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText().toString(), "You selected: United States of America");

    }
    @Test
    public void test9(){

    }
//    @Test
//    public void test10(){ }
//    @Test
//    public void test11(){ }
//    @Test
//    public void test12(){ }



}
