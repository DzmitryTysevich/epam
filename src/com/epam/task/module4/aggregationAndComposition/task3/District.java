package com.epam.task.module4.aggregationAndComposition.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class District {
    private String name;
    private ArrayList<City> cities;

    public District(String name, City... cities) {
        this.name = name;
        this.cities = new ArrayList<>(Arrays.asList(cities));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "District: " + name +
                ", cities=" + cities;
    }
}