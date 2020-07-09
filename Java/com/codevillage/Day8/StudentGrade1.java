package com.codevillage.Day8;

import java.util.Scanner;

public class StudentGrade1 {
    public static void main(String[] args){
        int num=100;

        while(num >0 && num <=100){
         System.out.println("Number:\t" +num);
         if (num==50)
             break;
         num--;
        }

        System.out.println("For Loop Number");

        for(int num1=0; num1<=100; num1++){
            System.out.println("Number:\t" +num1);
            if(num1==50){
                continue;
            }System.out.println("Number:\t" +num1);
        }
    }

    String gender="M";
    String userInput="F";

}
