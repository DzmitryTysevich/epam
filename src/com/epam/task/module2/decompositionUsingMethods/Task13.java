package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.getInPutValue;
import static com.epam.task.Utils.NumberOperation.isMaxOneDivider;

public class Task13 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        getSimpleNumbers(getInPutValue("Enter N: "));
    }

    public static int [] getSimpleNumbers(int nuberN) {
        int[] array = new int[nuberN];
        int doubleNumberN = nuberN * 2;
        if (nuberN > 2) {
            int indexArray = 0;
            for (int number = nuberN; number < doubleNumberN; number++) {
                if (isMaxOneDivider(number) && number != 2) {
                    array[indexArray] = number;
                    indexArray++;
                }
            }
            printPairsSimpleNumber(array, indexArray);
        } else {
            System.out.println("wrong number!");
        }return array;
    }

    private static void printPairsSimpleNumber(int[] array, int indexArray) {
        for (int i = 0; i < indexArray; i++) {
            if (array[i + 1] - array[i] == 2) {
                System.out.printf("%d : %d\n", array[i], array[i + 1]);
            }
        }
    }
}