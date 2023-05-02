package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        while (num > 0){
            cnt++;
            num /= 10;
        }
        System.out.println(cnt);
    }
}
