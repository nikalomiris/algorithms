package com.kalomiris.sortingalgorithms;

public class InsertionSort {

    public void sort(int[] integers, int start, int finish) {

        for (int j = start; j <= finish; j++) {
            int key = integers[j];
            int i = j - 1;
            while (i >= 0 && integers[i] > key) {
                integers[i + 1] = integers[i];
                i--;
            }
            integers[i + 1] = key;
        }
    }
}
