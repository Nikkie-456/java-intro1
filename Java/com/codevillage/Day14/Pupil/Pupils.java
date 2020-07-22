package com.codevillage.Day14.Pupil;

import java.util.ArrayList;

public class Pupils {

    private String name;
    private String regNo;
    private String addRess;

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public Pupils(String name, String regNo, String addRess) {
        this.name = name;
        this.regNo = regNo;
        this.addRess = addRess;
    }


    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Pupils(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
