package com.softserve.edu15prod;

public class Consumer implements Runnable {
    Backet backet;

    public Consumer(Backet backet) {
        this.backet = backet;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            backet.pollFruit();
        }
    }
}
