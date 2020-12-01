package com.epam.task.module5.basicsOfOOP.task5.utils;

import com.epam.task.module5.basicsOfOOP.task5.types.SweetnessType;

import java.util.ArrayList;
import java.util.List;

import static com.epam.task.module5.basicsOfOOP.task5.service.TypeService.SINGLETON;
import static com.epam.task.module5.basicsOfOOP.task5.utils.InputUtil.getInputString;

public class SweetnessUtil {
    public static List<SweetnessType> createSweetness() {
        List<SweetnessType> sweetness = new ArrayList<>();
        String sweetnessString = SINGLETON.getCollectSweetness();
        int i = 0;
        while ("Y".equals(getInputString("Add sweetness <y> or <n>: "))) {
            sweetness.add(SweetnessType.valueOf(getInputString(sweetnessString + "\n" + "Enter sweetness type: ")));
            i++;
        }
        return sweetness;
    }
}