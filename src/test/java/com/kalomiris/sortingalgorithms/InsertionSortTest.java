package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;

class InsertionSortTest {

    private InsertionSort insertionSort = new InsertionSort();
    private Random random = new Random();

    private int arraysSize = 10000;
    private long startTime, stopTime, elapsedTime;

    @Test
    public void sort() {

        // Initialize Arrays
        int[] averageCaseInput = new int[arraysSize];
        int[] bestCaseInput = new int[arraysSize];
        int[] worstCaseInput = new int[arraysSize];
        int[] output = new int[arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            int randNum = random.nextInt(arraysSize);
            averageCaseInput[i] = randNum;
            bestCaseInput[i] = randNum;
            output[i] = randNum;
        }

        // Sort best case input
        Arrays.sort(bestCaseInput);

        // Reverse sort of worst case input
        int j = 0;
        for (int i = arraysSize - 1; i >= 0; i--) {
            worstCaseInput[j++] = bestCaseInput[i];
        }

        // The output should be the sorted list.
        Arrays.sort(output);

        // Execute and measure time for best case input
        startTime = System.currentTimeMillis();
        insertionSort.sort(bestCaseInput, 0, arraysSize - 1);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        assertThat(bestCaseInput, is(output));
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in best case");

        // Execute and measure time for average case input
        startTime = System.currentTimeMillis();
        insertionSort.sort(averageCaseInput, 0, arraysSize - 1);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        assertThat(averageCaseInput, is(output));
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in average case");

        // Execute and measure time for worst case input
        startTime = System.currentTimeMillis();
        insertionSort.sort(worstCaseInput, 0, arraysSize - 1);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        assertThat(worstCaseInput, is(output));
        System.out.println("Insertion sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in worst case");
    }
}