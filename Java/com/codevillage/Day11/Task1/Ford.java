package com.codevillage.Day11.Task1;

public class Ford extends Vehicle{

    private String fwd="";

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name=name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void  setregNo(String regNo){
        this.regNo=regNo;
    }

    public String getregNo(){
        return regNo;
    }

    public void fwd(){
        System.out.println("Is a 4X4 car.");
    }
}
