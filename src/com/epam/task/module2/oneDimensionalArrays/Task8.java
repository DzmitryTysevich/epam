package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        calculateNumber(10);
    }

    public static void calculateNumber(int n) {

        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
        }
        int min = array[0];
        for (int j : array) {
            if (j <= min) {
                min = j;
            }
        }
        int counter = 0;
        for (int j : array) {
            if (j == min) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] b = new int[array.length - counter];
        int indexB = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != min) {
                b[indexB] = array[j];
                indexB++;
            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println("Min number: " + min + ", Counter: " + counter);
    }
}