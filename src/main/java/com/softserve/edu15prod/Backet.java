package com.softserve.edu15prod;

public class Backet {
    private String fruit;
    private volatile boolean fruitIsAvailable = false;

    public synchronized String pollFruit() {
        while (!fruitIsAvailable)
            try {
                wait();
            } catch (InterruptedException e) {
            }
        System.out.println("Get: " + fruit);
        //
        String fruitRet = fruit;
        fruit = "";
        //
        fruitIsAvailable = false;
        notify();
        return fruitRet;
    }

    public synchronized void putFruit(String fruit) {
        while (fruitIsAvailable)
            try {
                wait();
            } catch (InterruptedException e) {
            }
        //
        this.fruit = fruit;
        System.out.println("Put: " + fruit);
        fruitIsAvailable = true;
        notify();
    }
}
