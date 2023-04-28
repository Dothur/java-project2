package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        for (int i = 1; i <= maxNum; i++) {
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
