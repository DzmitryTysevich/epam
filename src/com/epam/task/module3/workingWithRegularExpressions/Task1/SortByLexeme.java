package com.epam.task.module3.workingWithRegularExpressions.Task1;

import com.epam.task.Utils.InputUtil;
import com.epam.task.Utils.PrintStringUtil;

import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapIntArray;

public class SortByLexeme {
    final static String END_SENTENCE = "[!?.]+";
    final static String ALPHABETIC = "\\P{javaLetterOrDigit}+";
    final static String CHAR = "\\B";
    static String LEXEME = InputUtil.getInputString("Enter lexeme: ");

    public static void run() {
        String[] sentencesInArray = getSentencesInArray();
        printSortedTextByLexeme(sentencesInArray);
    }

    public static void printSortedTextByLexeme(String[] sentencesInArray) {
        for (String string : sentencesInArray) {
            String[] wordsInSentence = string.split(ALPHABETIC);
            int[] arrayAmountCharsInWords = getArrayAmountsCharsInWords(wordsInSentence);
            sortByAmountCharInWordsText(wordsInSentence, arrayAmountCharsInWords);
            sortAlphabeticText(wordsInSentence, arrayAmountCharsInWords);
            PrintStringUtil.printStringArrayAsSentence(wordsInSentence);
        }
    }

    private static int[] getArrayAmountsCharsInWords(String[] wordsInSentence) {
        int[] arrayAmountCharsInWords = new int[wordsInSentence.length];
        for (int j = 0; j < wordsInSentence.length; j++) {
            String[] arrayCharsInWord = wordsInSentence[j].split(CHAR);
            for (int k = 1; k < arrayCharsInWord.length; k++) {
                arrayAmountCharsInWords[j] = getAmountLexemes(arrayCharsInWord);
            }
        }
        return arrayAmountCharsInWords;
    }

    private static void sortByAmountCharInWordsText(String[] wordsInSentence, int[] arrayAmountCharsInWords) {
        for (int startIndex = 0; startIndex < arrayAmountCharsInWords.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < arrayAmountCharsInWords.length; sortIndex++) {
                if (arrayAmountCharsInWords[minIndex] < arrayAmountCharsInWords[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapIntArray(arrayAmountCharsInWords, startIndex, minIndex);
            swapStringArray(wordsInSentence, startIndex, minIndex);
        }
    }

    private static void sortAlphabeticText(String[] wordsInSentence, int[] arrayAmountCharsInWords) {
        for (int startIndex = wordsInSentence.length - 1; startIndex > 0; startIndex--) {
            for (int sortIndex = 0; sortIndex < startIndex; sortIndex++) {
                if (arrayAmountCharsInWords[sortIndex] == arrayAmountCharsInWords[sortIndex + 1]
                        && arrayAmountCharsInWords[sortIndex] != 0 && arrayAmountCharsInWords[sortIndex + 1] != 0) {
                    if (wordsInSentence[sortIndex].compareToIgnoreCase(wordsInSentence[sortIndex + 1]) > 0) {
                        swapStringArray(wordsInSentence, sortIndex, (sortIndex + 1));
                    }
                }
            }
        }
    }

    private static int getAmountLexemes(String[] string) {
        int sumLexemes = 0;
        for (String symbol : string) {
            if (LEXEME.contains(symbol)) {
                sumLexemes++;
            }
        }
        return sumLexemes;
    }

    private static String[] getSentencesInArray() {
        return Main.STRING.split(END_SENTENCE);
    }
}