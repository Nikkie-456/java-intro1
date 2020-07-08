package com.codevillage.Day7;

public class LoopsIntro {

    public static void main(String[] args) {
        int num = 1;

        // while loop
        System.out.println("While Loop");
        while (num <= 10) {
            System.out.println("Num is:" + num);
            num++;
        }

        // do while
        System.out.println("Do Loop");
        num =1;
        do {
            System.out.println("Num is:" + num);
            num++;
        } while (num <= 10);

        //for loop
        System.out.println("For Loop");

        for (num = 1; num <= 10; num++) {
            System.out.println("Num is:" + num);
        }
    }
}
