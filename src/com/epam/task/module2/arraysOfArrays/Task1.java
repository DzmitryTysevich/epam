package com.epam.task.module2.arraysOfArrays;

import static com.epam.task.Utils.MatrixUtil.*;

public class Task1 {
    public static void main(String[] args) {
        getOddColumn(getRandomMatrix());
    }

    public static int[][] getOddColumn(int[][] matrix) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (column % 2 == 0 && matrix[0][column] > matrix[matrix.length - 1][column]) {
                    System.out.printf("\t%d ", matrix[line][column]);
                }
            }
            System.out.println();
        }
        return matrix;
    }
}