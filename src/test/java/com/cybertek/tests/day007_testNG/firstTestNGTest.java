package com.cybertek.tests.day007_testNG;

import org.testng.annotations.*;

public class firstTestNGTest {

    @Test
    public void test1(){
        System.out.print("My first test case");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.print("My second test case");
    }

    @BeforeMethod
    public void beforeMethod(){

    }
    @AfterMethod
    public void afterMethod(){

    }
    @BeforeClass
    public void beforeClass(){

    }
    @AfterClass
    public void afterClass(){

    }


}
