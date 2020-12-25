package com.cybertek.tests.day011_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableExamples {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        // Thread.sleep(2000);
        // driver.quit();
    }
    @Ignore
    @Test
    public void test1(){
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());



    }

    @Test
    public void test2(){

        List<WebElement> table = driver.findElements(By.xpath("//table[@id='table1']//th"));

        for (WebElement tableElement : table) {
            System.out.println(tableElement.getText());
        }
    }

    @Test
    public void test3(){
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        System.out.println("headers.size() = " + headers.size());
    }

    @Test
    public void getRow(){

        WebElement headers = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]"));
        System.out.println("headers = " + headers.getText());

        List<WebElement> numRows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));

        for (int i =1;i<=numRows.size();i++) {
            WebElement row = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+i+"]"));
            System.out.println(i + " row.getText() = " + row.getText());
        }
    }


    @Test
    public void test(){
        Password pass = new Password();
        driver.get("https://platform.utest.com/dashboard");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(pass.username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass.password);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass.password);
        driver.findElement(By.xpath("//button")).click();


    }


}
