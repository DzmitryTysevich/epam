package com.epam.task.Utils;

public class PrintStringUtil {
    public static void printStringArray(String[] array) {
        for (int stringIndex = 0; stringIndex < array.length; stringIndex++) {
            System.out.printf("%s\n", array[stringIndex]);
        }
    }

    public static void printStringArrayAsSentence(String[] array) {
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            System.out.printf(" %s", array[arrayIndex]);
        }
        System.out.println();
    }

    public static void printStringArrayAsSentences(String[][] string) {
        for (int index = 0; index < string.length; index++) {
            printStringArrayAsSentence(string[index]);
        }
    }
}