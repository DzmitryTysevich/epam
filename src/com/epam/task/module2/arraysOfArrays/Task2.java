package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.MatrixUtil;

public class Task2 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.getRandomMatrix();
        printFirstDiagonalValue(randomMatrix);
        System.out.println();
        printSecondDiagonalValue(randomMatrix);
    }

    public static void printFirstDiagonalValue(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                if (line == column) {
                    System.out.print("\t" + matrix[line][column] + " ");
                }
            }
        }
    }

    public static void printSecondDiagonalValue(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                if (line == matrix.length - 1 - column) {
                    System.out.print("\t" + matrix[line][column] + " ");
                }
            }
        }
    }
}