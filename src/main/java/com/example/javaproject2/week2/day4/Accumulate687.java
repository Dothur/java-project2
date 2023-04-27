package com.example.javaproject2.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer += num % 10;
        System.out.printf("answer:%d\n", answer);
        num /= 10;
        answer += num % 10;
        System.out.printf("answer:%d\n", answer);
        num /= 10;
        answer += num % 10;
        System.out.printf("answer:%d\n", answer);
    }
}
