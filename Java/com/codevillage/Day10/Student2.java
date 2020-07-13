package com.codevillage.Day10;

public class Student2 {

    public static void main(String[] args){


        MyStudent stud = new MyStudent("John","9090/80/20","48 St Nakuru","05-Jun-1980",35);

        System.out.println("Student Details");
        System.out.println("Student Name:\t"+MyStudent.name);
        System.out.println("Student Reg No:\t"+MyStudent.regNo);
        System.out.println("Student Age:\t"+MyStudent.age);
        System.out.println("Student Address:\t"+MyStudent.address);
        System.out.println("Student DOB:\t"+MyStudent.dob);

        System.out.println("Getters & Setters Details");
        stud.setName("Parker");
        stud.setregNo("56778899900");

        System.out.println("Student Name:\t"+stud.getName());
        System.out.println("Student Reg No:\t"+stud.getregNo());
        System.out.println("Student Age:\t"+MyStudent.age);
        System.out.println("Student Address:\t"+MyStudent.address);
        System.out.println("Student DOB:\t"+MyStudent.dob);

    }
}
