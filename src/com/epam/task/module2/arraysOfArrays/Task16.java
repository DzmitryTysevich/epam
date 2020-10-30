package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.PrintMatrixUtil;

public class Task16 {
    public static void main(String[] args) {
        int[][] matrix = buildFillMatrix(3);
        fillMagicMatrixForUneven(matrix);
        PrintMatrixUtil.printMatrix(matrix);

    }

    public static int[][] buildFillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
        }
        return matrix;
    }

    public static void fillMagicMatrixForUneven(int[][] matrix) {
        int i = matrix.length / 2;
        int j = matrix.length - 1;

        for (int num = 1; num <= matrix.length * matrix.length; ) {
            if (i == -1 && j == matrix.length) {
                i = 0;
                j = matrix.length - 2;
            } else {
                if (i < 0) {
                    i = matrix.length - 1;
                }
                if (j == matrix.length) {
                    j = 0;
                }
            }
            if (matrix[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                matrix[i][j] = num++;
            }
            i--;
            j++;
        }
    }
}