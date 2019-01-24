package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray = new MaximumSubarray();
    private int[] input = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
    private int[] output = new int[]{2, 6, 7};

    @Test
    void findMaximumSubarray() {
        assertThat(maximumSubarray.findMaximumSubarray(input, 0, input.length - 1), is(output));
    }
}