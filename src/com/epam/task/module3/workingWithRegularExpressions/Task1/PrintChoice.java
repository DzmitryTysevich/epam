package com.epam.task.module3.workingWithRegularExpressions.Task1;

import com.epam.task.Utils.InputUtil;

public class PrintChoice {
    public static void getNumber() {
        switch (InputUtil.getInputValue("Enter <1> if sort text by amount sentences\n" +
                "Enter <2> if sort text by length words in sentences\n" +
                "Enter <3> if sort text by lexeme\n" +
                "Enter number: ")) {
            case 1 -> SortByAmountSentencesInParagraph.run();
            case 2 -> SortByLengthWordInSentences.run();
            case 3 -> SortByLexeme.run();
        }
    }
}