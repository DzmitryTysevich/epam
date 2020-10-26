package com.epam.task.module2.arraysOfArrays;

public class Task4 {
    public static void main(String[] args) {
        calculate(5);
    }

    public static void calculate(int n) {
        int[][] twoDimmArray = new int[n][n];
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 0; j < twoDimmArray.length; j++) {
                if (i % 2 != 0) {
                    twoDimmArray[i][j] = twoDimmArray.length - j;
                } else {
                    twoDimmArray[i][j] = j + 1;
                }
                System.out.print(" " + twoDimmArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}