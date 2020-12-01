package com.epam.task.module5.basicsOfOOP.task4.Service;

import com.epam.task.module5.basicsOfOOP.task4.Treasure;

import java.util.List;

public class TreasureService {
    public static final TreasureService SINGLETON = new TreasureService();

    private TreasureService() {}

    public Integer getMaxCost(List<Treasure> treasureList) {
        return treasureList.stream()
                .map(Treasure::getCost)
                .max(Integer::compareTo)
                .get();
    }

    public void getTreasureByEqualCost(List<Treasure> treasureList, Integer cost) {
        treasureList.stream()
                .filter(treasure -> treasure.getCost().equals(cost))
                .forEach(System.out::println);
    }

    public void getTreasureBySum(List<Treasure> treasureList, Integer cost) {
        int sum = treasureList.get(0).getCost();
        for (Treasure treasure : treasureList) {
            if (sum <= cost && treasure.getCost() < cost) {
                sum += treasure.getCost();
                System.out.println(treasure);
            }
        }
    }
}