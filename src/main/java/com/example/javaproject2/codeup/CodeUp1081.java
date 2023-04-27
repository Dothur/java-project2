package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDiceCount = sc.nextInt();
        int secondDiceCount = sc.nextInt();

        for (int i = 1; i <= firstDiceCount; i++) {
            for (int j = 1; j <= secondDiceCount; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
