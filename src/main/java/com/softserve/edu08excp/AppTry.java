package com.softserve.edu08excp;

public class AppTry {

    public static void main(String[] args) {
        System.out.println("start");
        //
        try {
            int i = 1 / 0;
        }
        catch (Exception e) {
            System.out.println("catch (Exception e)");
            System.exit(1);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("done");
    }
}
