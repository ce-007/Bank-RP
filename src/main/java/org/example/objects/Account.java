package org.example.objects;

import java.util.Date;

public class Account {
    private String name;
    private double balance;
    private long creationDate;

    public Account(String name, double balance, long creationDate) {
        this.name = name;
        this.balance = balance;
        this.creationDate = creationDate;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
