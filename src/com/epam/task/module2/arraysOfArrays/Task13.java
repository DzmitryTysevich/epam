package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.PrintMatrixUtil;
import com.epam.task.Utils.Matrix.MatrixUtil;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.buildRandomMatrix();
        Arrays.toString(sortMatrixByColumnMax(matrix));
        PrintMatrixUtil.printMatrix(matrix);
        System.out.println();
        Arrays.toString(sortMatrixByColumnMin(matrix));
        PrintMatrixUtil.printMatrix(matrix);
    }

    public static int[][] sortMatrixByColumnMax(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] > matrix[k + 1][j]) {
                        int temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] sortMatrixByColumnMin(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] < matrix[k + 1][j]) {
                        int temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }
}