package com.epam.task.module4.aggregationAndComposition.task2;

public class Engine {
    private String typeEngine;

    public Engine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public String toString() {
        return typeEngine;
    }
}