package com.epam.task.module2.arraysOfArrays;

public class Task4 {
    public static void main(String[] args) {
        squareMatrix(5);
    }

    public static void squareMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 != 0) {
                    matrix[i][j] = matrix.length - j;
                } else {
                    matrix[i][j] = j + 1;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}