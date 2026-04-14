package com.softserve.edu15prod;

public class Producer implements Runnable {
    Backet backet;
    String[] fruits = {"Apple", "Orange", "Lemon", "Cherry", "Pineapple"};

    public Producer(Backet backet) {
        this.backet = backet;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < fruits.length; i++) {
            backet.putFruit(fruits[i]);
        }
    }
}
