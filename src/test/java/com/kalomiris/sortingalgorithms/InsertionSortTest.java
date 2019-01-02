package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;

class InsertionSortTest {

    Random random = new Random();

    int arraysSize = 100000;

    InsertionSort insertionSort = new InsertionSort();

    @Test
    void sort() {

        List<Integer> averageCaseInput = new ArrayList<>();

        for (int i = 0; i < arraysSize; i++) {
            averageCaseInput.add(random.nextInt(100));
        }
        List<Integer> bestCaseInput = new ArrayList<>(averageCaseInput);
        Collections.sort(bestCaseInput);
        List<Integer> worstCaseInput = new ArrayList<>(bestCaseInput);
        Collections.reverse(worstCaseInput);
        List<Integer> output = new ArrayList<>(bestCaseInput);

//        System.out.println(bestCaseInput.toString());
//        System.out.println(averageCaseInput.toString());
//        System.out.println(worstCaseInput.toString());

        long startTime = System.currentTimeMillis();
        assertThat(insertionSort.sort(bestCaseInput), is(output));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in best case");

        startTime = System.currentTimeMillis();
        assertThat(insertionSort.sort(averageCaseInput), is(output));
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in average case");

        startTime = System.currentTimeMillis();
        assertThat(insertionSort.sort(worstCaseInput), is(output));
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in worst case");
    }
}