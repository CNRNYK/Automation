package com.cybertek.tests.day007_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test
    public void test1(){

        System.out.println("first assertion");
        Assert.assertEquals("title","tiTle" );

        System.out.println("second assertion");
        Assert.assertEquals("url","url");


    }

    @Test
    public void test2(){
        Assert.assertFalse(0<1,"verify that 0 is not greater than 1");
    }

    @Test
    public void test3(){

    }
}
