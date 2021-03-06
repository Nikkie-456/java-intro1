package com.codevillage.Day15;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int idNo;

    private String address;
    private String phoneNo;
    private ArrayList<Account> accounts;

    int pinNo=1977;

   /* public Customer(String name, int idNo, String address, String phoneNo) {
        this.name = name;
        this.idNo = idNo;
        this.address = address;
        this.phoneNo = phoneNo;
    }*/

   public Customer(String name, int idNo, String address, String phoneNo, ArrayList<Account> accounts) {
        this.name = name;
        this.idNo = idNo;
        this.address = address;
        this.phoneNo = phoneNo;
        this.accounts = accounts;
    }


    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void add() {
    }
}
