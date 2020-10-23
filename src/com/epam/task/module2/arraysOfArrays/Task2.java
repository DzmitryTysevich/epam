package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        calculate(5, 5);
    }

    public static void calculate(int x, int y) {
        Random random = new Random();
        int[][] twoDimmArray = new int[x][y];
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 0; j < twoDimmArray.length; j++) {
                twoDimmArray[i][j] = random.nextInt(10);
                System.out.print(" " + twoDimmArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 0; j < twoDimmArray.length; j++) {
                if (i == j) {
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 0; j < twoDimmArray.length; j++) {
                if (i == twoDimmArray.length - 1 - j) {
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
            }
        }
    }
}
