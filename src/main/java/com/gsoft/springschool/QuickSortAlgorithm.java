package com.gsoft.springschool;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int [] sort(int [] numbers){
        //Logic Bubble Sort
        return numbers;
    }
}
