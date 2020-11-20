package com.epam.task.module4.theSimplestClassesAndObjects.task3;

import java.util.Random;

public class Student {
    private final String name;
    private final Integer groupNumber;
    private final Integer[] grades;

    public Student(String name, Integer groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.grades = new Integer[5];
    }

    Integer[] addGrade() {
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(3) + 8;
        }
        return grades;
    }

    boolean isGoodStudent() {
        for (Integer grade : grades) {
            if (grade != 9 && grade != 10)
                return false;
        }
        return true;
    }

    void print() {
        System.out.printf("%s group: %d grade: ", name, groupNumber);
        for (Integer grade : grades) {
            System.out.printf("%d ", grade);
        }
        System.out.println();
    }
}