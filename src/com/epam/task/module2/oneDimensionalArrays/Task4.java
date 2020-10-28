package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        calculate(10);
    }

    public static void calculate(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 3;
        }
        System.out.println("Array numbers: " + Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
        System.out.println("Array numbers: " + Arrays.toString(array));
        System.out.println(max + " " + min);
    }
}