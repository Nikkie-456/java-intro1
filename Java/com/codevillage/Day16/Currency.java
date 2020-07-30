package com.codevillage.Day16;

public class Currency {
    String currName="";
    String currNotation="";

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName;
    }

    public String getCurrNotation() {
        return currNotation;
    }

    public void setCurrNotation(String currNotation) {
        this.currNotation = currNotation;
    }

    public Currency(String currName, String currNotation) {
        this.currName = currName;
        this.currNotation = currNotation;
    }
}