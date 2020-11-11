package com.epam.task.module3.workingWithRegularExpressions.Task1;

import com.epam.task.Utils.PrintStringUtil;

import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapIntArray;

public class SortByLengthWordInSentences {
    final static String END_SENTENCE_REGEX = "[!?.]";
    final static String ALPHABETIC_REGEX = "\\P{javaAlphabetic}+";

    public static void run() {
        String[][] sentencesWithSortedWords = getSentencesWithSortedWords(Main.STRING);
        PrintStringUtil.printStringArrayAsSentences(sentencesWithSortedWords);
    }

    public static String[][] getSentencesWithSortedWords(String string) {
        String[] allSentences = string.split(END_SENTENCE_REGEX);
        String[][] sentencesWithWords = new String[allSentences.length][];
        for (int index = 0; index < allSentences.length; index++) {
            String sentence = allSentences[index];
            String[] words = getWordsSortedByLength(sentence);
            sentencesWithWords[index] = words;
        }
        return sentencesWithWords;
    }

    private static String[] getWordsSortedByLength(String sentence) {
        String[] words = sentence.split(ALPHABETIC_REGEX);
        sortByWordLength(words);
        return words;
    }

    private static int[] getWordsLengths(String[] words) {
        int[] wordsLengths = new int[words.length];
        for (int index = 0; index < wordsLengths.length; index++) {
            wordsLengths[index] = words[index].length();
        }
        return wordsLengths;
    }

    private static void sortByWordLength(String[] words) {
        int[] wordsLengths = getWordsLengths(words);
        for (int startIndex = 0; startIndex < wordsLengths.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < wordsLengths.length; sortIndex++) {
                if (wordsLengths[minIndex] > wordsLengths[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapIntArray(wordsLengths, startIndex, minIndex);
            swapStringArray(words, startIndex, minIndex);
        }
    }
}