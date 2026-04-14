package com.softserve.edu15thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("\nMyThread thread id = " + Thread.currentThread().threadId());
        for (int i = 0; i < 100; i++) {
            System.out.print(".");
        }
        System.out.println("\nMyThread done, name = " + Thread.currentThread().getName());
    }

}
