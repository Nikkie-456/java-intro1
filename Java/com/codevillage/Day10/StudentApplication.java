package com.codevillage.Day10;

public class StudentApplication {

    public static void main(String[] args){

        //MyStudent stud = new MyStudent();
        MyStudent stud = new MyStudent("John","9090/80/20","48 St Nakuru","05-Jun-1980",35);

        System.out.println("Student Details");
        System.out.println("Student Name:\t"+MyStudent.name);
        System.out.println("Student Reg No:\t"+MyStudent.regNo);
        System.out.println("Student Age:\t"+MyStudent.age);
        System.out.println("Student Address:\t"+MyStudent.address);
        System.out.println("Student DOB:\t"+MyStudent.dob);
    }
}
