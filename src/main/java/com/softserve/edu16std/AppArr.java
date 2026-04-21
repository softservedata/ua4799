package com.softserve.edu16std;

public class AppArr {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.print("o");
            System.err.print("_");
            Thread.sleep(1);
        }
    }
}