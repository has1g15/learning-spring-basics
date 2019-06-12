package com.hashort.spring.basics.springbasics.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Component
@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
