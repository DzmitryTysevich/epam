package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task11 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.buildRandomMatrix();
       findLineWithValue(randomMatrix);
    }

    public static void findLineWithValue(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    array[i] += matrix[i][j] / 5;
                    if (array[i] >= 3) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}