package com.softserve.edu15thread;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Current thread id = " + Thread.currentThread().threadId());
        System.out.println("Current thread name = " + Thread.currentThread().getName());
        //
        MyThread t1 = new MyThread();
        t1.setName("MyThread");
        t1.start();
        //
        Runnable r2 = new MyRunnable();
        Thread t2 = new Thread(r2, "MyRunnable");
        t2.start();
    }
}
