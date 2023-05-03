package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class DoWhileExCodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println(num);
            } else {
                break;
            }
        } while (true);
    }
}
