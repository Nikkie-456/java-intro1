package com.codevillage.Day12.Task1;

public class Hyundai extends MotorVehicle{

    String vehDet="Imported Hyundai i30 sports";
    String vehColor="Light Blue";
    double vehPrice=378000;

    @Override
    String getVehType() {return vehDet;}
    String getVehColor() {return vehColor;}
    double getVehCost() {return vehPrice;}
}
