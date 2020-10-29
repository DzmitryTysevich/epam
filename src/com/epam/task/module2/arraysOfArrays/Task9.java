package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.Matrix.BuildRandomMatrix;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[][] randomMatrix = BuildRandomMatrix.buildRandomMatrix();
        System.out.println(Arrays.toString(calculateSumValue(randomMatrix)));
        System.out.printf("Column with max sum: %d", findColumnWithMaxSum(calculateSumValue(randomMatrix)));
    }

    public static int[] calculateSumValue(int[][] matrix) {
        int[] sum = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[j] += matrix[i][j];
            }
        }
        return sum;
    }

    public static int findColumnWithMaxSum(int[] sum) {
        int max = sum[0];
        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
                result = i;
            }
        }
        return result;
    }
}