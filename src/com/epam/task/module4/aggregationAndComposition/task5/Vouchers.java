package com.epam.task.module4.aggregationAndComposition.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Vouchers {
    private ArrayList<Voucher> vouchers;

    public Vouchers(Voucher... voucher) {
        this.vouchers = new ArrayList<>(Arrays.asList(voucher));
    }

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public String toString() {
        return vouchers.stream()
                .map(Voucher::toString)
                .collect(Collectors.joining());
    }
}