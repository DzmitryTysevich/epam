package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        calculate(2, 2);
    }

    public static void calculate(int k, int p) {
        Random random = new Random();
        int[][] twoDimmArray = new int[5][5];
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
                if (i == k - 1) {
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 0; j < twoDimmArray.length; j++) {
                if (j == p - 1) {
                    System.out.println(" " + twoDimmArray[i][j] + " ");
                }
            }
        }
    }
}