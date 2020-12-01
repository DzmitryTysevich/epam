package com.epam.task.module4.aggregationAndComposition.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Region {
    private String name;
    private ArrayList<District> districts;

    public Region(String name, District... districts) {
        this.name = name;
        this.districts = new ArrayList<>(Arrays.asList(districts));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "\n\tRegion: " +
                "name='" + name + '\'' +
                districts;
    }
}