package com.codevillage.Day12.Task2;

public class ReptileApp {

    public static void main(String[] args){

        Crocodile croc=new Crocodile();

        System.out.println("----Crocodile Details-----");
        croc.backBone();
        croc.layEggs();
        croc.hasScales();
        croc.longSnout();

        Alligator algt=new Alligator();

        System.out.println("----Alligator Details-----");
        algt.backBone();
        algt.layEggs();
        algt.hasScales();
        algt.longSnout();
    }
}
