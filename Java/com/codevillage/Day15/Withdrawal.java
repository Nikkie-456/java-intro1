package com.codevillage.Day15;

public class Withdrawal {

    private String withDrawName;
    private double withDrawAmt;

    public String getWithDrawName() {
        return withDrawName;
    }

    public void setWithDrawName(String withDrawName) {
        this.withDrawName = withDrawName;
    }

    public double getWithDrawAmt() {
        return withDrawAmt;
    }

    public void setWithDrawAmt(double withDrawAmt) {
        this.withDrawAmt = withDrawAmt;
    }

    public Withdrawal(String withDrawName, double withDrawAmt) {
        this.withDrawName = withDrawName;
        this.withDrawAmt = withDrawAmt;
    }

    public void add() {
    }
}
