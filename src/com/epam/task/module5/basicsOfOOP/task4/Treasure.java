package com.epam.task.module5.basicsOfOOP.task4;

public class Treasure {
    private TreasureType treasureType;
    private Integer cost;

    public Treasure(TreasureType treasureType, Integer cost) {
        this.treasureType = treasureType;
        this.cost = cost;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(TreasureType treasureType) {
        this.treasureType = treasureType;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "{" +
                "treasureType=" + treasureType +
                ", cost=" + cost +
                '}';
    }
}