package com.codevillage.Day9;

public class MyFunctions {

    final static double PI =3.142;

    static double getArea(double g) {
        return (PI*g*g);
    }

    static double getCircum(double p) {
        return (2*PI*p);}

    static double getProd(double g,double p) {
        return (g*p);
    }

    static int getDiv(int g,int p) {
        return (g/p);
    }



    static double getProd1(double p,double g,double k) {
        return (g*k*p);}

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
