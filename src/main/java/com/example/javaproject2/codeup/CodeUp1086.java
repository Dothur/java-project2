package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int depth = sc.nextInt();
        double byteResult = ((double) width * height * depth) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB", byteResult);
    }
}
