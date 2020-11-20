package com.epam.task.module4.theSimplestClassesAndObjects.task4.comparator;

import com.epam.task.module4.theSimplestClassesAndObjects.task4.Train;

public class DestinationAndTimeComparator implements java.util.Comparator<Train> {

    @Override
    public int compare(Train left, Train right) {
        if (left.getDestination().equals(right.getDestination()))
            return left.getTimeDeparture().compareTo(right.getTimeDeparture());
        return left.getDestination().compareTo(right.getDestination());
    }
}