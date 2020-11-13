package com.epam.task.module4.theSimplestClassesAndObjects.task10;

import java.sql.Time;

import static com.epam.task.Utils.InputUtil.getInputString;

public class AirLines {
    private final AirLine[] AIRLINES;

    public AirLines() {
        AIRLINES = new AirLine[5];
    }

    public AirLine[] getAirlines() {
        AIRLINES[0] = new AirLine("Minsk", 101, Time.valueOf("12:00:00"), "Monday");
        AIRLINES[1] = new AirLine("Berlin", 104, Time.valueOf("18:30:00"), "Tuesday");
        AIRLINES[2] = new AirLine("Moscow", 505, Time.valueOf("16:00:00"), "Tuesday");
        AIRLINES[3] = new AirLine("Vilnius", 245, Time.valueOf("05:20:00"), "Sunday");
        AIRLINES[4] = new AirLine("Warsaw", 1001, Time.valueOf("22:40:00"), "Friday");
        return AIRLINES;
    }

    public void printAirlinesSortedByDestination() {
        String inputChoice = getInputString("Enter destination: ");
        for (AirLine airline : AIRLINES) {
            if (airline.getDestination().equalsIgnoreCase(inputChoice))
                System.out.println(airline);
        }
    }

    public void printAirlinesSortedByDay() {
        String inputChoice = getInputString("Enter day: ");
        for (AirLine airline : AIRLINES) {
            if (airline.getDay().equalsIgnoreCase(inputChoice))
                System.out.println(airline);
        }
    }

    public void printAirlinesSortedByDay_Time() {
        String dayChoice = getInputString("Enter day: ");
        String timeChoice = getInputString("Enter time 'hh:mm:ss': ");
        for (AirLine airline : AIRLINES) {
            if (airline.getDay().equalsIgnoreCase(dayChoice) && airline.getDeparture_time().after(Time.valueOf(timeChoice)))
                System.out.println(airline);
        }
    }
}