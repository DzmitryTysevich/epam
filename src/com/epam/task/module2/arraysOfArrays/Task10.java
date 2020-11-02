package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task10 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.getRandomMatrixWithMinusValue();
        getMainPositiveValue(randomMatrix);
    }

    public static int[][] getMainPositiveValue(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (line == column && matrix[line][column] > 0) {
                    System.out.printf("\t%d, ", matrix[line][column]);
                }
            }
        }
        return matrix;
    }
}