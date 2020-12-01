package com.epam.task.module4.aggregationAndComposition.task5;


public class Main {
    public static void main(String[] args) {
        Voucher relax = new Voucher(Type.Relax, Transport.Airplane, 10, Food.All_Include);
        Voucher excursion = new Voucher(Type.Excursion, Transport.Auto, 7, Food.Lunch);
        Voucher cruise2 = new Voucher(Type.Cruise, Transport.Auto, 7, Food.Lunch);
        Voucher therapy = new Voucher(Type.Therapy, Transport.Bus, 10, Food.Breakfast);
        Voucher shopping = new Voucher(Type.Shopping, Transport.Auto, 2, Food.Dinner);
        Voucher cruise = new Voucher(Type.Cruise, Transport.Ship, 20, Food.All_Include);

        Vouchers vouchers = new Vouchers(relax, excursion, therapy, shopping, cruise, cruise2);
        System.out.println(vouchers);

        printByTransport(vouchers, Transport.Ship);
        printByDays(vouchers, 2);
        printByFood(vouchers, Food.Dinner);
        printByType(vouchers, Type.Excursion);
        printByAll(vouchers, Transport.Auto, 7, Food.Lunch);
        System.out.println();
        getVouchersSorted(vouchers);
    }

    public static Vouchers printByTransport(Vouchers vouchers, Transport transport) {
        vouchers.getVouchers()
                .stream()
                .filter(voucher -> voucher.getTransport().equals(transport))
                .forEach(System.out::print);
        return vouchers;
    }

    public static Vouchers printByDays(Vouchers vouchers, Integer days) {
        vouchers.getVouchers()
                .stream()
                .filter(voucher -> voucher.getAmountDays().equals(days))
                .forEach(System.out::print);
        return vouchers;
    }

    public static Vouchers printByFood(Vouchers vouchers, Food food) {
        vouchers.getVouchers()
                .stream()
                .filter(voucher -> voucher.getFood().equals(food))
                .forEach(System.out::print);
        return vouchers;
    }

    public static Vouchers printByType(Vouchers vouchers, Type type) {
        vouchers.getVouchers()
                .stream()
                .filter(voucher -> voucher.getType().equals(type))
                .forEach(System.out::print);
        return vouchers;
    }

    public static Vouchers printByAll(Vouchers vouchers, Transport transport, Integer days, Food food) {
        vouchers.getVouchers()
                .stream()
                .filter(voucher -> voucher.getTransport().equals(transport))
                .filter(voucher -> voucher.getAmountDays().equals(days))
                .filter(voucher -> voucher.getFood().equals(food))
                .forEach(System.out::print);
        return vouchers;
    }

    public static Vouchers getVouchersSorted(Vouchers vouchers) {
        vouchers.getVouchers()
                .stream()
                .sorted((o1, o2) -> o2.getType().compareTo(o1.getType()))
                .forEachOrdered(System.out::print);
        return vouchers;
    }
}