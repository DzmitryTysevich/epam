package com.epam.task.module4.theSimplestClassesAndObjects.task7;

import static java.lang.Math.sqrt;

public class Triangle {
    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    public Double getSideC() {
        return sideC;
    }

    public void setSideC(Double sideC) {
        this.sideC = sideC;
    }

    public Double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public Double getSquare() {
        Double halfPerimeter = (getPerimeter()) / 2;
        return sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}