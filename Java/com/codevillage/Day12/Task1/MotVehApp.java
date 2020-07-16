package com.codevillage.Day12.Task1;

public class MotVehApp {
    public static void main(String[] args){
        Hyundai hyn =new Hyundai();
        System.out.println("-------Hyundai------");
        System.out.println("Hyundai Details:\t"+hyn.getVehType());
        System.out.println("Hyundai Color:\t"+hyn.getVehColor());
        System.out.println("Hyundai Price:\t"+hyn.getVehCost());

        Skoda skd =new Skoda();
        System.out.println("-------Skoda------");
        System.out.println("Skoda Details:\t"+skd.getVehType());
        System.out.println("Skoda Color:\t"+skd.getVehColor());
        System.out.println("Skoda Price:\t"+skd.getVehCost());
    }
}
