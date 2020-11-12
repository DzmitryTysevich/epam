package com.epam.task.module4.theSimplestClassesAndObjects.task1;

import static java.lang.Math.max;

public class Test1 {
    private Integer first = 2;
    private Integer second = 4;

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

    public static Integer getSumNumbers(Integer first, Integer second) {
        return first + second;
    }

    public static Integer getMaxNumbers(Integer first, Integer second) {
        return max(first, second);
    }

    public static void printResult(Integer integer) {
        System.out.printf("Result: %d\n", integer);
    }
}