package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        buildDualArray(8, 8);
    }

    public static void buildDualArray(int x, int y) {
        Random random = new Random();
        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9);
                System.out.printf(" %d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Result: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
    }
}
