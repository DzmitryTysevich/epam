package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.getRandomMatrix();
        printSwapOddElementMatrix(matrix);
    }

    private static int getMaxElementMatrix(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (matrix[line][column] > maxElement) {
                    maxElement = matrix[line][column];
                }
            }
        }
        return maxElement;
    }

    public static void printSwapOddElementMatrix(int[][] matrix) {
        int maxElement = getMaxElementMatrix(matrix);
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (column % 2 == 0 && line % 2 == 0) {
                    matrix[line][column] = maxElement;
                }
            }
        }
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                System.out.printf("\t%d", matrix[line][column]);
            }
            System.out.println();
        }
    }
}