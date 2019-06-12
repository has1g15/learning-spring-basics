package com.hashort.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hashort.junit.src.MyMath;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void sumWith3Numbers() {
        System.out.println("Test 1");
        assertEquals(6,myMath.sum(new int[] {1,2,3}));
    }

    @Test
    public void sumWith1Number() {
        System.out.println("Test 2");
        assertEquals(3,myMath.sum(new int[] {3}));
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
