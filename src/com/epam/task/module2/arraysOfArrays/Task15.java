package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = buildDualArray(8, 8);
        changeUnevenElementMatrix(matrix);
    }

    public static int[][] buildDualArray(int line, int column) {
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    private static int findMaxElementMatrix(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public static void changeUnevenElementMatrix(int[][] matrix) {
        int maxElement = findMaxElementMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (j % 2 == 0) {
                    matrix[i][j] = maxElement;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}