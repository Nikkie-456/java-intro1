package com.codevillage.Day11.Task2;



public class FruitApp {
    public static void main(String[] args) {

        MangoFruit fru1 = new MangoFruit("Raw Mango","Dark Green",3,"Is Solid");

        System.out.println("-----Mango--------");
        System.out.println("Name:\t" + fru1.getName());
        System.out.println("Color:\t" + fru1.getColor());
        System.out.println("Weight in gms: \t" + fru1.getweight());
        System.out.println("Solid Yes/No: \t" + fru1.getSolid());
        fru1.isPerishable();
        fru1.isRaw();


        Mango1 fru3 = new Mango1("Mango Child Details","Pale Green",4,"Is Solid","Very Solid");

        System.out.println("-----Mango Child Details--------");
        System.out.println("Name:\t" + fru3.getName());
        System.out.println("Color:\t" + fru3.getColor());
        System.out.println("Weight in gms: \t" + fru3.getweight());
        System.out.println("Solid Yes/No: \t" + fru3.getSolid());
        System.out.println("Child Solid Yes/No: \t" + fru3.getSolid1());
        fru3.isPerishable();

        OrangeFruit fru2 = new OrangeFruit("Ripe Orange","Bright Yellow",2);
         fru2.setName("Yellow");
        System.out.println("-----Orange--------");
        System.out.println("Name:\t" + fru2.getName());
        System.out.println("Color:\t" + fru2.getColor());
        System.out.println("Weight in gms: \t" + fru2.getweight());
        fru2.isPerishable();
        fru2.isRipe();
    }
}
