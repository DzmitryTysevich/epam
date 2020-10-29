package com.epam.task.module2.arraysOfArrays;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {
        squareMatrix(8);
    }

    public static void squareMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}