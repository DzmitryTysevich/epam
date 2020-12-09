package com.epam.task.module5.basicsOfOOP.task4;

public class Dragon {
    private String NAME;

    public Dragon() {
        this.NAME = null;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}