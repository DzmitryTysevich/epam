package com.epam.task.module4.theSimplestClassesAndObjects.task1.service;

import static java.lang.Math.max;

public class Service {
    public static Integer getSumNumbers(Integer first, Integer second) {
        return first + second;
    }

    public static Integer getMaxNumbers(Integer first, Integer second) {
        return max(first, second);
    }
}