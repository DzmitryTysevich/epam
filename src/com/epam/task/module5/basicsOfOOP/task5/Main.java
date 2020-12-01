package com.epam.task.module5.basicsOfOOP.task5;

import com.epam.task.module5.basicsOfOOP.task5.utils.BouquetUtil;
import com.epam.task.module5.basicsOfOOP.task5.utils.GiftUtil;
import com.epam.task.module5.basicsOfOOP.task5.utils.InputUtil;

public class Main {
    public static void main(String[] args) {
        Run();
    }

    private static void Run() {
        int num = InputUtil.getInputValue("Create bouquet enter <1>\n" +
                "Create gift enter <2>\n" +
                "Enter num: ");
        switch (num) {
            case 1 -> System.out.println(BouquetUtil.createBouquet());
            case 2 -> System.out.println(GiftUtil.createGift());
            default -> System.out.println("wrong input!");
        }
    }
}