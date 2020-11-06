package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.InputUtil;
import com.epam.task.Utils.MatrixUtil;

public class Task3 {
    public static void main(String[] args) {
        int[][] randomMatrix = MatrixUtil.getRandomMatrix();
        printLineMatrix(randomMatrix, InputUtil.getInputValue("Enter k: "));
        System.out.println();
        printColumnMatrix(randomMatrix, InputUtil.getInputValue("Enter p: "));
    }

    public static void printLineMatrix(int[][] matrix, int lineK) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (line == lineK) {
                    System.out.print("\t" + matrix[line][column] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void printColumnMatrix(int[][] matrix, int columnP) {

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (column == columnP) {
                    System.out.println("\t" + matrix[line][column] + " ");
                }
            }
        }
    }
}