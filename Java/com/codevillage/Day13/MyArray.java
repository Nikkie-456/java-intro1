package com.codevillage.Day13;

import com.codevillage.Day9.MyFunctions;

import java.util.Scanner;

public class MyArray {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int scores[] = new int[10];
        int Meanscore=0;
        int totalSum=0;
        int score_1=0;
        int arrayLeng =0;

        scores[0] = 82;
        scores[1] = 70;
        scores[2] = 80;
        scores[3] = 90;
        scores[4] = 88;
        scores[5] = 67;
        scores[6] = 75;
        scores[7] = 74;
        scores[8] = 90;
        scores[9] = 86;

        for (int i = 0; i < scores.length; i++) {

            System.out.println("----Values-----");
            System.out.println("Scores are:"+ i +"\t" +scores[i]);
            totalSum+=scores[i];

            System.out.println("Scores are:"+totalSum);
        }

 //Scanner Bit

        System.out.println("Enter No Of Scores");
        arrayLeng = scanner.nextInt();


        for (int i = 0; i < arrayLeng; i++) {

            System.out.println("Enter Marks");
            score_1 = scanner.nextInt();

            System.out.println("----Values Scanner-----");
            System.out.println("Scores are:"+ i +"\t" +scores[i]);
            totalSum+=scores[i];

            System.out.println("Scores are:"+totalSum);
      }
    }
}
