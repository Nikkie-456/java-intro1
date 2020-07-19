package com.codevillage.Day12.Calculator;

public class CalcApp {

    public static void main(String[] args){

        Addition add1 = new Addition();
        add1.setA(900);
        add1.setB(400);

        System.out.println("----Addition-----");
        add1.getAdd(add1.getA(),add1.getB());
        System.out.println("Value Of A:" +add1.getA());
        System.out.println("----Subtraction-----");
        add1.getSub(30,20);
        System.out.println("----Division-----");
        add1.getDiv(900,3);
        System.out.println("----Product-----");
        add1.getMul(300,4);
    }
}
