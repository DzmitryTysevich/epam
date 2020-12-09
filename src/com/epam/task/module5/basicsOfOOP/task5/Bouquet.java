package com.epam.task.module5.basicsOfOOP.task5;

import com.epam.task.module5.basicsOfOOP.task5.types.ColorType;
import com.epam.task.module5.basicsOfOOP.task5.types.ProductPackagingType;

import java.util.List;
import java.util.stream.Collectors;

public class Bouquet {
    private final List<Flower> listFlowers;
    private final ProductPackagingType productPackagingType;
    private final ColorType colorType;

    public Bouquet(ProductPackagingType productPackagingType, ColorType colorType, List<Flower> listFlowers) {
        this.listFlowers = listFlowers;
        this.productPackagingType = productPackagingType;
        this.colorType = colorType;
    }

    public List<Flower> getListFlowers() {
        return listFlowers;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public ProductPackagingType getProductPackagingType() {
        return productPackagingType;
    }

    @Override
    public String toString() {
        return "_______________________________________________________\n" +
                "\t\tBouquet\n" +
                "_______________________________________________________\n" +
                "ProductPackagingType={" + productPackagingType + ", Color=" + colorType + "}" + "\n" +
                listFlowers.stream()
                        .map(Flower::toString)
                        .collect(Collectors.joining("\n")) +
                "\n_______________________________________________________";
    }
}