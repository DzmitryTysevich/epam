package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task2 {
    public static void main(String[] args) {
        giveDiagonalValue(MatrixUtil.buildRandomMatrix());
    }

    public static void giveDiagonalValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == matrix.length - 1 - j) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
    }
}