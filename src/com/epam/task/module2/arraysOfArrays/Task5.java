package com.epam.task.module2.arraysOfArrays;

public class Task5 {
    public static void main(String[] args) {
        printSquareMatrix(8);
    }

    public static void printSquareMatrix(int lengthArray) {
        int[][] matrix = new int[lengthArray][lengthArray];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length - line; column++) {
                matrix[line][column] = line + 1;
            }
        }
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print("\t" + matrix[line][column] + " ");
            }
            System.out.println();
        }
    }
}