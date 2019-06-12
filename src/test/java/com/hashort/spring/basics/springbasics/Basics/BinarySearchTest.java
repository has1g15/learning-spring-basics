package com.hashort.spring.basics.springbasics.Basics;

import com.hashort.spring.basics.springbasics.SpringBasicApplication;
import com.hashort.spring.basics.springbasics.basics.BinarySearchImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= SpringBasicApplication.class)
public class BinarySearchTest {

    //Get bean from context
    @Autowired
    BinarySearchImplementation binarySearchImplementation;

    @Test
    public void testBasicScenario() {
        int result = binarySearchImplementation.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }
}
