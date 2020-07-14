package com.codevillage.Day11.Task1;

public class Vehicle {
    protected String color;
    protected String regNo;
    protected String name;

    public void canBreak(){
        System.out.println("This car break");
    }

    public void canStop(){
        System.out.println("This car can stop");
    }

    public void canAccelerate(){
        System.out.println("This Car can accelerate");
    }
}
