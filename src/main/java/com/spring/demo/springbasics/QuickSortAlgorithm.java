package com.spring.demo.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class QuickSortAlgorithm implements SortAlgorithm{

    public int[] sort(int num[])
    {
        return num;
    }
}
