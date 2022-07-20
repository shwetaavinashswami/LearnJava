package com.practice.javabasics;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class TestStaticImport {
    public static void main(String[] args) {
        int radius = 2;

       // double circumference = 2 * java.lang.Math.PI * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Circumference is :" +  circumference);

        //double sqr81 = java.lang.Math.sqrt(81);
        double sqr81 = sqrt(81);
        System.out.println("Square Root of 81 is " + sqr81);
    }
}
