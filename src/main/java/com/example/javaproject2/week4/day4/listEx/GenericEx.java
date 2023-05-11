package com.example.javaproject2.week4.day4.listEx;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for (String s : strList) {
            System.out.println(s);
        }
        System.out.println("==========");
        for (Integer i : intList){
            System.out.println(i);
        }
    }
}
