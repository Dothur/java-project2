package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt(); // 3
        int iVal2 = sc.nextInt(); // 2
        int iVal3 = sc.nextInt(); // 1

        // 가장 큰 값
        // (a > b ? a : b) > c ? ( a > b ? a : b) : c
        // 가장 작은 값
        // (a < b ? a : b) < c ? ( a < b ? a : b) : c
        System.out.printf("%d", ((iVal1 < iVal2 ? iVal1 : iVal2) < iVal3 ? (iVal1 < iVal2 ? iVal1 : iVal2) : iVal3));
    }
}
