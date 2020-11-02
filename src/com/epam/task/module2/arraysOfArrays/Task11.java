package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task11 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.getRandomMatrix();
        printNumberLineWithValue(randomMatrix);
    }

    public static void printNumberLineWithValue(int[][] matrix) {
        int[] arrayNumFive = new int[matrix.length];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (matrix[line][column] == 5) {
                    arrayNumFive[line] += matrix[line][column] / 5;
                    if (arrayNumFive[line] >= 3) {
                        System.out.print(line + " ");
                    }
                }
            }
        }
    }
}