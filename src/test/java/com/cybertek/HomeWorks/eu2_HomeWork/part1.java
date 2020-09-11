package com.cybertek.HomeWorks.eu2_HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

// Homework about wait link https://learn.cybertekschool.com/courses/362/files/40199?module_item_id=29355

public class part1 {

    WebDriver driver;
    Faker faker = new Faker();

    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(200);
//        driver.quit();
    }


    @Test
    public void test1(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement check = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
        wait.until(ExpectedConditions.elementToBeClickable(check));
    }



    @Test
    public void test2(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.xpath("//*[.='C++']"));
        driver.findElement(By.xpath("//*[.='Java']"));
        driver.findElement(By.xpath("//*[.='JavaScript']"));

    }



    @Test
    public void test3(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement check = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
        wait.until(ExpectedConditions.elementToBeClickable(check));
    }


    @Test
    public void test4(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("a");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement check = driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
        wait.until(ExpectedConditions.elementToBeClickable(check));
    }


    @Test
    public void test5() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");


        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("fakernameusername");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password(8, 10, true, false));
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("571-545-5487");
        driver.findElement(By.xpath("//div[@class='radio']//input[@value='female']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("12/12/2010");

        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='department']"));

        Select department = new Select(dropdownElement);
        department.selectByValue("AO");
        dropdownElement = driver.findElement(By.xpath("//select[@name='job_title']"));
        department = new Select(dropdownElement);
        department.selectByVisibleText("Developer");
        driver.findElement(By.xpath("//*[.='C++']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//h4"));


        Thread.sleep(5000);

//        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());

    }
}
