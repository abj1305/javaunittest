package com.test.unit.business;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.test.unit.data.SomeDataService;

public class SomeBusinessServiceImplWithStubTest {

    private static class SomeDataServiceImpl implements SomeDataService {
        @Override
        public int[] getAllData() {
            return new int[]{1, 2, 3};
        }
    }

    private static class SomeDataServiceEmptyImpl implements SomeDataService {
        @Override
        public int[] getAllData() {
            return new int[]{};
        }
    }

    private static class SomeDataServiceOneElementImpl implements SomeDataService {
        @Override
        public int[] getAllData() {
            return new int[]{10};
        }
    }

    @Test
    public void calculateSum_basic() {
        SomeBusinessServiceimpl impl = new SomeBusinessServiceimpl();
        SomeDataService someDataService = new SomeDataServiceImpl();
        impl.setSomeDataService(someDataService);
        int result = impl.calculateSumFromDataService();
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateSum_empty() {
        SomeBusinessServiceimpl impl = new SomeBusinessServiceimpl();
        SomeDataService someDataService = new SomeDataServiceEmptyImpl();
        impl.setSomeDataService(someDataService);
        int result = impl.calculateSumFromDataService();
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void calculateSum_oneElement() {
        SomeBusinessServiceimpl impl = new SomeBusinessServiceimpl();
        SomeDataService someDataService = new SomeDataServiceOneElementImpl();
        impl.setSomeDataService(someDataService);
        int result = impl.calculateSumFromDataService();
        int expected = 10;
        Assertions.assertEquals(expected, result);
    }

}
