package com.codevillage.Day7;

public class EvenNumbers {
    public static void main(String[] args){
        int limit=100;

        System.out.println("Even Numbers between 1 and\t"  +limit);

        for (int i=1; i<=limit; i++){
            if (i % 2 ==0) {
                System.out.println("Even Number is: " +i);
            }
        }

        System.out.println("While Loop");
        int r=1;

        while(r <=100){
            if(r%2==0 ){
                System.out.println("Num is:" +r);
            }
            r++;
        }

        System.out.println("Do While Loop");
        int p =1;

        do {if(p%2==0 ){
            {
                System.out.println("Num is:" +p);
            }
        } p++;
        } while (p <=100);
    }
}
