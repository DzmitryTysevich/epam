package com.epam.task.module2.arraysOfArrays;

import com.epam.task.Utils.InputUtil;

public class Task7 {
    public static void main(String[] args) {
        printSquareMatrix(InputUtil.getInPutValue("Enter size: "));
    }

    public static void printSquareMatrix(int lengthArray) {
        double[][] matrix = new double[lengthArray][lengthArray];
        int summaPositiveElements = 0;
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[line][column] = Math.sin((Math.pow(line, 2) - Math.pow(column, 2)) / lengthArray);
                if (matrix[line][column] > 0) {
                    summaPositiveElements++;
                }
                System.out.printf("\t%.2f ", matrix[line][column]);
            }
            System.out.println();
        }
        System.out.println("Summa: " + summaPositiveElements);
    }
}