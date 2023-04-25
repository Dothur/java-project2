package com.example.javaproject2.codeup;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bIVal = sc.nextBigInteger();
        System.out.printf("%d", bIVal.multiply(BigInteger.valueOf(-1)));
    }
}
