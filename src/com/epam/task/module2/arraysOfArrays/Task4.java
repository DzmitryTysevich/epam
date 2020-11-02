package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.InputUtil;

public class Task4 {
    public static void main(String[] args) {
        printSquareMatrixTurntoReturnLine(InputUtil.getInPutValue("Enter size: "));
    }

    public static void printSquareMatrixTurntoReturnLine(int size) {
        int[][] matrix = new int[size][size];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                if (line % 2 != 0) {
                    matrix[line][column] = matrix.length - column;
                } else {
                    matrix[line][column] = column + 1;
                }
                System.out.print("\t" + matrix[line][column] + " ");
            }
            System.out.println();
        }
    }
}