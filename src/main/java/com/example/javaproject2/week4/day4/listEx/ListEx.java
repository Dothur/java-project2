package com.example.javaproject2.week4.day4.listEx;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty()); // { Hello, 1 }
//        l1.remove(0);
//        l1.remove(0);
        System.out.println(l1.isEmpty()); // true
        System.out.println("-----------");
        for (var item : l1){ // for each
            System.out.println(item);
        }
    }
}
