package com.cybertek.personalTry;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class jibjab {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("https://cf-static-qa-phoenix.jibjab.com");
        Thread.sleep(7000);
        WebElement click = driver.findElement(By.xpath("//div[@id='featured-ecards']/div/a"));
        click.click();
        click = click.findElement(By.xpath("//div[@id='nav-hamburger-icon']"));
    }

}
