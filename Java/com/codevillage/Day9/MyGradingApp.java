package com.codevillage.Day9;

import java.util.Scanner;

public class MyGradingApp {

    public static void main(String[] args){
        Scanner gradApp = new Scanner(System.in);

        int cnt =0;
        int NoOfSub =1;
        String subjectName ="";
        String name ="";
        String RegNo ="";
        int subScore =0;
        int rec =1;
        int MeanScore =0;
        String MeanGrade ="";


        System.out.println("Enter Number Of Student");
        cnt = gradApp.nextInt();

        System.out.println("Enter Number Of Subjects");
        NoOfSub = gradApp.nextInt();

        if(cnt > 0) {
            while(rec <=cnt){
                System.out.println("Enter Student Name");
                name = gradApp.next();

                System.out.println("Enter Student Reg No");
                RegNo = gradApp.next();


                for (int i=1; i<=NoOfSub; i++){
                    {
                        System.out.println("Enter Name Of Subject");
                        subjectName = gradApp.next();

                        System.out.println("Enter Marks For Subject");
                        subScore = gradApp.nextInt();

                        MeanScore +=subScore/NoOfSub;
                        MeanGrade = MyFunctions.getGrade(MeanScore);
                    }
                    System.out.println("Student Name:" +name);
                    System.out.println("Student Id:" +RegNo);
                    System.out.println("Subject :\t" +subjectName);
                    System.out.println("Subject Score:\t" +subScore);
                    System.out.println("Mean Score:" +MyFunctions.getDiv(MeanScore,NoOfSub));
                    System.out.println("Mean Grade:" +MeanGrade);

                }rec++;
            }}

    }
}
