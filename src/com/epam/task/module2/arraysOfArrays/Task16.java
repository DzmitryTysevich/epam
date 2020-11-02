package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.PrintMatrixUtil;

public class Task16 {
    public static void main(String[] args) {
        int[][] matrix = getFillMatrix(3);
        printFillMagicMatrixForUneven(matrix);
        PrintMatrixUtil.printMatrix(matrix);

    }

    public static int[][] getFillMatrix(int lengthArray) {
        int[][] matrix = new int[lengthArray][lengthArray];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
            }
        }
        return matrix;
    }

    public static void printFillMagicMatrixForUneven(int[][] matrix) {
        int line = matrix.length / 2;
        int column = matrix.length - 1;

        for (int number = 1; number <= matrix.length * matrix.length; ) {
            if (line == -1 && column == matrix.length) {
                line = 0;
                column = matrix.length - 2;
            } else {
                if (line < 0) {
                    line = matrix.length - 1;
                }
                if (column == matrix.length) {
                    column = 0;
                }
            }
            if (matrix[line][column] != 0) {
                column -= 2;
                line++;
                continue;
            } else {
                matrix[line][column] = number++;
            }
            line--;
            column++;
        }
    }
}