package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.BuildRandomMatrix;
import com.epam.task.Utils.Matrix.PrintMatrix;

public class Task8 {
    public static void main(String[] args) {
        int[][] randomMatrix = BuildRandomMatrix.buildRandomMatrix();
        changeColumnMatrix(randomMatrix, 2, 4);
        PrintMatrix.printMatrix(randomMatrix);
    }

    public static int[][] changeColumnMatrix(int[][] matrix, int firstColumn, int secondColumn) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == firstColumn && firstColumn < secondColumn) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][secondColumn];
                    matrix[i][secondColumn] = temp;
                }
                if (j == secondColumn && firstColumn > secondColumn) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][firstColumn];
                    matrix[i][firstColumn] = temp;
                }
            }
        }
        return matrix;
    }
}