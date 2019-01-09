package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();
    private Random random = new Random();

    private int arraysSize = 1000;
    private long startTime, stopTime, elapsedTime;

    @Test
    public void sort() {

        // Initialize average case input
        int[] averageCaseInput = new int[arraysSize];
        int[] averageCaseInputHybrid = new int[arraysSize];
        int[] output = new int[arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            int randomNum = random.nextInt(arraysSize) + 1;
            averageCaseInput[i] = randomNum;
            averageCaseInputHybrid[i] = randomNum;
            output[i] = randomNum;
        }
        Arrays.sort(output);

        // Execute and measure time for average case input
        System.out.println("The array before mergesort:");
        printArray(averageCaseInput);
        startTime = System.currentTimeMillis();
        mergeSort.sort(averageCaseInput, 0, averageCaseInput.length - 1);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        assertThat(averageCaseInput, is(output));
        System.out.println("The array after mergesort:");
        printArray(averageCaseInput);
        System.out.println("Merge sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in average case");

        // Execute and measure time for average case input using hybrid sort
        System.out.println("The array before mergesortHybrid:");
        printArray(averageCaseInputHybrid);
        startTime = System.currentTimeMillis();
        mergeSort.hybridSort(averageCaseInputHybrid, 0, averageCaseInputHybrid.length - 1, 5);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        assertThat(averageCaseInputHybrid, is(output));
        System.out.println("The array after mergesortHybrid:");
        printArray(averageCaseInputHybrid);
        System.out.println("Hybrid Merge sort sorted " + arraysSize + " numbers in " + elapsedTime + "ms in average case");
    }

    /* A utility function to print array of size n */
    private static void printArray(int[] numbers)
    {
        int n = numbers.length;
        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}