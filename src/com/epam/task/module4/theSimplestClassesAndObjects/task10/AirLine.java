package com.epam.task.module4.theSimplestClassesAndObjects.task10;

import java.sql.Time;

public class AirLine {
    private String destination;
    private Integer flight_number;
    private String aircraft_type;
    private Time departure_time;
    private String day;

    public AirLine(String destination, Integer flight_number, Time departure_time, String day) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.aircraft_type = "Boeing 747";
        this.departure_time = departure_time;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public String getAircraft_type() {
        return aircraft_type;
    }

    public void setAircraft_type(String aircraft_type) {
        this.aircraft_type = aircraft_type;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Time departure_time) {
        this.departure_time = departure_time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", aircraft_type='" + aircraft_type + '\'' +
                ", departure_time=" + departure_time +
                ", day='" + day + '\'' +
                '}';
    }
}