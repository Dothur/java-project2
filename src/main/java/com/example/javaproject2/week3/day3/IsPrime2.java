package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        // 소수 판별하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 소수인지 아닌지를 판별하려는 수
        boolean isPrime = true; // true 가 그대로 나오면 소수
        for (int i = 2; i * i <= num ; i++) { // 2 부터 루트 n 까지
            if(num % i == 0){
                isPrime = false; // false 가 되면 소수가 아니게 된다.
                break; // if 문의 조건을 충족하게되면 곧 소수가 아니기 때문에
            }					 // break; 를 사용해서 반복문을 빠져나간다.
        }
        System.out.println(isPrime);
    }
}