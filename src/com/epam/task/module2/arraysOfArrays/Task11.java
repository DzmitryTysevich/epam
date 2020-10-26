package com.epam.task.module2.arraysOfArrays;

import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        buildDualArray(10, 20);
    }

    public static void buildDualArray(int x, int y) {
        Random random = new Random();
        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(15);
                System.out.printf(" %d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Result of matches: ");
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    array[i] += matrix[i][j] / 5;
                    if (array[i] > 3) {
                        System.out.print(i + "; ");
                    }
                }
            }
        }
    }
}