package com.softserve.edu10lst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppExample {
    public static void main(String[] args) {
        List<Integer> listOrigin = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list0 = new ArrayList<>(listOrigin);
        System.out.println("list0 = " + list0);
        //
        int k = 6;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list1.add(list0.get(i));
        }
        System.out.println("list1 = " + list1);
        list0.removeAll(list1);
        System.out.println("list0 = " + list0);
        //
        Collections.reverse(list0);
        list1.addAll(list0);
        System.out.println("list1 = " + list1);
    }
}
