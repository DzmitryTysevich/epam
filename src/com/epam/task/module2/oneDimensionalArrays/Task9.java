package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] randomArray = createRandomArray(9);
        System.out.println(findPopularValue(randomArray));
    }

    public static int[] createRandomArray(int size) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
        }
        System.out.println(Arrays.toString(array) + " - Random array");
        return array;
    }

    public static int findPopularValue(int[] array) {
        int[] counterArray = createCounterArray(array);
        return findPopularValue(array, counterArray);
    }

    public static int[] createCounterArray(int[] array) {
        int[] counterArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                    counterArray[i] = counter;
                }
            }
        }
        return counterArray;
    }

    public static int findPopularValue(int[] array, int[] counterArray) {
        int popularValue = 0;
        int maxCounter = counterArray[0];
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] >= maxCounter) {
                maxCounter = counterArray[i];
                popularValue = array[i];
                for (int j = 0; j < counterArray.length; j++) {
                    if (counterArray[j] == maxCounter && counterArray[i] == counterArray[j]) {
                        if (array[i] < array[j] && array[i] <= popularValue) {
                            popularValue = array[i];
                        }
                        if (array[i] > array[j]) {
                            popularValue = array[j];
                        }
                    }
                }
            }
        }
        return popularValue;
    }
}