package com.epam.task.module4.aggregationAndComposition.task1;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}