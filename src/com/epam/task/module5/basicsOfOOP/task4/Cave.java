package com.epam.task.module5.basicsOfOOP.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cave {
    private List<Treasure> treasureList;

    public Cave() {
        this.treasureList = new ArrayList<>();
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    @Override
    public String toString() {
        return treasureList.stream()
                .map(Treasure::toString)
                .collect(Collectors.joining("\n"));
    }
}