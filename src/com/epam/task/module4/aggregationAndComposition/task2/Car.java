package com.epam.task.module4.aggregationAndComposition.task2;

import com.epam.task.Utils.InputUtil;

public class Car {
    private String carMark;
    private Engine engine;
    private Wheel wheel;
    private Integer fuel;
    private String drive;

    public Car(String carMark, Engine engine, Wheel wheel, Integer fuel) {
        this.carMark = carMark;
        this.engine = engine;
        this.wheel = wheel;
        this.fuel = fuel;
        this.drive = "no drive";
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer refuel(Integer integer) {
        return fuel = fuel + integer;
    }

    public Wheel changeWheel(Wheel wheel) {
        return this.wheel = wheel;
    }

    public void getDrive(String message) {
        message = InputUtil.getInputString("If you want the car to move, enter the key 'Drive'\n" +
                "Enter key: ");
        if (message.equalsIgnoreCase("drive")) {
            this.drive = message;
            System.out.println("the " + carMark + " is driving");
        } else {
            System.out.println("the car is not driving");
        }
    }

    public void showMarkCar() {
        System.out.println("Mark: " + carMark);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMark='" + carMark + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", fuel=" + fuel +
                ", drive=" + drive +
                '}';
    }
}