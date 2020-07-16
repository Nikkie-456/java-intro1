package com.codevillage.Day12.Abstract;


public class MyAreaApp {
    public static void main(String[] args){
        MyRectangle rect = new MyRectangle();

        System.out.println("The Area for rectangle is:\t"+rect.getArea());

        MyCircle circle = new MyCircle();

        System.out.println("The Area for circle is:\t"+circle.getArea());
    }
}
