package com.codevillage.Day12.Calculator;

public class Addition implements Calculator{

    private double a;
    private double b;

    public double getA(){
        return a;
    }

    public double  setA(double i){
        this.a=i;
        return a;
    }

    public double getB(){
        return b;
    }

    public double  setB(double b){
        this.b=b;
        return b;
    }

    @Override
    public double getAdd(double a,double b){
         a=900;
         b=600;
         double c;
         c = a + b;
        System.out.println("Addition is:" +c);
        return c;
    }

    @Override
    public double getSub() {
        return 0;
    }

    @Override
    public double getDiv() {
        return 0;
    }

    @Override
    public double getMul() {
        return 0;
    }

    @Override
    public double getDiv(double a, double b) {
        a=900;
        b=3;
        double div1;

        div1=a/b;

        System.out.println("Division of:" + div1);
        return a / b;
    }

    @Override
    public double getSub(double a, double b) {
        a=900;
        b=350;
        double ans;
        ans =a-b;
        System.out.println("Subtraction:" + ans);
        return ans;
    }

    @Override
    public double getMul(double a, double b) {
        a=900;
        b=350;
        double mul1;
        mul1 =a*b;
        System.out.println("Multiplication:" + mul1);
        return mul1;
    }

}
