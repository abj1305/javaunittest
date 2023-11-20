package com.test.unit.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeBusinessServiceimplTest {

    @Test
    public void calculateSum_basic() {
        SomeBusinessServiceImpl impl = new SomeBusinessServiceImpl();
        int result = impl.calculateSum(new int[]{1, 2, 3});
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateSum_empty() {
        SomeBusinessServiceImpl impl = new SomeBusinessServiceImpl();
        int result = impl.calculateSum(new int[]{});
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateSum_oneElement() {
        SomeBusinessServiceImpl impl = new SomeBusinessServiceImpl();
        int anyInt = 10;
        int result = impl.calculateSum(new int[]{anyInt});
        int expected = anyInt;
        Assertions.assertEquals(expected, result);
    }

}
