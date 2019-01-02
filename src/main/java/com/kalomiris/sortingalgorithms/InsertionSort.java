package com.kalomiris.sortingalgorithms;

import java.util.List;

public class InsertionSort {

    public List<Integer> sort(List<Integer> integers) {

        for (int j = 1; j < integers.size(); j++) {
            int key = integers.get(j);
            int i = j - 1;
            while (i >= 0 && integers.get(i) > key) {
                integers.set(i + 1, integers.get(i));
                i--;
            }
            integers.set(i + 1, key);
        }

        return integers;
    }
}
