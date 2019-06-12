package com.hashort.junit.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssertTest {

    @Test
    public void test() {
        assertEquals(1,2);

        boolean condition = true;
        assertEquals(true, condition);
        assertTrue(condition);
        assertFalse(!condition);

//        assertNotNull();
//        assertNull();

//        assertArrayEquals();
    }
}
