package com.epam.task.module2.arraysOfArrays;

public class Task14 {
    public static void main(String[] args) {
        fillMatrixValue(buildDualArray(5, 6));
    }


    public static int[][] buildDualArray(int x, int y) {
        int[][] matrix = new int[x][y];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%d  ", anInt);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static void fillMatrixValue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (i <= matrix.length - j - 1) {
                    matrix[i][j] = 1;
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}