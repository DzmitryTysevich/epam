package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.NumberOperation;

import java.util.Arrays;

public class Task13 {
       public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        int [] array = new int[20];
        int counter = 0;
        for (int i = 1; i < 20; i++) {
            if (isMaxOneDivider(i) && i != 2) {
                array[counter]=i;
                counter++;
            }
        }
       int [] array1 = Arrays.copyOf(array, counter);
        for (int i = 0; i < 7; i++) {
            if(array1[i+1]-array1[i]==2){
                System.out.printf("%d %d\n", array1[i], array1[i+1]);
            }
        }
    }

    public static boolean isMaxOneDivider(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
