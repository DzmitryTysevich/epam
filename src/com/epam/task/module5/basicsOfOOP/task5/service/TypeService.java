package com.epam.task.module5.basicsOfOOP.task5.service;

import com.epam.task.module5.basicsOfOOP.task5.types.ColorType;
import com.epam.task.module5.basicsOfOOP.task5.types.FlowerType;
import com.epam.task.module5.basicsOfOOP.task5.types.ProductPackagingType;
import com.epam.task.module5.basicsOfOOP.task5.types.SweetnessType;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class TypeService {
    public static final TypeService SINGLETON = new TypeService();

    private TypeService() {
    }

    public String getCollectProductPackaging() {
        return Arrays.stream(ProductPackagingType.values())
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    public String getCollectColors() {
        return Arrays.stream(ColorType.values())
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    public String getCollectFlowers() {
        return Arrays.stream(FlowerType.values())
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }

    public String getCollectSweetness() {
        return Arrays.stream(SweetnessType.values())
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }
}