package com.kalomiris.sortingalgorithms;

public class MaximumSubarray {

    public int[] findMaximumSubarray(int[] array, int low, int high) {

        int[] tempLeft, tempRight, tempCross;

        if (high == low) {
            return new int[]{low, high, array[low]};
        } else {
            int mid = (high - low) / 2;
            tempLeft = findMaximumSubarray(array, low, mid);
            tempRight = findMaximumSubarray(array, mid + 1, high);
            tempCross = findMaxCrossingSubarray(array, low, mid, high);

            if (tempLeft[2] > tempRight[2] && tempLeft[2] > tempCross[2]) {
                return tempLeft;
            } else if (tempRight[2] > tempLeft[2] && tempRight[2] > tempCross[2]) {
                return tempRight;
            } else {
                return tempCross;
            }
        }
    }

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
