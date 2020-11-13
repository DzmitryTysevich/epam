package com.epam.task.module4.theSimplestClassesAndObjects.task9;

public class Book {
    private String id;
    private String author;
    private String publishing_house;
    private Integer publishing_year;
    private Integer amount_page;
    private Integer price;
    private String type_binding;

    public Book(String author, String publishing_house, Integer publishing_year) {
        this.author = author;
        this.publishing_house = publishing_house;
        this.publishing_year = publishing_year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public Integer getPublishing_year() {
        return publishing_year;
    }

    public void setPublishing_year(Integer publishing_year) {
        this.publishing_year = publishing_year;
    }

    public Integer getAmount_page() {
        return amount_page;
    }

    public void setAmount_page(Integer amount_page) {
        this.amount_page = amount_page;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType_binding() {
        return type_binding;
    }

    public void setType_binding(String type_binding) {
        this.type_binding = type_binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", publishing_house='" + publishing_house + '\'' +
                ", publishing_year=" + publishing_year +
                ", amount_page=" + amount_page +
                ", price=" + price +
                ", type_binding='" + type_binding + '\'' +
                '}';
    }
}