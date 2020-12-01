package com.epam.task.module5.basicsOfOOP.task4;

import com.epam.task.Utils.InputUtil;

import com.epam.task.module5.basicsOfOOP.task4.Util.TreasureUtil;

import java.util.Random;

import static com.epam.task.module5.basicsOfOOP.task4.Service.TreasureService.SINGLETON;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Dragon dragon = new Dragon();
        dragon.setNAME("Dragon");
        Cave cave = new Cave();
        Random random = new Random();
        TreasureUtil.addRandomTreasure(cave, random);

        int num = InputUtil.getInputValue("______________________________________\n" +
                "Welcome to " + dragon.getNAME() + " cave with treasure!\n" +
                "______________________________________\n" +
                "View treasures enter <1>\n" +
                "View max cost treasure enter <2>\n" +
                "Choice treasure by cost enter <3>\n" +
                "______________________________________\n" +
                "Enter number: ");

        switch (num) {
            case 1 -> System.out.println(cave);
            case 2 -> SINGLETON.getTreasureByEqualCost(cave.getTreasureList(), SINGLETON.getMaxCost(cave.getTreasureList()));
            case 3 -> SINGLETON.getTreasureBySum(cave.getTreasureList(), InputUtil.getInputValue("Enter sum: "));
            default -> System.out.println("Wrong input");
        }
    }
}