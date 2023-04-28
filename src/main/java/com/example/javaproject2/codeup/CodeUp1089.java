package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int degreeDiffVal = sc.nextInt();
        int whatNum = sc.nextInt();
        int result = 0;
        int count = 1;
        while (true) {
            if (count == whatNum) {
                result = startNum;
                break;
            } else {
                startNum += degreeDiffVal;
                count++;
            }
        }
        System.out.println(result);
    }
}
