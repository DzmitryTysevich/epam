package com.epam.task.module5.basicsOfOOP.task5.types;

public enum FlowerType {
    ROZE_WHITE("white"),
    ROZE_RED("red"),
    PEONY("red"),
    ANEMONE("white"),
    LILAC("violet"),
    ORCHID("white"),
    DAHLIA("red"),
    SWEET_PEA("white"),
    TULIP("red"),
    HYDRANGEA("blue"),
    RANUNCULUS("orange");

    private final String color;

    FlowerType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}