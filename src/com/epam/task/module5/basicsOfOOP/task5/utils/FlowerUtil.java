package com.epam.task.module5.basicsOfOOP.task5.utils;

import com.epam.task.module5.basicsOfOOP.task5.Flower;
import com.epam.task.module5.basicsOfOOP.task5.types.FlowerType;

import java.util.ArrayList;
import java.util.List;

import static com.epam.task.module5.basicsOfOOP.task5.service.TypeService.SINGLETON;
import static com.epam.task.module5.basicsOfOOP.task5.utils.InputUtil.getInputString;
import static com.epam.task.module5.basicsOfOOP.task5.utils.InputUtil.getInputValue;

public class FlowerUtil {
    public static List<Flower> createFlowers() {
        List<Flower> flowers = new ArrayList<>();
        String flowersString = SINGLETON.getCollectFlowers();
        int i = 0;
        while ("Y".equals(getInputString("Add flowers <y> or <n>: "))) {
            flowers.add(new Flower(FlowerType.valueOf(getInputString(flowersString + "\n" + "Enter flower type: ")),
                    getInputValue("Enter amount flowers: ")));
            i++;
        }
        return flowers;
    }
}