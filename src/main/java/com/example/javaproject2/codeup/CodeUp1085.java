package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hz = sc.nextInt();
        int bit = sc.nextInt();
        int channel = sc.nextInt();
        int sec = sc.nextInt();
        double byteResult = ((double) hz * bit * channel * sec) / 1024 / 1024 / 8;
        System.out.printf("%.1f MB", byteResult);
    }
}
