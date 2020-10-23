package com.epam.task.module2.arraysOfArrays;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        calculate(6, 6);
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
        int counter = 0;
        for (int i = 0; i < twoDimmArray.length; i++) {
            for (int j = 1; j < twoDimmArray.length; j++) {
                if (j % 2 != 0 && twoDimmArray[0][j] > twoDimmArray[twoDimmArray.length - 1][j]) {
                    counter++;
                    System.out.print(" " + twoDimmArray[i][j] + " ");
                }
            }
            System.out.println();
        }
        if(counter==0){
            System.out.println("No coincidence!");
        }
    }
}