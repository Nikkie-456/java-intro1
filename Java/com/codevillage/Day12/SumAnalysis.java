package com.codevillage.Day12;

public class SumAnalysis {
    private int a1=300;
    private int b1=40;

    public int getA(){
        return a1;
    }

    public void  setA(){
        this.a1=a1;
    }

    public int getB(){
        return b1;
    }

    public void  setB(){
        this.b1=b1;
    }

    public void isSummation(){
        System.out.println("This is the sum");
    }
    static int getSummation(int g,int p) {
        return (g+p);
    }
}
