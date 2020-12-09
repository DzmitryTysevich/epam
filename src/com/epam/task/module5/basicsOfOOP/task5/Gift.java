package com.epam.task.module5.basicsOfOOP.task5;

import com.epam.task.module5.basicsOfOOP.task5.types.ProductPackagingType;
import com.epam.task.module5.basicsOfOOP.task5.types.SweetnessType;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Gift {
    private final List<SweetnessType> sweetnessTypeList;
    private final ProductPackagingType productPackagingType;

    public Gift(List<SweetnessType> sweetnessTypeList, ProductPackagingType productPackagingType) {
        this.sweetnessTypeList = sweetnessTypeList;
        this.productPackagingType = productPackagingType;
    }

    public List<SweetnessType> getSweetnessTypeList() {
        return sweetnessTypeList;
    }

    public ProductPackagingType getProductPackagingType() {
        return productPackagingType;
    }

    @Override
    public String toString() {
        return "_______________________________________________________\n" +
                "\t\tGift\n" +
                "_______________________________________________________\n" +
                "ProductPackagingType=" + productPackagingType + "\n" +
                "sweetnessType=" + sweetnessTypeList.stream()
                .map(SweetnessType::toString)
                .collect(Collectors.joining(", ")) +
                "\n_______________________________________________________";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(sweetnessTypeList, gift.sweetnessTypeList) && productPackagingType == gift.productPackagingType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetnessTypeList, productPackagingType);
    }
}