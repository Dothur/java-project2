package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 70) {
            System.out.println("B");
        } else if (score <= 69 && score >= 40) {
            System.out.println("C");
        } else if (score <= 39 && score >= 0){
            System.out.println("D");
        }
    }
}