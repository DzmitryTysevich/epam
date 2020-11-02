package com.epam.task.module2.arraysOfArrays;

import java.util.Arrays;

import static com.epam.task.Utils.MatrixUtil.*;

public class Task9 {
    public static void main(String[] args) {
        int[][] randomMatrix = getRandomMatrix();
        System.out.println(Arrays.toString(getSumForColumns(randomMatrix)));
        System.out.printf("Column with max sum: %d", getColumnWithMaxSum(getSumForColumns(randomMatrix)));
    }

    public static int[] getSumForColumns(int[][] matrix) {
        int[] summa = new int[matrix[0].length];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                summa[column] += matrix[line][column];
            }
        }
        return summa;
    }

    public static int getColumnWithMaxSum(int[] summa) {
        int max = summa[0];
        int result = 0;
        for (int index = 0; index < summa.length; index++) {
            if (summa[index] > max) {
                max = summa[index];
                result = index;
            }
        }
        return result;
    }
}