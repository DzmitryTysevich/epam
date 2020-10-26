package com.epam.task.module2.arraysOfArrays;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        calculate(6, 5);
    }

    public static void calculate(int x, int y) {
        Random random = new Random();
        int[][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.printf("%d ", matrix[i][j]);

            }
            System.out.println();
        }
        System.out.println();

        int[] sum = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[j] += matrix[i][j];
            }
        }
        int max = sum[0];
        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
                result = i;
            }
        }
        System.out.println(Arrays.toString(sum));
        System.out.println("Result = " + result);
    }
}
