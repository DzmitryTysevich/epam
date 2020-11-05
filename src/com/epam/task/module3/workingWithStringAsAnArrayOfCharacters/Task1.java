package com.epam.task.module3.workingWithStringAsAnArrayOfCharacters;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String string = "aRrayChar";
        System.out.println(string);
        char[] charArrayFromString = string.toCharArray();
        getArrayIndexToInsert(charArrayFromString);
        char[] change = changeWord(charArrayFromString);
        String string2 = String.valueOf(change);
        System.out.println(string2);
    }

    public static int getUpperCharSum(char[] charArrayFromString) {
        int upperCharSum = 0;
        for (int charIndex = 0; charIndex < charArrayFromString.length; charIndex++) {
            if (Character.isUpperCase(charArrayFromString[charIndex])) {
                upperCharSum++;
            }
        }
        return upperCharSum;
    }

    public static int[] getArrayIndexToInsert(char[] charArrayFromString) {
        int[] indexArrayToInsert = new int[getUpperCharSum(charArrayFromString)];
        int tempIndex = 0;
        for (int charIndex = 0; charIndex < charArrayFromString.length; charIndex++) {
            if (Character.isUpperCase(charArrayFromString[charIndex])) {
                indexArrayToInsert[tempIndex] = charIndex;
                tempIndex++;
            }
        }
        return indexArrayToInsert;
    }

    public static char[] getCharArrayInSnakeCase(char[] charArrayFromString, int indexArrayToInsert) {
        char[] charArrayInSnakeCase = new char[charArrayFromString.length + 1];
        int temp = 0;
        char charToInsert = '_';
        for (int i = 0; i < charArrayInSnakeCase.length; i++) {
            if (i == indexArrayToInsert) {
                charArrayInSnakeCase[i] = charToInsert;
            } else {
                charArrayInSnakeCase[i] = charArrayFromString[temp];
                temp++;
            }
        }
        System.out.println("InSnake" + Arrays.toString(charArrayInSnakeCase));
        return charArrayInSnakeCase;
    }

    public static char[] changeWord(char[] charArrayFromString) {
        int[] indexArray = getArrayIndexToInsert(charArrayFromString);
        for (int i = indexArray.length - 1; i >= 0; i--) {
            for (int j = charArrayFromString.length - 1; j >= 0; j--) {
                if (j == indexArray[i]) {
                    charArrayFromString = getCharArrayInSnakeCase(charArrayFromString, j);
                }
            }
        }
        return charArrayFromString;
    }
}