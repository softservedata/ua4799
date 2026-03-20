package com.softserve.edu09builder;

public class AppCar {

    public static void main(String[] args) {
        Car car = Car.builder()
                .setHonda()
                .setRed()
                .setPetrol()
                .setManual()
                .setLed()
                //.setBlackSalon()
                .build();
        System.out.println(car);
    }
}