package com.kalomiris.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class SquareMatrixMultiplyTest {

    private int[][] a = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    private int[][] b = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    private int[][] c = new int[][]{{6, 12, 18}, {6, 12, 18}, {6, 12, 18}};

    private SquareMatrixMultiply squareMatrixMultiply = new SquareMatrixMultiply();

    @Test
    void multiply() {
        assertThat(squareMatrixMultiply.multiply(a, b), is(c));
    }
}