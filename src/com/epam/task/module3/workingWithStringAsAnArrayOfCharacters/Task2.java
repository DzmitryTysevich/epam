package com.epam.task.module3.workingWithStringAsAnArrayOfCharacters;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String text = "hello word today word again and word";
        System.out.println(text);
        char[] textArray = text.toCharArray();
        String wordForChange = "letter";
        char[] arrayWordForChange = wordForChange.toCharArray();
        System.out.println(getArrayWithChangeWords(textArray, arrayWordForChange));
    }

    public static char[] getArrayWithChangeWords(char[] textArray, char[] arrayWordForChange) {
        int lengthForChangeWordToLetter = getLengthForChangeWordToLetter(textArray, arrayWordForChange);
        char[] arrayWithChangeWords = new char[lengthForChangeWordToLetter];
        int indexWordToLetterChange = 0;
        for (int indexCharText = 0; indexCharText < textArray.length; indexCharText++) {
            if (isaBooleanReplacementWord(textArray, indexCharText)) {
                for (int indexCharReader = 0; indexCharReader < arrayWordForChange.length; indexCharReader++) {
                    arrayWithChangeWords[indexWordToLetterChange] = arrayWordForChange[indexCharReader];
                    indexWordToLetterChange++;
                }
                indexCharText = indexCharText + 3;
            } else {
                arrayWithChangeWords[indexWordToLetterChange] = textArray[indexCharText];
                indexWordToLetterChange++;
            }
        }
        return arrayWithChangeWords;
    }

    private static boolean isaBooleanReplacementWord(char[] textArray, int indexCharText) {
        return textArray[indexCharText] == 'w' && textArray[indexCharText + 1] == 'o' && textArray[indexCharText + 2] == 'r' && textArray[indexCharText + 3] == 'd';
    }

    private static int getSumWords(char[] wordArray) {
        int counterWords = 0;
        for (int indexCharText = 0; indexCharText < wordArray.length; indexCharText++) {
            if (isaBooleanReplacementWord(wordArray, indexCharText)) {
                counterWords++;
            }
        }
        return counterWords;
    }

    private static int getLengthForChangeWordToLetter(char[] wordArray, char[] arrayWordForChange) {
        return wordArray.length + (getSumWords(wordArray) * (arrayWordForChange.length - 4));
    }
}