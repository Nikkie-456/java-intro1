package com.codevillage.Day12;


public class SumApp {

    public static void main(String[] args){
        TotSum sum_1 =new TotSum();
        sum_1.setA();
        sum_1.setB();

        System.out.println("The total Summation is\t"+sum_1.getSummation(sum_1.getA(),sum_1.getB(),sum_1.getC1()));
        sum_1.isSummation();
    }
}
