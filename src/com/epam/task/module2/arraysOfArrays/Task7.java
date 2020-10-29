package com.epam.task.module2.arraysOfArrays;

public class Task7 {
    public static void main(String[] args) {
        squareMatrix(8);
    }

    public static void squareMatrix(int size) {
        double[][] matrix = new double[size][size];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / size);
                if (matrix[i][j] > 0) {
                    counter++;
                }
                System.out.printf(" %.2f ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Counter: " + counter);
    }
}