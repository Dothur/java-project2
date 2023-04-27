package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charCount = sc.next().charAt(0);
        for(int i='a'; i<=charCount; i++){
            System.out.printf("%c ", i);
        }
    }
}
