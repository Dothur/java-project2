package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startNum = sc.nextInt(); // 시작 값
        int multiplyNum = sc.nextInt(); // 곱할 값
        int plusNum = sc.nextInt(); // 더할 값
        int whatNum = sc.nextInt(); // 몇번째 정수
        int count = 1;
        while (true) {
            if(count == whatNum){
                break;
            } else {
                startNum = startNum * multiplyNum + plusNum;
                count++;
            }
        }
        System.out.println(startNum);
    }
}
