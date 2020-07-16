package com.codevillage.Day12.Abstract;

public class MyRectangle extends MyShape{

    double l =59.75;
    double w= 75.50;

    @Override
    double getArea(){
        return  l * w;
    }
}
