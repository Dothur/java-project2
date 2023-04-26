package com.example.javaproject2.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int sec = 239;
        int min = sec / 60;
        int remainSec = sec % 60;
        System.out.printf("%d분 %d초", min, remainSec);
    }
}
