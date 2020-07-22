package com.codevillage.Day14.Pupil;


import com.codevillage.Day9.MyFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class PupilApp {

    public static void main(String[] args){
        Scanner pupilApp = new Scanner(System.in);

        ArrayList<Pupils> pupil=new ArrayList<>();

        Pupils puPil = new Pupils("Jax","REG/001/2020","Nairobi");
        Pupils puPila = new Pupils("Peter","REG/002/2020","Webuye");
        Pupils pupilb = new Pupils("Grace","REG/003/2020","Muranga");

        pupil.add(puPil);
        pupil.add(puPila);
        pupil.add(pupilb);

        System.out.println("Array Size :\t" +pupil.size());

        double noOfSub=0;
        double marks=0;
        double sum=0;
        String mean="";
        String subName="";

        System.out.println("Enter No Of Subjects");
        noOfSub= pupilApp.nextDouble();

        if(noOfSub > 0){
            for(int i=0; i<noOfSub; i++){
                System.out.println("Enter Subject");
                subName=pupilApp.next();

                System.out.println("Enter Student Score");
                marks=pupilApp.nextDouble();
                sum +=marks;
            }

            for(int j=0; j <pupil.size(); j++){
                System.out.println("Value of Student at index:\t"+pupil.get(j).getName()+"\t Reg No:"+pupil.get(j).getRegNo()+"\t Address:"+pupil.get(j).getAddRess()+"\t Marks:\t"+marks+"\t Mean Score:\t"+MyFunctions.getGrade(marks)+"\t Total:"+sum+"\t Mean Grade:\t"+MyFunctions.getGrade(MyFunctions.getAvg(sum,noOfSub)));
            }
        }


    }
}
