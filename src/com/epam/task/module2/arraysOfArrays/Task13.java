package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.PrintMatrixUtil;
import com.epam.task.Utils.MatrixUtil;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.getRandomMatrix();
        Arrays.toString(getSortedMatrixByColumnMax(matrix));
        PrintMatrixUtil.printMatrix(matrix);
        System.out.println();
        Arrays.toString(getSortMatrixByColumnMin(matrix));
        PrintMatrixUtil.printMatrix(matrix);
    }

    public static int[][] getSortedMatrixByColumnMax(int[][] matrix) {
        for (int line = matrix.length - 1; line >= 0; line--) {
            for (int column = 0; column < matrix[line].length; column++) {
                for (int columnReader = 0; columnReader < line; columnReader++) {
                    if (matrix[columnReader][column] > matrix[columnReader + 1][column]) {
                        int tempValue = matrix[columnReader][column];
                        matrix[columnReader][column] = matrix[columnReader + 1][column];
                        matrix[columnReader + 1][column] = tempValue;
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] getSortMatrixByColumnMin(int[][] matrix) {
        for (int line = matrix.length - 1; line >= 0; line--) {
            for (int column = 0; column < matrix[line].length; column++) {
                for (int columnReader = 0; columnReader < line; columnReader++) {
                    if (matrix[columnReader][column] < matrix[columnReader + 1][column]) {
                        int tempValue = matrix[columnReader][column];
                        matrix[columnReader][column] = matrix[columnReader + 1][column];
                        matrix[columnReader + 1][column] = tempValue;
                    }
                }
            }
        }
        return matrix;
    }
}