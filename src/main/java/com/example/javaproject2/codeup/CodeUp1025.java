package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        int i = 10000;
        for (String s : arr) {
            System.out.printf("[%d]\n", Integer.parseInt(s) * i);
            i /= 10;
        }
    }
}
