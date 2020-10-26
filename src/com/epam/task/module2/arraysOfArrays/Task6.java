package com.epam.task.module2.arraysOfArrays;

public class Task6 {
    public static void main(String[] args) {
        calculate(8);
    }

    public static void calculate(int n) {
        if (n % 2 == 0) {
            int[][] twoDimmArray = new int[n][n];
            for (int i = 0; i < twoDimmArray.length; i++) {
                for (int j = 0; j < twoDimmArray.length; j++) {
                    if (j >= i && j <= twoDimmArray.length - i - 1) {
                        twoDimmArray[i][j] = 1;
                    }
                    if (j <= i && j >= twoDimmArray.length - i - 1) {
                        twoDimmArray[i][j] = 1;
                    }
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Input wrong");
        }
    }
}