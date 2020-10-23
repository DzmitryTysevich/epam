package com.epam.task.module2.arraysOfArrays;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        calculate(5);
    }

    public static void calculate(int x) {
        Random random = new Random();
        int[][] twoDimmArray = new int[x][x];
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 0; j < twoDimmArray.length; j++) {
                if (i % 2 != 0) {
                    twoDimmArray[i][j] = twoDimmArray.length - j;
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                } else {
                    twoDimmArray[i][j] = j + 1;
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}