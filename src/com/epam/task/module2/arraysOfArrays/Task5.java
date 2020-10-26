package com.epam.task.module2.arraysOfArrays;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {
        calculate(8);
    }

    public static void calculate(int n) {
        if (n % 2 == 0) {
            int[][] twoDimmArray = new int[n][n];
            for (int i = 0; i < twoDimmArray.length; i++) {
                for (int j = 0; j < twoDimmArray.length - i; j++) {
                    twoDimmArray[i][j] = i + 1;
                }
            }
            for (int i = 0; i < twoDimmArray.length; i++) {
                for (int j = 0; j < twoDimmArray.length; j++) {
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Input wrong");
        }
    }
}
