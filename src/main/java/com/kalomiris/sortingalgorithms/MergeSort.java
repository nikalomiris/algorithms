package com.kalomiris.sortingalgorithms;

public class MergeSort {

    InsertionSort insertionSort = new InsertionSort();

    public void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int middle = (start + end)/2;
            sort(numbers, start, middle);
            sort(numbers, middle + 1, end);
            merge(numbers, start, middle, end);
        }
    }

    public void hybridSort(int[] numbers, int start, int end, int threshhold) {
        if (end - start < threshhold) {
            insertionSort.sort(numbers, start, end);
        } else {
            int middle = (start + end)/2;
            hybridSort(numbers, start, middle, threshhold);
            hybridSort(numbers, middle + 1, end, threshhold);
            merge(numbers, start, middle, end);
        }
    }

    private void merge(int[] numbers, int start, int middle, int end) {

        int n1 = middle - start + 1;
        int n2 = end - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Create the two temporary arrays
        for (int i = 0; i < n1; ++i){
            L[i] = numbers[start + i];
        }
        for (int i = 0; i < n2; ++i) {
            R[i] = numbers[middle + 1 + i];
        }

        int i = 0, j = 0, k = start;

        // Copy the values from the temporary arrays to the original in a sorted manner
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numbers[k] = L[i];
                i++;
            } else {
                numbers[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining numbers from the temporary arrays to the original array
        while (i < n1) {
            numbers[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            numbers[k] = R[j];
            j++;
            k++;
        }
    }
}
