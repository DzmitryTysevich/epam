package com.epam.task.module4.aggregationAndComposition.task2;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(205, 55, 16);
        Wheel wheel2 = new Wheel(235, 40, 18);
        Engine engine = new Engine("diesel");

        Car car = new Car("BMW", engine, wheel, 10);
        car.refuel(10);
        car.changeWheel(wheel2);
        System.out.println(car);
        car.showMarkCar();
        car.getDrive("drive");
        System.out.println(car);
    }
}