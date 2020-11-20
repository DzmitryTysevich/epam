package com.epam.task.module4.aggregationAndComposition.task3;

public class Main {
    public static void main(String[] args) {
        City brest = new City("Brest", 200);
        City grodno = new City("Grodno", 195);
        City vitebsk = new City("Vitebsk", 240);
        City mogilev = new City("Mogilev", 320);
        City gomel = new City("Gomel", 340);
        City minsk = new City("Minsk", 950);
        minsk.setCapital(true);

        District brestsky = new District("Brestsky", brest);
        District grodnensky = new District("Grodnensky", grodno);
        District vitebsky = new District("Vitebsky", vitebsk);
        District mogilevsky = new District("Mogilevsky", mogilev);
        District gomelsky = new District("Gomelsky", gomel);
        District minsky = new District("Minsky", minsk);

        Region brestskaya = new Region("Brestskaya", brestsky);
        Region grodnenskaya = new Region("Grodnenskaya", grodnensky);
        Region vitebskaya = new Region("Vitebskaya", vitebsky);
        Region mogilevskaya = new Region("Mogilevskaya", mogilevsky);
        Region gomelskaya = new Region("Gomelskaya", gomelsky);
        Region minskaya = new Region("Minskaya", minsky);

        State belarus = new State("Belarus", brestskaya, grodnenskaya, vitebskaya, mogilevskaya, gomelskaya, minskaya);
        System.out.println(belarus);
        belarus.printRegionCount();
        printCapital(belarus);
        printSquare(belarus);
        printCity(belarus);
    }

    public static void printCity(State state) {
        state.getRegions()
                .forEach(region -> region.getDistricts()
                        .forEach(district -> district.getCities()
                                .stream().map(City::getName).map(name -> "city: " + name)
                                .forEach(System.out::println)));
    }

    public static void printSquare(State state) {
        state.getRegions()
                .forEach(region -> region.getDistricts()
                        .forEach(district -> district.getCities()
                                .stream().map(City::getSquare).map(name -> "square city: " + name)
                                .forEach(System.out::println)));
    }

    public static void printCapital(State state) {
        state.getRegions()
                .forEach(region -> region.getDistricts()
                        .forEach(district ->
                                district.getCities().stream().filter(City::isCapital)
                                        .map(City::getName).map(name -> "The capital is " + name)
                                        .forEach(System.out::println)));
    }
}