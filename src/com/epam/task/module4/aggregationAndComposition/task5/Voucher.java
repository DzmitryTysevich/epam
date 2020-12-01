package com.epam.task.module4.aggregationAndComposition.task5;

public class Voucher {
    private Type type;
    private Transport transport;
    private Integer amountDays;
    private Food food;

    public Voucher(Type type, Transport transport, Integer amountDays, Food food) {
        this.type = type;
        this.transport = transport;
        this.amountDays = amountDays;
        this.food = food;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Integer getAmountDays() {
        return amountDays;
    }

    public void setAmountDays(Integer amountDays) {
        this.amountDays = amountDays;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "name='" + type + '\'' +
                ", transport=" + transport +
                ", amountDays=" + amountDays +
                ", food=" + food +
                '}' + '\n';
    }
}