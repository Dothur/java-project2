package com.example.javaproject2.week3.day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; // 약수의 개수
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                factors++;
            }
        }
        System.out.println("factors = " + factors);
        // factors 가 2 이면 1과 원래 값만 약수이므로 소수
        System.out.println(factors == 2 ? num + " 은 소수입니다." : num + " 은 소수가 아닙니다");
    }
}
