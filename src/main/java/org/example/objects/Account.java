package org.example.objects;

import java.lang.reflect.Type;
import java.util.Date;

public class Account {
    private String name;
    private double balance;
    private long creationDate;
    private TypeOfAccount typeOfAccount;

    public Account(String name, double balance, long creationDate, String accountType) {
        this.name = name;
        this.balance = balance;
        this.creationDate = creationDate;
        this.typeOfAccount = setAccountType(accountType);
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

    public TypeOfAccount getTypeOfAccount(){
        return typeOfAccount;
    }

    private TypeOfAccount setAccountType(String accountType){
        //todo implement this
    }
}
