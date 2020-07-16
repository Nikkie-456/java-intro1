package com.codevillage.Day12;

public class TotSum extends SumAnalysis{

    private int c1 =50;

    public int getC1(){
        return c1;
    }

    public void  setC1(){
        this.c1=c1;
    }

    public void isSummation(){
        System.out.println("This is the total sum");
    }

    public  int getSummation(int g,int p,int k) {
        return (g+p+k);
    }
}
