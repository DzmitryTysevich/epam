package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.InputUtil;

public class Task6 {
    public static void main(String[] args) {
        printSquareMatrix(InputUtil.getInPutValue("Enter size: "));
    }

    public static void printSquareMatrix(int lengthArray) {
        int[][] matrix = new int[lengthArray][lengthArray];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                if (column >= line && column <= matrix.length - line - 1) {
                    matrix[line][column] = 1;
                }
                if (column <= line && column >= matrix.length - line - 1) {
                    matrix[line][column] = 1;
                }
                System.out.print("\t" + matrix[line][column] + " ");
            }
            System.out.println();
        }
    }
}