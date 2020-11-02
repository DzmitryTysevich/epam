package com.epam.task.Utils;

import java.util.Random;

public class ArrayUtil {
    public static int[] getFillArray() {
        int[] array = new int[InputUtil.getInPutValue("Enter size: ")];
        return array;
    }

    public static int[] getRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[InputUtil.getInPutValue("Enter size array: ")];
        int randomValue = InputUtil.getInPutValue("Enter random value: ");
        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = random.nextInt(randomValue);
        }
        return randomArray;
    }
}