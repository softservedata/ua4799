package com.softserve.edu15thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("\nMyRunnable thread id = " + Thread.currentThread().threadId());
        for (int i = 0; i < 100; i++) {
            System.out.print("~");
        }
        System.out.println("\nMyRunnable done, name = " + Thread.currentThread().getName());
    }
}