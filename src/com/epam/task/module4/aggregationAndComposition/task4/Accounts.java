package com.epam.task.module4.aggregationAndComposition.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Accounts {
    private ArrayList<Account> accounts;

    public Accounts(Account... account) {
        this.accounts = new ArrayList<>(Arrays.asList(account));
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return accounts.stream()
                .map(Account::toString)
                .collect(Collectors.joining());
    }
}