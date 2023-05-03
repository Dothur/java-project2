package com.example.javaproject2.week3.day3;

public class IsPrimeDivide {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; // 약수 개수
        for(int i = 2; i * i<=num; i++) { // 1~6 까지 // 다른 방법으론 i <= num / 2;
            if(num % i == 0) factors++;
        }
        if(factors == 0) System.out.println("prime");
        else System.out.println("not prime");
    }
}
