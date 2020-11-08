package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task7 {
    final static char SPACE = ' ';
    final static String STRING = "abc cde def";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        StringBuilder stringBuilder = new StringBuilder(STRING);
        System.out.println(getTextWithoutSpaceAndDoubleChar(stringBuilder));
    }

    public static StringBuilder getTextWithoutSpaceAndDoubleChar(StringBuilder stringBuilder) {
        getStringWithoutDoubleChar(stringBuilder);
        getStringWithoutSpace(stringBuilder);
        return stringBuilder;
    }

    private static StringBuilder getStringWithoutSpace(StringBuilder stringBuilder) {
        for (int indexChar = 0; indexChar < stringBuilder.length(); indexChar++) {
            if (stringBuilder.charAt(indexChar) == SPACE)
                stringBuilder.deleteCharAt(indexChar);
        }
        return stringBuilder;
    }

    private static StringBuilder getStringWithoutDoubleChar(StringBuilder stringBuilder) {
        for (int indexChar = 0; indexChar < stringBuilder.length(); indexChar++) {
            for (int indexCharReader = indexChar + 1; indexCharReader < stringBuilder.length(); indexCharReader++) {
                if (stringBuilder.charAt(indexChar) == stringBuilder.charAt(indexCharReader))
                    stringBuilder.deleteCharAt(indexCharReader);
            }
        }
        return stringBuilder;
    }
}