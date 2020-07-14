package com.codevillage.Day11.Task1;



public class MyVehApp {

    public static void main(String[] args){

        Ford veh=new Ford();


        veh.name ="F150";
        veh.color="White";
        veh.setregNo("KBN 890P");

        System.out.println("-----Ford--------");
        System.out.println("Name:"+veh.getName());
        System.out.println("Color:"+veh.getColor());
        System.out.println("Reg No:"+veh.getregNo());
        veh.fwd();

        Toyota toyota=new Toyota();

        toyota.name ="Tacoma";
        toyota.color="Jungle Green";
        toyota.setregNo("KYR 710P");

        System.out.println("-----Toyota--------");
        System.out.println("Name:"+toyota.getName());
        System.out.println("Color:"+toyota.getColor());
        System.out.println("Reg No:"+toyota.getregNo());
        toyota.luxuryVeh();

    }
}
