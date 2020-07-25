package com.codevillage.Day15;

import java.util.ArrayList;

public class Account {

    private String accName;
    private int accNumber;
    private String accType;
    private double accBalance;
    private ArrayList<Transaction> transactions;

    public Account(String accName, int accNumber, String accType, double accBalance, ArrayList<Transaction> transactions) {
        this.accName = accName;
        this.accNumber = accNumber;
        this.accType = accType;
        this.accBalance = accBalance;
        this.transactions = transactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

}
