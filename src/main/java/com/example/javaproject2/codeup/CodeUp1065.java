package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1065 {
    public static void evenNum(int val){
        if(val % 2 == 0){
            System.out.printf("%d\n", val);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        evenNum(iVal1);
        evenNum(iVal2);
        evenNum(iVal3);
    }
}
