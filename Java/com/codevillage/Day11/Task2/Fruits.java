package com.codevillage.Day11.Task2;

public class Fruits {
    private String name;
    protected String color;
    protected int weight;

    public void isPerishable(){
        System.out.println("This fruit is perishable");
    }

    public Fruits(String name,String color,int weight) {
        this.name= name;
        this.color= color;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name=name;
    }

}
