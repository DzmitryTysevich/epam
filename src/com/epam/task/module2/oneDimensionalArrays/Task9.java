package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        findPopularValue(createRandomArray());
    }

    public static int[] createRandomArray() {

        Random random = new Random();
        int[] array = {5, 3, 9, 4, 3, 8, 7, 1, 1};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (random.nextInt(10) + 1);
//        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void findPopularValue (int [] array){
        int[] counterArray = new int[array.length];
        int popularNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                    counterArray[i] = counter;
                }
            }
        }
        int maxCounter = counterArray[0];
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] >= maxCounter) {
                maxCounter = counterArray[i];
                popularNumber = array[i];
                for (int j = 0; j < counterArray.length; j++) {
                    if (counterArray[j] == maxCounter && counterArray[j] == counterArray[i]) {
                        if (array[i] < array[j] && array[i] <= popularNumber) {
                            popularNumber = array[i];
                        }
                        if (array[i] > array[j]) {
                            popularNumber = array[j];
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(counterArray));
        System.out.println("Number: " + popularNumber);
    }
}