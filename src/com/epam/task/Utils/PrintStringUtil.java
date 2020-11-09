package com.epam.task.Utils;

public class PrintStringUtil {
    public static void printStringArray(String[] string) {
        for (int stringIndex = 0; stringIndex < string.length; stringIndex++) {
            System.out.printf("%s\n", string[stringIndex]);
        }
    }

    public static void printStringArrayAsSentence(String[] string) {
        for (int stringIndex = 0; stringIndex < string.length; stringIndex++) {
            System.out.printf(" %s", string[stringIndex]);
        }
        System.out.println();
    }
}