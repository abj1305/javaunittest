package com.test.unit.business;

import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.test.unit.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessServiceImplWithMockTest {

    @InjectMocks
    SomeBusinessServiceimpl impl;

    @Mock
    SomeDataService someDataService;

    @Test
    public void calculateSum_basic() {
        when(someDataService.getAllData()).thenReturn(new int[]{1, 2, 3});
        int result = impl.calculateSumFromDataService();
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateSum_empty() {
        when(someDataService.getAllData()).thenReturn(new int[]{});
        int result = impl.calculateSumFromDataService();
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateSum_oneElement() {
        when(someDataService.getAllData()).thenReturn(new int[]{10});
        int result = impl.calculateSumFromDataService();
        int expected = 10;
        Assertions.assertEquals(expected, result);
    }

}
