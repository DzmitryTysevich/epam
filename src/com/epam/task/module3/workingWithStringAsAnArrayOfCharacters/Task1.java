package com.epam.task.module3.workingWithStringAsAnArrayOfCharacters;

import com.epam.task.Utils.InputUtil;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String string = InputUtil.getInputString("Enter string: ");
        System.out.println(string);
        char[] charArrayFromString = string.toCharArray();
        getArrayIndexToInsert(charArrayFromString);
        char[] stringChange = getStringChange(charArrayFromString);
        String stringNew = String.valueOf(stringChange);
        System.out.println(stringNew);
    }

    public static char[] getStringChange(char[] charArrayFromString) {
        int[] arrayIndexToInsert = getArrayIndexToInsert(charArrayFromString);
        for (int indexChars = arrayIndexToInsert.length - 1; indexChars >= 0; indexChars--) {
            for (int indexReader = charArrayFromString.length - 1; indexReader >= 0; indexReader--) {
                if (indexReader == arrayIndexToInsert[indexChars]) {
                    charArrayFromString = getCharArrayInWords(charArrayFromString, indexReader);
                }
            }
        }
        return charArrayFromString;
    }

    private static int getUpperCharSum(char[] charArrayFromString) {
        int upperCharSum = 0;
        for (int charIndex = 0; charIndex < charArrayFromString.length; charIndex++) {
            if (Character.isUpperCase(charArrayFromString[charIndex])) {
                upperCharSum++;
            }
        }
        return upperCharSum;
    }

    private static int[] getArrayIndexToInsert(char[] charArrayFromString) {
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

    private static char[] getCharArrayInWords(char[] charArrayFromString, int indexArrayToInsert) {
        char[] charsArrayInWords = new char[charArrayFromString.length + 1];
        int temp = 0;
        char charToInsert = '_';
        for (int indexChars = 0; indexChars < charsArrayInWords.length; indexChars++) {
            if (indexChars == indexArrayToInsert) {
                charsArrayInWords[indexChars] = charToInsert;
            } else {
                charsArrayInWords[indexChars] = charArrayFromString[temp];
                temp++;
            }
        }
        return charsArrayInWords;
    }
}