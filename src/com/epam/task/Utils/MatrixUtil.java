package com.epam.task.Utils;

import java.util.Random;

public class MatrixUtil {
    public static int[][] buildRandomMatrix() {
        int line = InputUtil.inPutValue("Enter line: ");
        int column = InputUtil.inPutValue("Enter column: ");
        int randomSize = InputUtil.inPutValue("Enter random size: ");
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(randomSize);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static int[][] buildRandomMatrixWithMinusValue() {
        int line = InputUtil.inPutValue("Enter line: ");
        int column = InputUtil.inPutValue("Enter column: ");
        int randomSize = InputUtil.inPutValue("Enter random size: ");
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(randomSize) - 3;
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    public static int[][] buildFillMatrix() {
        int line = InputUtil.inPutValue("Enter line: ");
        int column = InputUtil.inPutValue("Enter column: ");
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }
}