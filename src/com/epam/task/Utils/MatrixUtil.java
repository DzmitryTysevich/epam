package com.epam.task.Utils;

import java.util.Random;

public class MatrixUtil {
    public static int[][] getRandomMatrix() {
        int line = InputUtil.getInputValue("Enter line: ");
        int column = InputUtil.getInputValue("Enter column: ");
        int randomSize = InputUtil.getInputValue("Enter random size: ");
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int lineI = 0; lineI < matrix.length; lineI++) {
            for (int columnJ = 0; columnJ < matrix[lineI].length; columnJ++) {
                matrix[lineI][columnJ] = random.nextInt(randomSize);
                System.out.print("\t" + matrix[lineI][columnJ]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static int[][] getRandomMatrixWithMinusValue() {
        int line = InputUtil.getInputValue("Enter line: ");
        int column = InputUtil.getInputValue("Enter column: ");
        int randomSize = InputUtil.getInputValue("Enter random size: ");
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int lineI = 0; lineI < matrix.length; lineI++) {
            for (int columnJ = 0; columnJ < matrix[lineI].length; columnJ++) {
                matrix[lineI][columnJ] = random.nextInt(randomSize) - 3;
                System.out.print("\t" + matrix[lineI][columnJ]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static int[][] getFillMatrix() {
        int line = InputUtil.getInputValue("Enter line: ");
        int column = InputUtil.getInputValue("Enter column: ");
        int[][] matrix = new int[line][column];
        for (int lineI = 0; lineI < matrix.length; lineI++) {
            for (int columnJ = 0; columnJ < matrix[lineI].length; columnJ++) {
                System.out.print("\t" + matrix[lineI][columnJ]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static double[][] getRandomPointsMatrix() {
        Random random = new Random();
        double[][] matrix = new double[InputUtil.getInputValue("Enter amount points: ")][2];
        int randomSize = InputUtil.getInputValue("Enter random size: ");
        for (int lineI = 0; lineI < matrix.length; lineI++) {
            for (int columnJ = 0; columnJ < matrix[lineI].length; columnJ++) {
                matrix[lineI][columnJ] = random.nextInt(randomSize);
                System.out.print("\t" + matrix[lineI][columnJ]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }
}