package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

import java.util.Arrays;

public class Task1 {
    final static char SPACE = ' ';
    final static String STRING = "Дан текст (строка). Найдите  наибольшее    количество   подряд идущих         пробелов в   нем.";

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        String[] strings = STRING.split(" ");
        System.out.println(Arrays.toString(strings));
        getMaxSpaceInString(STRING);
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
                    if (spaceLength > maxLength)
                        maxLength = spaceLength;
                }
            } else {
                spaceLength = 0;
            }
        }
        System.out.println(maxLength);
    }
}