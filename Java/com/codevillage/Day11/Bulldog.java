package com.codevillage.Day11;

public class Bulldog extends Dog {

    private String shortTail="";

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

    public void  setShortTail(String shortTail){
        this.shortTail=shortTail;
    }

    public String getShortTail(){
        return shortTail;
    }

}
