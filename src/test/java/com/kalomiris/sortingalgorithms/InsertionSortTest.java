package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;

class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();
    Random random = new Random();

    int arraysSize = 100000;
    long startTime, stopTime, elapsedTime;

    @Test
    void sort() {

        // Initialize average case input
        List<Integer> averageCaseInput = new ArrayList<>();
        for (int i = 0; i < arraysSize; i++) {
            averageCaseInput.add(random.nextInt(100));
        }

        // Initialize best case input
        List<Integer> bestCaseInput = new ArrayList<>(averageCaseInput);
        Collections.sort(bestCaseInput);

        // Initialize worst case input
        List<Integer> worstCaseInput = new ArrayList<>(bestCaseInput);
        Collections.reverse(worstCaseInput);

        // The output should be the sorted list.
        List<Integer> output = new ArrayList<>(bestCaseInput);

        // Execute and measure time for best case input
        startTime = System.currentTimeMillis();
        assertThat(insertionSort.sort(bestCaseInput), is(output));
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in best case");

        // Execute and measure time for average case input
        startTime = System.currentTimeMillis();
        assertThat(insertionSort.sort(averageCaseInput), is(output));
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in average case");

        // Execute and measure time for worst case input
        startTime = System.currentTimeMillis();
        assertThat(insertionSort.sort(worstCaseInput), is(output));
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in worst case");
    }
}