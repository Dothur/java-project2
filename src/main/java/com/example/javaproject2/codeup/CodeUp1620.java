package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1620 {
    public static int solution(int num){
        int answer = 0;
        while (num > 0){
            answer += num % 10;
            num /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num/10 != 0){
            num = solution(num);
        }
        System.out.println(num);
    }
}
