package com.epam.task.module4.aggregationAndComposition.task3;

public class City {
    private Integer square;
    private String name;
    private boolean capital;

    public City(String name, Integer square) {
        this.square = square;
        this.name = name;
        this.capital = false;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", square='" + square + '\'' +
                ", capital=" + capital;
    }
}