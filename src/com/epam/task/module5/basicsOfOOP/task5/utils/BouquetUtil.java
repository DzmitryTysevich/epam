package com.epam.task.module5.basicsOfOOP.task5.utils;

import com.epam.task.module5.basicsOfOOP.task5.Bouquet;
import com.epam.task.module5.basicsOfOOP.task5.types.ColorType;

import static com.epam.task.module5.basicsOfOOP.task5.service.TypeService.SINGLETON;
import static com.epam.task.module5.basicsOfOOP.task5.types.ProductPackagingType.valueOf;
import static com.epam.task.module5.basicsOfOOP.task5.utils.FlowerUtil.createFlowers;
import static com.epam.task.module5.basicsOfOOP.task5.utils.InputUtil.getInputString;

public class BouquetUtil {
    public static Bouquet createBouquet() {
        String productPackagingString = SINGLETON.getCollectProductPackaging();
        String colorsString = SINGLETON.getCollectColors();
        return new Bouquet(valueOf(getInputString(productPackagingString + "\n" + "Input product packaging type: ")),
                ColorType.valueOf(getInputString(colorsString + "\n" + "Input color type: ")),
                createFlowers());
    }
}