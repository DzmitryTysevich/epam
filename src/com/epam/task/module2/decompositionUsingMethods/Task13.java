package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.NumberOperation;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSimpleNumbersTwins(1)));
    }

    public static int[] findSimpleNumbersTwins(int startNumber) {
        int endNumber = 100;
        int[] array = new int[endNumber];
        for (int i = startNumber; i < endNumber; i++) {
            if (endNumber % i == 0)
                array[i] = i;
        }
        return array;
    }
}
