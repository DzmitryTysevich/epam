package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        calculateNumber(10);
    }

    public static void calculateNumber(int n) {

        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (random.nextInt(10) + 1);
        }
        int min = a[0];
        for (int j : a) {
            if (j <= min) {
                min = j;
            }
        }
        System.out.println(Arrays.toString(a));

        for (int j : a) {
            if (j > min) {
                System.out.print(j + ", ");
            }
        }
        System.out.println();
        System.out.println("Min number: " + min);
    }
}