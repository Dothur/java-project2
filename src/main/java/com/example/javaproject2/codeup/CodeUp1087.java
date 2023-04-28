package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stopNum = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (true) {
            if (sum < stopNum) {
                sum += count;
                count++;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
