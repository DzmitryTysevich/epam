package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.MatrixUtil;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.buildRandomMatrix();
        swapOddElementMatrix(matrix);
    }

    private static int findMaxElementMatrix(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public static void swapOddElementMatrix(int[][] matrix) {
        int maxElement = findMaxElementMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (j % 2 == 0) {
                    matrix[i][j] = maxElement;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("\t%d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}