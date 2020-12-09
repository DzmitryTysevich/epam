package com.epam.task.module5.basicsOfOOP.task5.utils;

import com.epam.task.module5.basicsOfOOP.task5.Gift;

import static com.epam.task.module5.basicsOfOOP.task5.service.TypeService.SINGLETON;
import static com.epam.task.module5.basicsOfOOP.task5.types.ProductPackagingType.valueOf;
import static com.epam.task.module5.basicsOfOOP.task5.utils.InputUtil.getInputString;
import static com.epam.task.module5.basicsOfOOP.task5.utils.SweetnessUtil.createSweetness;

public class GiftUtil {
    public static Gift createGift() {
        String productPackagingString = SINGLETON.getCollectProductPackaging();
        return new Gift(createSweetness(), valueOf(getInputString(productPackagingString + "\n" + "Input product packaging type: ")));
    }
}