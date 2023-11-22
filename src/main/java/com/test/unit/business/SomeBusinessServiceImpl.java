package com.test.unit.business;

import com.test.unit.data.SomeDataService;

public class SomeBusinessServiceImpl {

    private SomeDataService someDateService;

    public void setSomeDataService(SomeDataService someDateService) {
        this.someDateService = someDateService;
    }

    public int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public int calculateSumFromDataService() {
        int sum = 0;
        int[] array = someDateService.getAllData();
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

}
