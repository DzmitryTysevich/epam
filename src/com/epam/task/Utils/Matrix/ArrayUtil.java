package com.epam.task.Utils.Matrix;

import java.util.Random;

public class ArrayUtil {
    public static int[] fillArray() {
        int[] array = new int[InputUtil.inPutValue("Enter size: ")];
        return array;
    }

    public static int[] randomArray() {
        Random random = new Random();
        int[] randomArray = new int[InputUtil.inPutValue("Enter size array: ")];
        int randomValue = InputUtil.inPutValue("Enter random value: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(randomValue);
        }
        return randomArray;
    }
}