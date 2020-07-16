package com.codevillage.Day12.Task1;


public class Skoda extends MotorVehicle {

    String skodadet="This is a second hand Skoda from Germany.";
    String vehColor="Light Blue";
    double vehPrice=600000;

    @Override
    String getVehType(){return skodadet;}
    String getVehColor() {return vehColor;}
    double getVehCost() {return vehPrice;}

}
