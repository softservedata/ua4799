package com.softserve.edu15prod;

public class AppProdCons {
    public static void main(String[] args) {
        Backet backet = new Backet();
        new Producer(backet);
        new Consumer(backet);
    }
}