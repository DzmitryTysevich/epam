package com.epam.task.module4.theSimplestClassesAndObjects.task8;

public class Customer {
    private Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private Integer numberCard;
    private Integer numberAccount;

    public Customer(String lastName, String firstName, String middleName, Integer numberCard) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.numberCard = numberCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(Integer numberCard) {
        this.numberCard = numberCard;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", numberCard=" + numberCard +
                ", numberAccount=" + numberAccount +
                '}';
    }
}