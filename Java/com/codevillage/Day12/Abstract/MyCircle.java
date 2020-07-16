package com.codevillage.Day12.Abstract;

public class MyCircle extends MyShape{
    static final double PI =3.142;
     double radius=90.876;

    @Override
    double getArea(){
        return  PI * radius * radius;
    }
}
