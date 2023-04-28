package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1116 {
    public static void arithmetic(int num1, int num2){
        System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
        System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
        System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
        System.out.printf("%d/%d=%d", num1, num2, num1 / num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        arithmetic(iVal1, iVal2);
    }
}
