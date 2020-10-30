package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task10 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.buildRandomMatrixWithMinusValue();
        findMainPositiveValue(randomMatrix);
    }

    public static int[][] findMainPositiveValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.printf("%d, ", matrix[i][j]);
                }
            }
        }
        return matrix;
    }
}