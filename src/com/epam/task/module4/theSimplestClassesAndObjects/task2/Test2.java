package com.epam.task.module4.theSimplestClassesAndObjects.task2;

public class Test2 {
    private Integer first;
    private Integer second;

    public Test2(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Test2() {
        first = 0;
        second = 0;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
}