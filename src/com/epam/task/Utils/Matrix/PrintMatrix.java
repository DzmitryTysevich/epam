package com.epam.task.Utils.Matrix;

public class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}