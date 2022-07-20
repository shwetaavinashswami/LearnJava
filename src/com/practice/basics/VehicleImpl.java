package com.practice.basics;
import static com.practice.basics.Vehicle.producer;

public class VehicleImpl implements Vehicle{
    public static void main(String [] args){
        System.out.println("" + producer());

        Vehicle vehicle = new VehicleImpl();
        System.out.println(vehicle.getOverview());
    }
}
