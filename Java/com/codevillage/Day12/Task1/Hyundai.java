package com.codevillage.Day12.Task1;

public class Hyundai extends MotorVehicle{

    String vehDet="Imported Hyundai i30 sports";
    String vehColor="Light Blue";
    double vehPrice=378000;

    public String getVehDet(String vehDet){
        return vehDet;
    }

    public void  setVehDet(String vehDet){
        this.vehDet=vehDet;
    }

    public String getVehColor(String VehColor){
        return vehColor;
    }

    public void  setVehColor(String vehColor){
        this.vehColor=vehColor;
    }

    @Override
    String getVehType() {return vehDet;}
    String getVehColor() {return vehColor;}
    double getVehCost() {return vehPrice;}
}
