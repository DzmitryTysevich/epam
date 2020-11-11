package com.epam.task.Utils;

public class PrintStringUtil {
    public static void printStringArray(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%s\n", array[index]);
        }
    }

    public static void printStringArrayAsSentence(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf(" %s", array[index]);
        }
        System.out.println();
    }

    public static void printStringArrayAsSentences(String[][] string) {
        for (int index = 0; index < string.length; index++) {
            printStringArrayAsSentence(string[index]);
        }
    }
}