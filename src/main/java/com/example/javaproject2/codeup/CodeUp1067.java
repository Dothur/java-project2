package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1067 {
    public static void plusMinus(int val){
        if(val > 0){
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
    }
    public static void evenOddNum(int val) {
        if (val % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();

        plusMinus(iVal1);
        evenOddNum(iVal1);
    }
}