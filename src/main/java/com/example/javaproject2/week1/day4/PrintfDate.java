package com.example.javaproject2.week1.day4;

public class PrintfDate {
    public static void main(String[] args) {
        // 2023-04-20
        System.out.printf("%d-%02d-%d\n", 2023, 4, 20);
        // 2023-04-03
        System.out.printf("%d-%02d-%02d", 2023, 4, 3);
    }
}
