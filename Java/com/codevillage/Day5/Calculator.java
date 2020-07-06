package com.codevillage.Day5;

public class Calculator {
    public static void main(String[] args) {
        int a=30;
        int b=15;

        int sum=0;
        int mul=0;
        int div=0;
        int sub=0;
        int num =0;

        sum = a+b;
        mul = a*b;
        div = a/b;
        sub = a-b;
        num = a%b;

        System.out.println("Summation is:" +sum +'\n'+ "Multiplation is:" +mul +'\n'+ "Division is:" +div +'\n'+ "Substration is:" +sub +'\n'+ "Modulus is:" +num);
    }
}
