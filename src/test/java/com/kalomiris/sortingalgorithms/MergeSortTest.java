package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort mergeSort = new MergeSort();
    Random random = new Random();

    int arraysSize = 100;
    long startTime, stopTime, elapsedTime;

    @Test
    void sort() {

        // Initialize average case input
        int[] averageCaseInput = new int[arraysSize];
        int[] output = new int[arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            int randomNum = random.nextInt(arraysSize) + 1;
            averageCaseInput[i] = randomNum;
            output[i] = randomNum;
        }
        Arrays.sort(output);

        // Execute and measure time for average case input
        System.out.println("The array before mergesort:");
        printArray(averageCaseInput);
        startTime = System.currentTimeMillis();
        assertThat(mergeSort.sort(averageCaseInput, 0, averageCaseInput.length - 1), is(output));
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("The array after mergesort:");
        printArray(averageCaseInput);
        System.out.println("Merge sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in average case");
    }

    /* A utility function to print array of size n */
    static void printArray(int[] numbers)
    {
        int n = numbers.length;
        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}