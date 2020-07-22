package com.codevillage.Day14;

import java.util.ArrayList;

public class MyListArray {
    public static void main(String[] args){
        ArrayList <Integer> scores=new ArrayList<>();

        scores.add(100);
        scores.add(200);
        scores.add(300);

        System.out.println("Value at P1:\t" +scores.get(0));

        System.out.println("Value at B4 P1:\t" +scores.get(0));
        scores.set(0,250);

        System.out.println("Value at AF P1:\t" +scores.get(0));
        scores.remove(0);

        System.out.println("Value at AF Remove:\t" +scores);
    }
}
