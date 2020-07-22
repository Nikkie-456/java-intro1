package com.codevillage.Day15;

import java.util.ArrayList;

public class Account {

    private String accName;
    private int accNumber;
    private String accType;
    private double accBalance;

    public Account(String accName, int accNumber, String accType, double accBalance) {
        this.accName = accName;
        this.accNumber = accNumber;
        this.accType = accType;
        this.accBalance = accBalance;
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
