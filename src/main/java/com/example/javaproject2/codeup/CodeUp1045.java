package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    // 사칙연산 클래스
    public static class Arithmetic {
        long iVal1;
        long iVal2;
        long plus(){
            return iVal1 + iVal2;
        }
        long subtract(){
            return iVal1 - iVal2;
        }
        long multiply(){
            return iVal1 * iVal2;
        }
        long divide(){
            return iVal1 / iVal2;
        }
        long remain(){
            return iVal1 % iVal2;
        }
        double fullDivide(){
            return (double) iVal1 / iVal2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.iVal1 = sc.nextLong();
        arithmetic.iVal2 = sc.nextLong();
        System.out.printf("%d\n", arithmetic.plus());
        System.out.printf("%d\n", arithmetic.subtract());
        System.out.printf("%d\n", arithmetic.multiply());
        System.out.printf("%d\n", arithmetic.divide());
        System.out.printf("%d\n", arithmetic.remain());
        System.out.printf("%.2f\n", arithmetic.fullDivide());
    }
}
