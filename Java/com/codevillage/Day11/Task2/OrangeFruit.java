package com.codevillage.Day11.Task2;

public class OrangeFruit extends Fruits {
    private String liquid;
    private String name;

    public OrangeFruit(String name,String color,int weight){
        super(name, color, weight);
        this.liquid=liquid;
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

    public void isRipe(){
        System.out.println("Orange is very ripe.");
    }
}
