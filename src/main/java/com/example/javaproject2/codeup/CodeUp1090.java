package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startNum = sc.nextLong(); // 첫째항
        int geometricNum = sc.nextInt(); // 등비
        int whatNum = sc.nextInt(); // 몇번째 정수
        long result = 0;
        int count = 1;
        while (true) {
            if (count == whatNum) {
                result = startNum;
                break;
            } else {
                startNum = startNum * geometricNum;
                count++;
            }
        }
        System.out.println(result);
    }
}
