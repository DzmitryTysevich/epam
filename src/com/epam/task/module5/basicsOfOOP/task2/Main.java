package com.epam.task.module5.basicsOfOOP.task2;

public class Main {
    public static void main(String[] args) {
        Payment.Product milk = new Payment.Product("Milk", 2,2);
        Payment.Product bread = new Payment.Product("Bread", 1,1);
        Payment.Product eggs = new Payment.Product("Eggs", 2,3);

        Payment grocery_basket = new Payment("First payment", milk, bread, eggs);
        System.out.println(grocery_basket);
    }
}