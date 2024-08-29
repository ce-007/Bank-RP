package org.example.objects;

public class Account {
    private String name;
    private double balance;
    private long creationDate;
    private TypeOfAccount typeOfAccount;

    public Account(String name, double balance, long creationDate) {
        this.name = name;
        this.balance = balance;
        this.creationDate = creationDate;
        this.typeOfAccount = new TypeOfAccount();
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
    public void setChecking(double interest){
        this.typeOfAccount.setChecking(interest);
    }
    public void setSavings(double interest, long endDate){
        this.typeOfAccount.setSavings(interest, endDate);
    }
    public void setCredit(double interest, double creditLimit){
        this.typeOfAccount.setCredit(interest, creditLimit);
    }
}
