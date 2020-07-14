package com.codevillage.Day11.Task2;

public class Mango1 extends MangoFruit{

    private String solid1;

    public Mango1(String name,String color,int weight,String solid,String solid1){
        super(name, color, weight,solid);
        this.solid1=solid1;
    }

    public String getSolid1(){
        return solid1;
    }
}
