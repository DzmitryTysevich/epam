package com.epam.task.module4.theSimplestClassesAndObjects.task4;

import com.epam.task.Utils.InputUtil;
import com.epam.task.module4.theSimplestClassesAndObjects.task4.comparator.DestinationAndTimeComparator;
import com.epam.task.module4.theSimplestClassesAndObjects.task4.comparator.NumberComparator;

import java.sql.Time;
import java.util.Arrays;

import static com.epam.task.module4.theSimplestClassesAndObjects.task4.util.Print.printOneTrain;
import static com.epam.task.module4.theSimplestClassesAndObjects.task4.util.Print.printTrains;

public class Trains {
    public Train[] getTrains() {
        int nTrain = 5;
        Train[] allTrains = new Train[nTrain];
        allTrains[0] = new Train("Grodno", 103, Time.valueOf("06:00:20"));
        allTrains[1] = new Train("Minsk", 102, Time.valueOf("10:00:35"));
        allTrains[2] = new Train("Vitebsk", 104, Time.valueOf("08:00:45"));
        allTrains[3] = new Train("Mohilew", 101, Time.valueOf("05:00:54"));
        allTrains[4] = new Train("Minsk", 105, Time.valueOf("07:00:00"));
        return allTrains;
    }

    public Train[] getTrain(Train[] trains) {
        int number = InputUtil.getInputValue("Enter train number: ");
        for (Train train : trains) {
            printOneTrain(train.getDestination(), train.getTrainNum(), train.getTimeDeparture(), number);
        }
        return trains;
    }

    public Train[] getTrainsSorted(Train[] trains) {
        int inputInt = InputUtil.getInputValue("- <1> if sort by destination\n" +
                "- <2> if sort by train number\n" +
                "Enter number: ");
        switch (inputInt) {
            case 1 -> {
                Arrays.sort(trains, new DestinationAndTimeComparator());
                for (Train train : trains) {
                    printTrains(train.getDestination(), train.getTrainNum(), train.getTimeDeparture());
                }
            }
            case 2 -> {
                Arrays.sort(trains, new NumberComparator());
                for (Train train : trains) {
                    printTrains(train.getDestination(), train.getTrainNum(), train.getTimeDeparture());
                }
            }
        }
        return trains;
    }
}