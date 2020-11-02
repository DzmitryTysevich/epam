package com.epam.task.Utils;

public class PrintMatrixUtil {
    public static void printMatrix(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                System.out.printf("\t%d ", matrix[line][column]);
            }
            System.out.println();
        }
    }
}