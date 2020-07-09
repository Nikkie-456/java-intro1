package com.codevillage.Day8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area1 {
    static final double PI =3.142;

    public static void main(String[] args){
        Scanner area3 = new Scanner(System.in) ;

        double a =0;
        double b =0;
        double c =0;
        int d =0;
        DecimalFormat dmat= new DecimalFormat("#.###");

        System.out.println("Enter Value 1");
        a = area3.nextDouble();

        System.out.println("Enter Value 2");
        b = area3.nextDouble();

        System.out.println("Enter Value 3");
        c = area3.nextDouble();

        System.out.println("Product Of A and B is :\t" +dmat.format(getProd(a,b)));
        System.out.println("Product Of A and B and C is\t" +dmat.format(getProd1(a,b,c)));


    }

    static double getProd(double g,double p) {
        return (g*p);
    }

    static double getProd1(double p,double g,double k) {
        return (g*k*p);}
}
