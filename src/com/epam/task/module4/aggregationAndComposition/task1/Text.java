package com.epam.task.module4.aggregationAndComposition.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Text {
    private ArrayList<Sentence> sentences;

    public Text(Sentence... sentences) {
        this.sentences = new ArrayList<>(Arrays.asList(sentences));
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void addText(Sentence sentence) {
        sentences.add(sentence);
    }

    public void addHeading(Sentence sentence) {
        sentences.add(0, sentence);
    }

    @Override
    public String toString() {
        return sentences.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(" ", "", ""));
    }
}