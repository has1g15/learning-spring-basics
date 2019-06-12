package com.hashort.mockito.test;

import com.hashort.mockito.src.BusinessImplementation;
import com.hashort.mockito.src.DataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessMockTest {

    @Test
    public void testFindGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});

        BusinessImplementation businessImplementation = new BusinessImplementation(dataServiceMock);

        int result = businessImplementation.findGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindGreatestFromAllData_ForOneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});

        BusinessImplementation businessImplementation = new BusinessImplementation(dataServiceMock);

        int result = businessImplementation.findGreatestFromAllData();
        assertEquals(15, result);
    }
}
