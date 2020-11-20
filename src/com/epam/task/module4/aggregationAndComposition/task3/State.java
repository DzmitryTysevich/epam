package com.epam.task.module4.aggregationAndComposition.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class State {
    private String name;
    private ArrayList<Region> regions;

    public State(String name, Region... regions) {
        this.name = name;
        this.regions = new ArrayList<>(Arrays.asList(regions));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public void printRegionCount() {
        System.out.println("Amount region: " + regions.size());
    }

    @Override
    public String toString() {
        return "State " +
                "name='" + name + '\'' +
                ", regions:" + regions;
    }
}