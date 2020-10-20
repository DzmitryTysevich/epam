package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        calculate(10);
    }

    public static void calculate(int n) {
        int counterPlus = 0;
        int counterMinus = 0;
        int counterZero = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 10) + (Math.random() * -10));
            if (a[i] > 0) {
                counterPlus++;
            } else if (a[i] < 0) {
                counterMinus++;
            } else if (a[i] == 0) {
                counterZero++;
            }
        }
        System.out.println("Array numbers: " + Arrays.toString(a));
        System.out.println("Counter plus: " + counterPlus + "\n" +
                "Counter minus: " + counterMinus + "\n" +
                "Counter zero: " + counterZero);
    }
}
