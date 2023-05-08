package com.example.javaproject2.week4.day1;

public class SumOfFactorsClass {
    public int sumOfFactors(int num){
        int answer = 1; // 1은 항상 약수
        for (int i = 2; i <= num; i++) {
            if (num % i == 0){
                answer += i;
            }
        }
        return answer;
    }
    public void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d입니다\n", num, sumOfFactors(num));
    }
}
