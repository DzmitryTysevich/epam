package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.PrintMatrixUtil;
import com.epam.task.Utils.Matrix.MatrixUtil;

public class Task14 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.buildFillMatrix();
        fillMatrixValue(randomMatrix);
        PrintMatrixUtil.printMatrix(randomMatrix);
    }

    public static int[][] fillMatrixValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (i <= j - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}