package com.epam.task.module3.workingWithRegularExpressions.Task1;

import com.epam.task.Utils.InputUtil;
import com.epam.task.Utils.PrintStringUtil;

import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapIntArray;

public class SortByLexeme {
    final static String END_SENTENCE_REGEX = "[!?.]+";
    final static String ALPHABETIC_REGEX = "\\P{javaLetterOrDigit}+";
    final static String LITERAL_REGEX = "\\B";
    static String LEXEME_REGEX = InputUtil.getInputString("Enter lexeme: ");

    public static void run() {
        String[] allSentences = getSentences();
        printTextSortedByLexeme(allSentences);
    }

    public static void printTextSortedByLexeme(String[] allSentences) {
        for (String string : allSentences) {
            String[] sentenceWithWords = string.split(ALPHABETIC_REGEX);
            int[] literalsInWordCount = getLiteralsInWordCount(sentenceWithWords);
            getWordsSortedByLiteralsCount(sentenceWithWords, literalsInWordCount);
            getWordsSortedByAlphabetically(sentenceWithWords, literalsInWordCount);
            PrintStringUtil.printStringArrayAsSentence(sentenceWithWords);
        }
    }

    private static int[] getLiteralsInWordCount(String[] wordsInSentence) {
        int[] literalsInWordCount = new int[wordsInSentence.length];
        for (int j = 0; j < wordsInSentence.length; j++) {
            String[] arrayCharsInWord = wordsInSentence[j].split(LITERAL_REGEX);
            for (int k = 1; k < arrayCharsInWord.length; k++) {
                literalsInWordCount[j] = getLexemesCount(arrayCharsInWord);
            }
        }
        return literalsInWordCount;
    }

    private static String[] getWordsSortedByLiteralsCount(String[] wordsInSentence, int[] literalsInWordCount) {
        for (int startIndex = 0; startIndex < literalsInWordCount.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < literalsInWordCount.length; sortIndex++) {
                if (literalsInWordCount[minIndex] < literalsInWordCount[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapIntArray(literalsInWordCount, startIndex, minIndex);
            swapStringArray(wordsInSentence, startIndex, minIndex);
        }
        return wordsInSentence;
    }

    private static String[] getWordsSortedByAlphabetically(String[] wordsInSentence, int[] literalsInWordCount) {
        for (int startIndex = wordsInSentence.length - 1; startIndex > 0; startIndex--) {
            for (int sortIndex = 0; sortIndex < startIndex; sortIndex++) {
                if (literalsInWordCount[sortIndex] == literalsInWordCount[sortIndex + 1]
                        && literalsInWordCount[sortIndex] != 0 && literalsInWordCount[sortIndex + 1] != 0) {
                    if (wordsInSentence[sortIndex].compareToIgnoreCase(wordsInSentence[sortIndex + 1]) > 0) {
                        swapStringArray(wordsInSentence, sortIndex, (sortIndex + 1));
                    }
                }
            }
        }
        return wordsInSentence;
    }

    private static int getLexemesCount(String[] string) {
        int counter = 0;
        for (String symbol : string) {
            if (LEXEME_REGEX.contains(symbol)) {
                counter++;
            }
        }
        return counter;
    }

    private static String[] getSentences() {
        return Main.STRING.split(END_SENTENCE_REGEX);
    }
}