package com.practice.javabasics;

public class Number {
    java.lang.Number numberj;
    Number number;

    Number(java.lang.Number numberj){
        this.numberj = numberj;
        System.out.println("Inside constructor of java.lang.Number");
    }

    Number(Number number){
        this.number = number;
        System.out.println("Inside Constructor of Number");
    }

    public static void main(String[] args) {
        Number n = new Number(10);
        Number n2 = new Number(n);
    }
}
