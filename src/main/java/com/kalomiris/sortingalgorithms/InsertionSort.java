package com.kalomiris.sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public List<Integer> sort(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (int j = 1; j < input.size(); j++) {
            int key = input.get(j);
            int i = j - 1;
            while (i >= 0 && input.get(i) > key) {
                input.set(i + 1, input.get(i));
                i--;
            }
            input.set(i + 1, key);
        }

        return result;
    }
}
