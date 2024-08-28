package org.example.objects;

public class TypeOfAccount {
    private String type;
    private double interest;
    private long endDate;
    private double creditLimit;

    public TypeOfAccount(){

    }

    public void setChecking(double interest){
        this.type = "checking";
        this.interest = interest;
    }
    public void setSavings(double interest, long endDate){
        this.type = "savings";
        this.interest = interest;
        this.endDate = endDate;
    }
    public void setCredit(double interest, double creditLimit){
        this.type = "credit";
        this.interest = interest;
        this.creditLimit = creditLimit;
    }
}
