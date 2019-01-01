package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    List<Integer> input = Arrays.asList(3, 2, 1, 6, 5, 4, 9, 8, 7);
    List<Integer> output = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    InsertionSort insertionSort = new InsertionSort();

    @Test
    void sort() {
        assertThat(insertionSort.sort(input), is(output));
    }
}