package com.epam.task.Utils;

import java.util.Random;

public class MatrixUtil {
    public static int[][] getRandomMatrix() {
        int line = InputUtil.getInPutValue("Enter line: ");
        int column = InputUtil.getInPutValue("Enter column: ");
        int randomSize = InputUtil.getInPutValue("Enter random size: ");
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
        int line = InputUtil.getInPutValue("Enter line: ");
        int column = InputUtil.getInPutValue("Enter column: ");
        int randomSize = InputUtil.getInPutValue("Enter random size: ");
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
        int line = InputUtil.getInPutValue("Enter line: ");
        int column = InputUtil.getInPutValue("Enter column: ");
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
        double[][] matrix = new double[InputUtil.getInPutValue("Enter amount points: ")][2];
        int randomSize = InputUtil.getInPutValue("Enter random size: ");
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