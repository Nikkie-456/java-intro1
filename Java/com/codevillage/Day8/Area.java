package com.codevillage.Day8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
     static final double PI =3.142;

    public static void main(String[] args){
       Scanner area2 = new Scanner(System.in) ;

       double r =0;
       int a = 0;
       DecimalFormat dmat= new DecimalFormat("#.###");

        System.out.println("Enter Circle Radius");
        r = area2.nextDouble();

        System.out.println("Enter 1 For Area");
        a = area2.nextInt();

        if (a==1){
        System.out.println("Area Of Circle is:\t" +dmat.format(getArea(r)));}
        else
        {System.out.println("Circumference Of Circle is:\t" +dmat.format(getCircum(r)));}

    }

    static double getArea(double g) {
        return (PI*g*g);
    }

    static double getCircum(double p) {
        return (2*PI*p);}

    }
