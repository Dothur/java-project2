package com.example.javaproject2.week2.day2;

public class StringEqualsSubstring {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";
        boolean isSame = str1.substring(0, 1).equals(str2);
        System.out.println("isSame = " + isSame);
    }
}
