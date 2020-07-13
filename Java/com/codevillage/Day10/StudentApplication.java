package com.codevillage.Day10;

public class StudentApplication {

    public static void main(String[] args){

        MyStudent stud = new MyStudent();

        System.out.println("Student Details");
        System.out.println("Student Name:\t"+MyStudent.name);
        System.out.println("Student Reg No:\t"+MyStudent.regNo);
        System.out.println("Student Age:\t"+MyStudent.age);
        System.out.println("Student Address:\t"+MyStudent.address);
        System.out.println("Student DOB:\t"+MyStudent.dob);
    }
}
