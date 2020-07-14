package com.codevillage.Day11;

public class MyDogApp {
    public static void main(String[] args){
     Bulldog bulldog =new Bulldog();
     bulldog.setShortTail("Has a short tail");
     bulldog.name ="Bingo";
     bulldog.color="White";

        System.out.println("Name:"+bulldog.getName());
        System.out.println("Color:"+bulldog.getColor());
        System.out.println("Tail:"+bulldog.getShortTail());

    }
}
