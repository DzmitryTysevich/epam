package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.getRandomMatrix();
        printSortedMatrixByLineMax(matrix);
        System.out.println();
        printSortedMatrixByLineMin(matrix);
    }

    public static void printSortedMatrixByLineMax(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = matrix[line].length - 1; column >= 0; column--) {
                for (int lineReader = 0; lineReader < column; lineReader++) {
                    if (matrix[line][lineReader] > matrix[line][lineReader + 1]) {
                        int tempValue = matrix[line][lineReader];
                        matrix[line][lineReader] = matrix[line][lineReader + 1];
                        matrix[line][lineReader + 1] = tempValue;
                    }
                }
                System.out.printf("\t%d", matrix[line][column]);
            }
            System.out.println();
        }
    }

    public static void printSortedMatrixByLineMin(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = matrix[line].length - 1; column >= 0; column--) {
                for (int lineReader = 0; lineReader < column; lineReader++) {
                    if (matrix[line][lineReader] < matrix[line][lineReader + 1]) {
                        int tempValue = matrix[line][lineReader];
                        matrix[line][lineReader] = matrix[line][lineReader + 1];
                        matrix[line][lineReader + 1] = tempValue;
                    }
                }
                System.out.printf("\t%d", matrix[line][column]);
            }
            System.out.println();
        }
    }
}