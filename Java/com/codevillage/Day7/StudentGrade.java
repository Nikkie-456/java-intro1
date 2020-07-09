package com.codevillage.Day7;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args){
        String name ="";
        String idNo ="";
        int math =0;
        int eng =0;
        int swa =0;
        int sci =0;
        int rec = 1;
        int cnt = 0;
        int cnt2 = 0;
        int MeanScore =0;
        String MeanGrade ="";
        int GrandScore =0;
        int GrandMean =0;
        int NoOfSub = 0;
        String subjectName="";
        int subMarks =0;

        Scanner stud = new Scanner(System.in);

        System.out.println("Enter Number Of Student");
        cnt = stud.nextInt();

        System.out.println("Enter Number Of Subjects");
        NoOfSub = stud.nextInt();

        if(cnt > 0) {
        while(rec <=cnt){
            System.out.println("Enter Student Name");
            name = stud.next();

            System.out.println("Enter Student ID No");
            idNo = stud.next();


            for (int i=1; i<=NoOfSub; i++){
                {
            System.out.println("Enter Name Of Subject");
            subjectName = stud.next();

            System.out.println("Enter Marks For Subject");
            subMarks = stud.nextInt();

                MeanScore +=subMarks/NoOfSub;
                MeanGrade = getGrade(MeanScore);
            }
                System.out.println("Student Name:" +name);
                System.out.println("Student Id:" +idNo);
                System.out.println("Subject :\t" +subjectName);
                System.out.println("Subject Score:\t" +subMarks);
                System.out.println("Mean Score:" +MeanScore);
                System.out.println("Mean Grade:" +MeanGrade);

                System.out.println("Grand Score:" +GrandScore);
                System.out.println("Grand Grade:" +getGrade(GrandScore));
            }


           rec++;
        }}
        else{
            System.out.println("Enter No Greater Than 0");
        }

    }

    static String getGrade(int gradeScore) {
        String grade1 = "";

        if (gradeScore > 0 && gradeScore < 40)
            grade1 = "D";
        else if (gradeScore > 40 && gradeScore < 60) {
            grade1 = "C";
        } else if (gradeScore > 60 && gradeScore < 80) {
            grade1 = "B";
        } else if (gradeScore >= 80 && gradeScore <= 100) {
            grade1 = "A";
        } else
            grade1 = "E";

        return grade1;

    }
}
