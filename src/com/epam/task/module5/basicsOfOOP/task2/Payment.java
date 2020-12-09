package com.epam.task.module5.basicsOfOOP.task2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Payment {
    private final String payment_name;
    private final Product[] products;
    private final Integer cost;

    public Payment(String payment_name, Product... products) {
        this.payment_name = payment_name;
        this.products = products;
        this.cost = getCommonCost();
    }

    public String getPayment_name() {
        return payment_name;
    }

    public Product[] getProducts() {
        return products;
    }

    public Integer getCost() {
        return cost;
    }

    public static class Product {
        private String product_name;
        private Integer product_cost;
        private final Integer product_amount;

        public Product(String product_name, Integer product_cost, Integer product_amount) {
            this.product_name = product_name;
            this.product_cost = product_cost;
            this.product_amount = product_amount;
        }

        public Integer getProduct_amount() {
            return product_amount;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public Integer getProduct_cost() {
            return product_cost;
        }

        public void setProduct_cost(Integer product_cost) {
            this.product_cost = product_cost;
        }

        @Override
        public String toString() {
            return product_name + '(' + product_amount + ')' + "-" + product_cost + '$';
        }
    }

    private Integer getCommonCost() {
        return Arrays.stream(products)
                .map(product -> product.getProduct_cost() * product.getProduct_amount())
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Override
    public String toString() {
        return "_________________________\n" +
                "\t" + payment_name + '\n' +
                "_________________________\n" +
                Arrays.stream(products)
                        .map(Product::toString)
                        .collect(Collectors.joining("\n", "", "")) +
                "\n_______________________\n" +
                "\tcommon cost = " + cost + "$" +
                "\n_______________________\n";
    }
}