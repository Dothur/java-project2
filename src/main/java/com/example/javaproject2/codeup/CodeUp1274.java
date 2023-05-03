package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1274 {
    public static void isPrime(int num) {
        int factors = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        if (factors == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
    }
}
