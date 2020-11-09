package com.epam.task.module3.workingWithRegularExpressions.Task1;

import com.epam.task.Utils.PrintStringUtil;

import java.util.Arrays;

import static com.epam.task.Utils.SwapUtil.swapStringArray;
import static com.epam.task.Utils.SwapUtil.swapValueArray;
import static com.epam.task.module3.workingWithRegularExpressions.Task1.SortByAmountSentences.getLengthArrayParagraph;
import static com.epam.task.module3.workingWithRegularExpressions.Task1.SortByAmountSentences.getParagraphsArray;

public class SortByLengthWordInSentences {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(Arrays.toString(getArrayAmountWordsInParagraph()));
        PrintStringUtil.printStringArray(getSortedParagraphByAmountWords(getArrayAmountWordsInParagraph()));
    }

    public static String[] getSortedParagraphByAmountWords(int[] arrayAmountWordsInParagraphs) {
        String[] stringsArray = getParagraphsArray();
        for (int startIndex = 0; startIndex < arrayAmountWordsInParagraphs.length; startIndex++) {
            int minIndex = startIndex;
            for (int sortIndex = startIndex + 1; sortIndex < arrayAmountWordsInParagraphs.length; sortIndex++) {
                if (arrayAmountWordsInParagraphs[minIndex] > arrayAmountWordsInParagraphs[sortIndex]) {
                    minIndex = sortIndex;
                }
            }
            swapValueArray(arrayAmountWordsInParagraphs, startIndex, minIndex);
            swapStringArray(stringsArray, startIndex, minIndex);
        }
        return stringsArray;
    }

    public static int[] getArrayAmountWordsInParagraph() {
        int[] arrayAmountWordsInParagraphs = new int[getLengthArrayParagraph()];
        String[] paragraphsArray = getParagraphsArray();
        for (int i = 0; i < paragraphsArray.length; i++) {
            arrayAmountWordsInParagraphs[i] = getAmountWordInSentences(paragraphsArray, i);
        }
        return arrayAmountWordsInParagraphs;
    }

    private static int getAmountWordInSentences(String[] stringArray, int i) {
        int amountWords = 0;
        String[] string = stringArray[i].split("\\P{javaLetterOrDigit}+");
        amountWords = string.length;
        return amountWords;
    }
}