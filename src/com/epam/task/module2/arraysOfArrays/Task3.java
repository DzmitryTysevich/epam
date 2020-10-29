package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.InputUtil;
import com.epam.task.Utils.Matrix.MatrixUtil;

public class Task3 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.buildRandomMatrix();
        giveLineMatrix(randomMatrix, InputUtil.InPutValue("Enter k: "));
        System.out.println();
        giveColumnMatrix(randomMatrix, InputUtil.InPutValue("Enter p: "));
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