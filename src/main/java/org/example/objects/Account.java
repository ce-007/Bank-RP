package org.example.objects;

import java.util.Date;

public class Account {
    private String name;
    private int balance;
    private Date creationDate;
    private String owner;

    public Account (String name, int balance, Date creationDate, String owner){
        this.name = name;
        this.balance = balance;
        this.creationDate = creationDate;
        this.owner = owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getOwner() {
        return owner;
    }
}
