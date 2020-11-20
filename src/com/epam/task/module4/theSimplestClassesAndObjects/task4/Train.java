package com.epam.task.module4.theSimplestClassesAndObjects.task4;

import java.sql.Time;

public class Train {
    private final String destination;
    private final Integer trainNum;
    private final Time timeDeparture;

    public Train(String destination, Integer trainNum, Time timeDeparture) {
        this.destination = destination;
        this.trainNum = trainNum;
        this.timeDeparture = timeDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getTrainNum() {
        return trainNum;
    }

    public Time getTimeDeparture() {
        return timeDeparture;
    }
}