package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

import static com.epam.task.Utils.InputUtil.getInputString;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String string = getInputString("Enter word: ");
        StringBuilder stringBuilderWord = new StringBuilder(string);

        boolean isPalindromeWord = isPalindromeWord(stringBuilderWord);
        System.out.printf("The word is palindrom: %b", isPalindromeWord);
    }

    public static StringBuilder getReverseStringBuilderWord(StringBuilder stringBuilderWord) {
        StringBuilder reverseWord = new StringBuilder(stringBuilderWord);
        return reverseWord.reverse();
    }

    public static int getDifferenceValueBetweenWords(StringBuilder stringBuilderWord) {
        StringBuilder reverseStringBuilderWord = getReverseStringBuilderWord(stringBuilderWord);
        return reverseStringBuilderWord.compareTo(stringBuilderWord);
    }

    public static boolean isPalindromeWord(StringBuilder stringBuilderWord) {
        return getDifferenceValueBetweenWords(stringBuilderWord) == 0;
    }
}