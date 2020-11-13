package com.epam.task.module4.aggregationAndComposition.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Sentence {
    private ArrayList<Word> sentence;

    public Sentence(Word... words) {
        this.sentence = new ArrayList<>(Arrays.asList(words));
    }

    public ArrayList<Word> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ", "", "."));
    }
}