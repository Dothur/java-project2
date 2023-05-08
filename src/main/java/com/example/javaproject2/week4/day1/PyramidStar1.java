package com.example.javaproject2.week4.day1;

public class PyramidStar1 {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
