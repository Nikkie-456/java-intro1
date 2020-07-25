package com.codevillage.Day15;

public class Transaction {

    private String identity="";
    private int mobileNo=0;
    private double amt=0;

    public Transaction(String identity, int mobileNo, double amt) {
        this.identity = identity;
        this.mobileNo = mobileNo;
        this.amt = amt;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
}
