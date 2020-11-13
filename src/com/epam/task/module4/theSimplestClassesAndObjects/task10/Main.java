package com.epam.task.module4.theSimplestClassesAndObjects.task10;

import com.epam.task.Utils.InputUtil;

public class Main {
    public static void main(String[] args) {
        AirLines airLines = new AirLines();
        airLines.getAirlines();
        int sortNum = InputUtil.getInputValue("-<1> if sort By Destination\n" +
                "-<2> show by day\n" +
                "-<3> show day and time more than choice\n" +
                "Enter number: ");
        switch (sortNum) {
            case 1 -> airLines.printAirlinesSortedByDestination();
            case 2 -> airLines.printAirlinesSortedByDay();
            case 3 -> airLines.printAirlinesSortedByDay_Time();
        }
    }
}