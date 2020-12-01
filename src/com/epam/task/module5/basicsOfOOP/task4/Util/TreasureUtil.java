package com.epam.task.module5.basicsOfOOP.task4.Util;

import com.epam.task.module5.basicsOfOOP.task4.Cave;
import com.epam.task.module5.basicsOfOOP.task4.Treasure;
import com.epam.task.module5.basicsOfOOP.task4.TreasureType;

import java.util.Random;

public class TreasureUtil {
    public static void addRandomTreasure(Cave cave, Random random) {
        TreasureType[] treasure = TreasureType.values();
        for (int i = 0; i < 100; i++) {
            cave.getTreasureList().add(new Treasure(treasure[random.nextInt(treasure.length)], random.nextInt(10000)));
        }
    }
}