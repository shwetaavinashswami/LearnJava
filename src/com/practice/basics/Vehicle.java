package com.practice.basics;

public interface Vehicle {

    static String producer(){
        return "MG Hector";
    }

    default String getOverview(){
        return "My favourite vehicle is " + producer();
    }
}
