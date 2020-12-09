package com.epam.task.module5.basicsOfOOP.task5;

import com.epam.task.module5.basicsOfOOP.task5.types.FlowerType;

import java.util.Objects;

public class Flower {
    private final FlowerType flowerType;
    private final Integer amount_flowers;

    public Flower(FlowerType flowerType, Integer amount_flowers) {
        this.flowerType = flowerType;
        this.amount_flowers = amount_flowers;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public Integer getAmount_flowers() {
        return amount_flowers;
    }

    @Override
    public String toString() {
        return "flowerType=" + flowerType +
                ", flowerColor=" + flowerType.getColor() +
                ", amount_flowers=" + amount_flowers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return flowerType == flower.flowerType && Objects.equals(amount_flowers, flower.amount_flowers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerType, amount_flowers);
    }
}