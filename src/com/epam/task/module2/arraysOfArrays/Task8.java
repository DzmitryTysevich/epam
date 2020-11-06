package com.epam.task.module2.arraysOfArrays;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.MatrixUtil.*;
import static com.epam.task.Utils.PrintMatrixUtil.*;

public class Task8 {
    public static void main(String[] args) {
        int[][] randomMatrix = getRandomMatrix();
        getChangeColumnMatrix(randomMatrix, getInputValue("Enter first column: "), getInputValue("Enter second column: "));
        printMatrix(randomMatrix);
    }

    public static int[][] getChangeColumnMatrix(int[][] matrix, int firstColumn, int secondColumn) {
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                if (column == firstColumn && firstColumn < secondColumn) {
                    int tempValue = matrix[line][column];
                    matrix[line][column] = matrix[line][secondColumn];
                    matrix[line][secondColumn] = tempValue;
                }
                if (column == secondColumn && firstColumn > secondColumn) {
                    int tempValue = matrix[line][column];
                    matrix[line][column] = matrix[line][firstColumn];
                    matrix[line][firstColumn] = tempValue;
                }
            }
        }
        return matrix;
    }
}