package com.epam.task.module4.theSimplestClassesAndObjects.task4.comparator;

import com.epam.task.module4.theSimplestClassesAndObjects.task4.Train;

public class NumberComparator implements java.util.Comparator<Train> {

    @Override
    public int compare(Train left, Train right) {
        return left.getTrainNum() - right.getTrainNum();
    }
}