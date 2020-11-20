package com.epam.task.module4.aggregationAndComposition.task4;

import com.epam.task.Utils.InputUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Dzmitry", 100, 500);
        Account account2 = new Account("Dzmitry", 102, 800);
        Account account3 = new Account("Dzmitry", 103, 950);
        Account account4 = new Account("Dzmitry", 101, 120);
        Account account5 = new Account("Dzmitry", 105, -100);
        Account account6 = new Account("Dzmitry", 108, -200);
        account2.isBlock();

        Accounts accounts = new Accounts(account1, account2, account3, account4, account5, account6);
        System.out.println(accounts);

        printSortedByNum(accounts);
        findNumAccount(accounts);
        System.out.println(getCommonSumAccounts(accounts));
        System.out.println(getPositiveSumAccounts(accounts));
        System.out.println(getNegativeSumAccounts(accounts));
    }

    public static void printSortedByNum(Accounts accounts) {
        System.out.println(sortAccountsByNum(accounts).stream().map(Account::toString).collect(Collectors.joining()));
    }

    public static List<Account> sortAccountsByNum(Accounts accounts) {
        return accounts.getAccounts().stream()
                .sorted(Comparator.comparing(Account::getNumAccount))
                .collect(Collectors.toList());
    }

    public static Accounts findNumAccount(Accounts accounts) {
        Integer number = InputUtil.getInputValue("Enter number account: ");
        accounts.getAccounts().stream()
                .filter(account -> account.getNumAccount().equals(number))
                .forEachOrdered(System.out::println);
        return accounts;
    }

    public static String getCommonSumAccounts(Accounts accounts) {
        return "Common sum accounts: " + accounts.getAccounts()
                .stream()
                .filter(account -> !account.getBlock())
                .mapToInt(Account::getSum)
                .sum();
    }

    public static String getPositiveSumAccounts(Accounts accounts) {
        return "Positive sum accounts: " + accounts.getAccounts()
                .stream()
                .filter(account -> account.getSum() >= 0 && !account.getBlock())
                .mapToInt(Account::getSum)
                .sum();
    }

    public static String getNegativeSumAccounts(Accounts accounts) {
        return "Negative sum accounts: " + accounts.getAccounts()
                .stream()
                .filter(account -> account.getSum() < 0 && !account.getBlock())
                .mapToInt(Account::getSum)
                .sum();
    }
}