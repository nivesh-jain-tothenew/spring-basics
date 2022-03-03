package com.spring.demo.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int num[], int numbersToSearchFor)
    {
        int[] sortedNumbers =  sortAlgorithm.sort(num);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
