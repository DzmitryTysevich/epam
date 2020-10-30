package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task1 {
    public static void main(String[] args) {
        giveOddColumn(MatrixUtil.buildRandomMatrix());
    }

    public static void giveOddColumn(int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (j % 2 != 0 && matrix[0][j] > matrix[matrix.length - 1][j]) {
                    counter++;
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        if (counter == 0) {
            System.out.println("No coincidence!");
        }
    }
}