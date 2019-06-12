package com.hashort.spring.basics.springbasics.CDI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

//Load the context
@RunWith(MockitoJUnitRunner.class)
public class CDIBusinessTest {

    //Create Mock
    @Mock
    CDIDAO daoMock;

    //Inject Mock
    @InjectMocks
    CDIBusiness cdiBusiness;

    @Test
    public void testBasicScenario() {
        //when daoMock.getData() method is called, return int[]{2,4}
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
        assertEquals(4, cdiBusiness.findGreatest());
    }

    @Test
    public void testBasicScenarioNoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, cdiBusiness.findGreatest());
    }

    @Test
    public void testBasicScenarioEqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
        assertEquals(2, cdiBusiness.findGreatest());
    }
}
