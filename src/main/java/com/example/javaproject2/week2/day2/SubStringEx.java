package com.example.javaproject2.week2.day2;

public class SubStringEx {
    public static void main(String[] args) {
        String str = "Hello";
        String firstLetter = str.substring(0, 1); // 첫 번째 글자(H) 자르기
        String lastLetter = str.substring(4, 5); // 마지막 글자 자르기
        System.out.println(firstLetter);
        System.out.println(lastLetter);
    }
}
