package com.epam.task.module4.aggregationAndComposition.task2;

public class Wheel {
    private Integer width;
    private Integer height;
    private Integer diameter;

    public Wheel(Integer width, Integer height, Integer diameter) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "{" +
                "width=" + width +
                ", height=" + height +
                ", diameter=" + diameter +
                '}';
    }
}