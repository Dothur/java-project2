package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (sum < maxNum) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}