package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeSixNineCount = sc.nextInt();
        for (int i = 1; i <= threeSixNineCount; i++) {
            if (i % 3 == 0) {
                System.out.printf("%c ", 'X');
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}