package com.kalomiris.sortingalgorithms;

public class SquareMatrixMultiply {

    public int[][] multiply(int[][] a, int[][] b) {
        if (!(isSquare(a) && isSquare(b))) {
            throw new IllegalArgumentException();
        }

        int n = a.length;
        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    private boolean isSquare(int[][] array) {

        for (int i = 0, l = array.length; i < l; i++) {
            if (array[i].length != l) {
                return false;
            }
        }

        return true;
    }
}
