package com.codevillage.Day17;

public class Customer {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
