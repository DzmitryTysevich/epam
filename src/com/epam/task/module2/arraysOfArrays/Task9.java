package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        calculate(6, 6);
    }

    public static void calculate(int x, int y) {
        Random random = new Random();
        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int sum = 0;
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            counter++;
            for (int j = 0; j < matrix.length; j++) {
                if (j == 0) {
                    sum += matrix[i][j];
                    System.out.printf("%d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(sum);
    }
}