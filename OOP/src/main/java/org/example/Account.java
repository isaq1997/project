package org.example;

import java.util.ArrayList;

public class Account {
    private int id;
    private String fullname;
    private ArrayList<Book> book;
    Pricing pricing;

    public Account(int id, String fullname, ArrayList<Book> book, Pricing pricing) {
        this.id = id;
        this.fullname = fullname;
        this.book = book;
        this.pricing = pricing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }
}
