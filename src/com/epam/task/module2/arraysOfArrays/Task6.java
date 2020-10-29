package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.InputUtil;

public class Task6 {
    public static void main(String[] args) {
        squareMatrix(InputUtil.InPutValue("Enter size: "));
    }

    public static void squareMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j >= i && j <= matrix.length - i - 1) {
                    matrix[i][j] = 1;
                }
                if (j <= i && j >= matrix.length - i - 1) {
                    matrix[i][j] = 1;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}