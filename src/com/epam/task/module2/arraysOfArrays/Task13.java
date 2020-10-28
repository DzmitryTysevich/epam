package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int [][] matrix = buildDualArray(6,5);
        sortMatrixByColumnMax(matrix);
        System.out.println();
        sortMatrixByColumnMin(matrix);
    }

    public static int[][] buildDualArray(int x, int y) {
        Random random = new Random();
        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9);
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static void sortMatrixByColumnMax(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortMatrixByColumnMin(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}