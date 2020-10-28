package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        calculateSum(10);
    }

    public static void calculateSum(int n) {
        Random random = new Random();
        int[] a = new int[n];
        int sumNumber = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 1;
            if (isSimpleNum(i)) {
                sumNumber += a[i];
            }
        }
        System.out.println("Summa: " + sumNumber);
        System.out.println("Array numbers: " + Arrays.toString(a));
    }

    private static boolean isSimpleNum(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}