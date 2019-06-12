package com.hashort.mockito.test;

import com.hashort.mockito.src.BusinessImplementation;
import com.hashort.mockito.src.DataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusinessStubTest {

    @Test
    public void testFindGreatestFromAllData() {
        BusinessImplementation businessImplementation = new BusinessImplementation(new DataServiceStub());
        int result = businessImplementation.findGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 6, 15};
    }
}