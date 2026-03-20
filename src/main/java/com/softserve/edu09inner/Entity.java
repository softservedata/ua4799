package com.softserve.edu09inner;

class Entity {

    private static class Counter { // Nested Class
        private void setCount() {
            count = count + 1;
            // num++; // Compile Error
        }
    }

    //---------------------------------------------

    private static int count = 0;
    private static Counter counter;

    private int num = 1;

    // Static block
    static {
        counter = new Counter();
        System.out.println("Static block0 done");
    }

    // Init block
    {
        System.out.println("\tInit block1 done");
    }

    public Entity() {
        // new Counter().setCount();
        counter.setCount();
        System.out.println("\t\t\tEntity() constructor done");
    }

    // Init block_2
    {
        System.out.println("\t\tInit block2 done");
    }

    public static int getCount() {
    //public int getCount() {
        return count;
    }
}        