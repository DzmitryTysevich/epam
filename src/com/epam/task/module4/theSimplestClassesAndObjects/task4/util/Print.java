package com.epam.task.module4.theSimplestClassesAndObjects.task4.util;

import java.sql.Time;

public class Print {
    public static void printTrains(String destination, Integer trainNum, Time timeDeparture) {
        System.out.printf("Destination: %s Train number: %d timeDeparture: %s ", destination, trainNum, timeDeparture);
        System.out.println();
    }

    public static void printOneTrain(String destination, Integer trainNum, Time timeDeparture, int number) {
        if (trainNum == number) {
            System.out.printf("Destination: %s Train number: %d timeDeparture: %s ", destination, trainNum, timeDeparture);
            System.out.println();
        }
    }
}