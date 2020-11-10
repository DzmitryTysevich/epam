package com.epam.task.module3.workingWithRegularExpressions.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.Utils.PrintStringUtil.printStringArray;
import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapValueArray;
import static com.epam.task.module3.workingWithRegularExpressions.Task1.Main.STRING;

public class SortByAmountSentencesInParagraph {
    final static String ENDOFSENTENCE = "[!?.]";

    public static void run() {
        printStringArray(getSortedParagraphByAmountSentences(getArrayAmountSentencesInParagraphs()));
    }

    public static String[] getSortedParagraphByAmountSentences(int[] arrayAmountSentencesInParagraphs) {
        String[] stringsArray = getParagraphsArray();
        for (int startIndex = 0; startIndex < arrayAmountSentencesInParagraphs.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < arrayAmountSentencesInParagraphs.length; sortIndex++) {
                if (arrayAmountSentencesInParagraphs[minIndex] > arrayAmountSentencesInParagraphs[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapValueArray(arrayAmountSentencesInParagraphs, startIndex, minIndex);
            swapStringArray(stringsArray, startIndex, minIndex);
        }
        return stringsArray;
    }

    public static int[] getArrayAmountSentencesInParagraphs() {
        int[] arrayAmountSentencesInParagraphs = new int[getLengthArrayParagraph()];
        String[] paragraphsArray = getParagraphsArray();
        for (int index = 0; index < paragraphsArray.length; index++) {
            arrayAmountSentencesInParagraphs[index] = getAmountSentencesInParagraph(paragraphsArray, index);
        }
        return arrayAmountSentencesInParagraphs;
    }

    protected static int getLengthArrayParagraph() {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(STRING);
        int counter = 1;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    private static String[] getParagraphsArray() {
        return STRING.split("\n");
    }

    private static int getAmountSentencesInParagraph(String[] stringArray, int i) {
        int amountSentences = 0;
        String[] string = stringArray[i].split(ENDOFSENTENCE);
        amountSentences = string.length;
        return amountSentences;
    }
}