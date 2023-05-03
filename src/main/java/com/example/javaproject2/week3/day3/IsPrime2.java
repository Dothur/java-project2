package com.example.javaproject2.week3.day3;

public class IsPrime2 {
    public static void main(String[] args) {
        // 소수 찾기 문제
        int num = 7;
        boolean isPrime = true; // true 가 그대로 나오면 소수
        for (int i = 2; i * i <= num ; i++) { // 2 부터 루트 n 까지
            if(num % i == 0){
                isPrime = false; // false 가 되면 소수가 아닌게 된다.
                break; // if 문의 조건을 충족하게되면 곧 소수가 아니기 때문에 break; 문으로 반복문을 빠져나간다.
            }
        }
        System.out.println(isPrime);
    }
}
