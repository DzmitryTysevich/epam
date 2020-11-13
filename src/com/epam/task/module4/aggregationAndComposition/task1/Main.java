package com.epam.task.module4.aggregationAndComposition.task1;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("John");
        Word word2 = new Word("go");
        Word word3 = new Word("to");
        Word word4 = new Word("home");
        Word word5 = new Word("Sara");
        Word word6 = new Word("go");
        Word word7 = new Word("to");
        Word word8 = new Word("school");
        Word word9 = new Word("No");
        Word word10 = new Word("John");
        Word word11 = new Word("and");

        Sentence sentence1 = new Sentence(word1, word2, word3, word4);
        Sentence sentence2 = new Sentence(word5, word6, word7, word8);
        Sentence heading = new Sentence(word1, word11, word5);

        Text text = new Text(sentence1, sentence2);
        text.addText(new Sentence(word9, word10));
        text.addHeading(heading);
        System.out.println(text);
    }
}