package com.hashort.mockito.test;

import com.hashort.mockito.src.BusinessImplementation;
import com.hashort.mockito.src.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImplementation businessImplementation;

    @Test
    public void testFindGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
        assertEquals(24, businessImplementation.findGreatestFromAllData());
    }

    @Test
    public void testFindGreatestFromAllData_ForOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        assertEquals(15, businessImplementation.findGreatestFromAllData());
    }

    @Test
    public void testFindGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImplementation.findGreatestFromAllData());
    }
}
