package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lVal1 = sc.nextLong();
        long lVal2 = sc.nextLong();
        long lVal3 = sc.nextLong();
        System.out.printf("%d\n%.1f", lVal1 + lVal2 + lVal3, (lVal1 + lVal2 + lVal3) / 3.0);
    }
}
