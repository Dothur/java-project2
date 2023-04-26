package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1066 {

    public static void evenOddNum(int val){
        if(val % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        evenOddNum(iVal1);
        evenOddNum(iVal2);
        evenOddNum(iVal3);
    }
}