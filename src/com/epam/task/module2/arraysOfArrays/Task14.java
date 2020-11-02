package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.PrintMatrixUtil;
import com.epam.task.Utils.MatrixUtil;

public class Task14 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.getFillMatrix();
        getFillMatrixValue(randomMatrix);
        PrintMatrixUtil.printMatrix(randomMatrix);
    }

    public static int[][] getFillMatrixValue(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 1; column < matrix[line].length; column++) {
                if (line <= column - 1) {
                    matrix[line][column] = 1;
                }
            }
        }
        return matrix;
    }
}