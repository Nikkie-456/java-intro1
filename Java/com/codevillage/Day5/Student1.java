package com.codevillage.Day5;

import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        String name ="";
        String stuRegNo ="";
        int math=0;
        int eng=0;
        int swa=0;
        int sci=0;
        int totalMarks =0;
        int cnt =4;
        int meanScore =0;
        String meanGrade="";

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

        totalMarks = math+ eng + sci + swa;

        meanScore = totalMarks/cnt;

       if (meanScore > 0 &&  meanScore < 40) {
        meanGrade="D" ;}
        else if (meanScore > 40 && meanScore < 60){
           meanGrade="C" ;}
        else if (meanScore > 60 && meanScore < 80){
           meanGrade="B" ;}
        else if (meanScore > 80){
           meanGrade="A" ;}
        else
           meanGrade="E" ;

        System.out.println("Student Name:" +name +'\n'+ "Student Reg No:" + stuRegNo +'\n'+ "Score Maths:" +math +'\n'+ "Score English:" +eng +'\n'+ "Score Swahili:" +swa +'\n' + "Score Science:" +sci
         +'\n'+ "Total Marks:" +totalMarks +'\n' + "Mean Grade:" +meanGrade);

    }
}
