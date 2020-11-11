package com.epam.task.module3.workingWithRegularExpressions.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.Utils.PrintStringUtil.printStringArray;
import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapIntArray;
import static com.epam.task.module3.workingWithRegularExpressions.Task1.Main.STRING;

public class SortByAmountSentencesInParagraph {
    final static String END_OF_SENTENCE_REGEX = "[!?.]";

    public static void run() {
        int[] sentencesInParagraphsCount = getSentencesInParagraphsCount();
        String[] paragraphsSortedBySentenceCount = getParagraphsSortedBySentenceCount(sentencesInParagraphsCount);
        printStringArray(paragraphsSortedBySentenceCount);
    }

    public static String[] getParagraphsSortedBySentenceCount(int[] sentencesInParagraphsCount) {
        String[] paragraphs = getParagraphs();
        for (int startIndex = 0; startIndex < sentencesInParagraphsCount.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < sentencesInParagraphsCount.length; sortIndex++) {
                if (sentencesInParagraphsCount[minIndex] > sentencesInParagraphsCount[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapIntArray(sentencesInParagraphsCount, startIndex, minIndex);
            swapStringArray(paragraphs, startIndex, minIndex);
        }
        return paragraphs;
    }

    public static int[] getSentencesInParagraphsCount() {
        int[] sentencesInParagraphsCount = new int[getParagraphsCount()];
        String[] paragraphsArray = getParagraphs();
        for (int index = 0; index < paragraphsArray.length; index++) {
            String paragraph = paragraphsArray[index];
            sentencesInParagraphsCount[index] = getSentencesCount(paragraph);
        }
        return sentencesInParagraphsCount;
    }

    protected static int getParagraphsCount() {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(STRING);
        int counter = 1;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    private static String[] getParagraphs() {
        return STRING.split("\n");
    }

    private static int getSentencesCount(String paragraph) {
        String[] sentences = paragraph.split(END_OF_SENTENCE_REGEX);
        return sentences.length;
    }
}