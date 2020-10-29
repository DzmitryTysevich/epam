package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.BuildRandomMatrix;

public class Task3 {
    public static void main(String[] args) {
        int[][] randomMatrix = BuildRandomMatrix.buildRandomMatrix();
        giveLineMatrix(randomMatrix, 4);
        System.out.println();
        giveColumnMatrix(randomMatrix, 3);
    }

    public static void giveLineMatrix(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == k) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void giveColumnMatrix(int[][] matrix, int p) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == p) {
                    System.out.println(" " + matrix[i][j] + " ");
                }
            }
        }
    }
}