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
        int MeanScore =0;
        String MeanGrade ="";
        int GrandScore =0;
        int GrandMean =0;

        Scanner stud = new Scanner(System.in);

        System.out.println("Enter Number Of Student");
        cnt = stud.nextInt();

        if(cnt > 0) {
        while(rec <=cnt){
            System.out.println("Enter Student Name");
            name = stud.nextLine();

            System.out.println("Enter Student ID No");
            idNo = stud.nextLine();

            System.out.println("Enter Score For Maths");
            math = stud.nextInt();

            System.out.println("Enter Score For English");
            eng = stud.nextInt();

            System.out.println("Enter Score For Kiswahili");
            swa = stud.nextInt();

            System.out.println("Enter Score For Science");
            sci = stud.nextInt();

            MeanScore = (math+eng+sci+swa)/4;
            MeanGrade = getGrade(MeanScore);

            GrandScore +=(MeanScore/3);

            System.out.println("Student No: \t" +rec);

            System.out.println("Student Name:" +name);
            System.out.println("Student Id:" +idNo);
            System.out.println("Maths Score:" +math + "\t Math Grade \t"+getGrade(math));
            System.out.println("English Score:" +eng + "\t English Grade \t"+getGrade(eng));
            System.out.println("Kiswahili Score:" +swa + "\t Swahili Grade \t"+getGrade(swa));
            System.out.println("Science Score:" +sci + "\t Science Grade \t"+getGrade(sci));
            System.out.println("Mean Score:" +MeanScore);
            System.out.println("Mean Grade:" +MeanGrade);

            System.out.println("Grand Score:" +GrandScore);
            System.out.println("Grand Grade:" +getGrade(GrandScore));

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
