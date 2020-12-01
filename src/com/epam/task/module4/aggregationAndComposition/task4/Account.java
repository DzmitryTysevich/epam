package com.epam.task.module4.aggregationAndComposition.task4;

public class Account {
    private String clientName;
    private Integer numAccount;
    private Integer sum;
    private boolean block;

    public Account(String clientName, Integer numAccount, Integer sum) {
        this.clientName = clientName;
        this.numAccount = numAccount;
        this.sum = sum;
        this.block = false;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(Integer numAccount) {
        this.numAccount = numAccount;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public boolean isBlock() {
        return block = true;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "Account{" +
                "clientName='" + clientName + '\'' +
                ", numAccount=" + numAccount +
                ", sum=" + sum +
                ", block=" + block +
                '}' + '\n';
    }
}