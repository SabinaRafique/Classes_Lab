package org.example.classes;

public class Account {
    private String id;
    private String name;
    private int balance;

    //Below is the constructor
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance; //defining instance variable
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
