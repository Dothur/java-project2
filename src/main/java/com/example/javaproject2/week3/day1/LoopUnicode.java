package com.example.javaproject2.week3.day1;

public class LoopUnicode {
    public static void main(String[] args) {
        for (int c = 65; c <= 'Z'; c++) {
            System.out.printf("%d:%c ", c, c);
        }
        System.out.println();
        for (char c = '가'; c <= '하'; c++) {
            System.out.printf("%c ", c);
        }
    }
}
