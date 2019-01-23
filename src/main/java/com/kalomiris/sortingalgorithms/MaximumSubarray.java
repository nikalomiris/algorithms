package com.kalomiris.sortingalgorithms;

import javax.jnlp.IntegrationService;

public class MaximumSubarray {

    private int[] findMaxCrossingSubarray(int[] array, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int maxLeft = 0;
        int maxRight = 0;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = mid; i >= low; i--) {
            sum += array[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += array[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }

        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }
}
