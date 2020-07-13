package com.codevillage.Day10;

public class MyCar {
    private String name="Volvo";
    private String RegNo ="KCX 789K";
    private String color="Red";

    public static void main(String[] args){
        MyCar volvo= new MyCar();
        MyCar bmw= new MyCar();
        MyCar toyota= new MyCar();

        System.out.println("The Brand Is Volvo");
        System.out.println("The Brand Is:"+volvo.name);
        System.out.println("The RegNo Is:"+volvo.RegNo);
        System.out.println("The Color Is:"+volvo.color);

        System.out.println("The Brand Is Toyota");
        System.out.println("The Brand Is:"+toyota.name);
        System.out.println("The RegNo Is:"+toyota.RegNo);
        System.out.println("The Color Is:"+toyota.color);


        System.out.println("The Brand Is BMW");
        bmw.name="BMW X6";
        bmw.RegNo="KCS 876T";
        bmw.color ="Blue";
        System.out.println("The Brand Is:"+bmw.name);
        System.out.println("The RegNo Is:"+bmw.RegNo);
        System.out.println("The Color Is:"+bmw.color);

    }
}

