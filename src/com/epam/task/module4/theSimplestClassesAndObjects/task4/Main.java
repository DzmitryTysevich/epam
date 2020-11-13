package com.epam.task.module4.theSimplestClassesAndObjects.task4;

public class Main {
    public static void main(String[] args) {
        Trains trains = new Trains();
        Train[] allTrain = trains.getTrains();
        trains.getTrainsSorted(allTrain);
        trains.getTrain(allTrain);

    }
}