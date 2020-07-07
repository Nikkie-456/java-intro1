package com.codevillage.Day5;

import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        String name = "";
        String stuRegNo = "";
        int math = 0;
        int eng = 0;
        int swa = 0;
        int sci = 0;
        int totalMarks = 0;
        int cnt = 4;
        int meanScore = 0;
        String meanGrade = "";
        String mathGrade = "";
        String engGrade = "";
        String swaGrade = "";
        String sciGrade = "";

        Scanner stud = new Scanner(System.in);

        System.out.println("Enter Student Name");
        name = stud.nextLine();

        System.out.println("Enter Student Reg No");
        stuRegNo = stud.nextLine();

        System.out.println("Enter Score For Maths");
        math = stud.nextInt();

        System.out.println("Enter Score For English");
        eng = stud.nextInt();

        System.out.println("Enter Score For Swahili");
        swa = stud.nextInt();

        System.out.println("Enter Score For Science");
        sci = stud.nextInt();

        totalMarks = math + eng + sci + swa;

        meanScore = totalMarks / cnt;



        System.out.println("Student Name:" +name +'\n'+ "Student Reg No:" + stuRegNo +'\n'+ "Score Maths:" +math + "\t Math Grade:" +getGrade(math) +'\n'+ "Score English:" +eng  + "\t English Grade:" +getGrade(eng) +'\n'+ "Score Swahili:" +swa  +"\t Swahili Grade:" +getGrade(swa) +'\n' + "Score Science:" +sci + "\t Science Grade:" +getGrade(sci)
                +'\n'+ "Total Marks:" +totalMarks +'\n' + "Mean Grade:" +getGrade(meanScore));

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


