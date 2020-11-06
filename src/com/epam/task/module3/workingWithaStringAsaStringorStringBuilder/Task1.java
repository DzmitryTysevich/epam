package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

import java.util.Arrays;

public class Task1 {
    private static char SPACE = ' ';

    public static void main(String[] args) {
        String string = "Дан текст (строка). Найдите  наибольшее    количество   подряд идущих         пробелов в нем.";
        String[] strings = string.split(" ");
        System.out.println(Arrays.toString(strings));
        getMaxSpaceInString(string);
    }

    public static void getMaxSpaceInString(String string) {
        int spaceLength = 0;
        int maxLength = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == SPACE) {
                spaceLength++;
                i++;
                while (string.charAt(i) == SPACE) {
                    spaceLength++;
                    i++;
                    maxLength = spaceLength;
                }
            } else {
                spaceLength = 0;
            }
        }
        System.out.println(maxLength);
    }
}