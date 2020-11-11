package com.epam.task.module3.workingWithRegularExpressions.Task1;

import com.epam.task.Utils.PrintStringUtil;

import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapIntArray;

public class SortByLengthWordInSentences {
    final static String END_SENTENCE = "[!?.]";
    final static String ALPHABETIC = "\\P{javaAlphabetic}+";

    public static void run() {
        getArraySentencesInText(Main.STRING);
    }

    public static String[] getArraySentencesInText(String string) {
        String[] arraySentencesInText = string.split(END_SENTENCE);
        for (int index = 0; index < arraySentencesInText.length; index++) {
            String[] arrayWordInSentences = arraySentencesInText[index].split(ALPHABETIC);
            printTextSortedByLengthWords(arrayWordInSentences);
        }
        return arraySentencesInText;
    }

    private static int[] getArrayLengthWords(String[] arrayWordInSentences) {
        int[] arrayLengthWords = new int[arrayWordInSentences.length];
        for (int index = 0; index < arrayLengthWords.length; index++) {
            arrayLengthWords[index] = arrayWordInSentences[index].length();
        }
        return arrayLengthWords;
    }

    private static void printTextSortedByLengthWords(String[] arraySentencesInText) {
        int[] arrayLengthWords = getArrayLengthWords(arraySentencesInText);
        for (int startIndex = 0; startIndex < arrayLengthWords.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < arrayLengthWords.length; sortIndex++) {
                if (arrayLengthWords[minIndex] > arrayLengthWords[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapIntArray(arrayLengthWords, startIndex, minIndex);
            swapStringArray(arraySentencesInText, startIndex, minIndex);
        }
        PrintStringUtil.printStringArrayAsSentence(arraySentencesInText);
    }
}