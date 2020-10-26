package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        calculate(6, 1, 3);
    }

    public static void calculate(int n, int firstColumn, int secondColumn) {
        Random random = new Random();
        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = random.nextInt(10);
                    System.out.printf(" %d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (j == firstColumn && firstColumn < secondColumn) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][secondColumn];
                        matrix[i][secondColumn] = temp;
                    }
                    if (j == secondColumn && firstColumn > secondColumn) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][firstColumn];
                        matrix[i][firstColumn] = temp;
                    }
                    System.out.printf(" %d ", matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Input wrong");
        }
    }
}