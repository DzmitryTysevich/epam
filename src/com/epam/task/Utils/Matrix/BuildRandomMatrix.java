package com.epam.task.Utils.Matrix;

import java.util.Random;
import java.util.Scanner;

public class BuildRandomMatrix {
    public static int[][] buildRandomMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter line: ");
        int line = in.nextInt();
        System.out.print("Enter column: ");
        int column = in.nextInt();
        System.out.print("Enter random size: ");
        int randomSize = in.nextInt();
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
}