package com.codevillage.Day11.Task2;

public class GuavaFruit extends Fruits {

    private String rotten;
    private String name;

    public GuavaFruit(String name,String color,int weight){
        super(name, color, weight);
        this.rotten=rotten;
    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name=name;
    }

    public void  setColor(String name){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void  setweigt(int weight){
        this.weight=weight;
    }

    public int getweight(){
        return weight;
    }

    public void isBlended(){
        System.out.println("Guara is very blended.");
    }
}
