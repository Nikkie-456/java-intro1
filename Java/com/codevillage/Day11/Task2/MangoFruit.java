package com.codevillage.Day11.Task2;

public class MangoFruit extends  Fruits{
    private String solid;
    private String name;

    public MangoFruit(String name,String color,int weight,String solid){
        super(name, color, weight);
        this.solid=solid;
    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name=name;
    }

    public String getSolid(){
        return solid;
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

    public void isRaw(){
        System.out.println("Mango is still raw.");
    }

}
