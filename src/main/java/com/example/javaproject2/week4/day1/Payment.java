package com.example.javaproject2.week4.day1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        if (account.isSufficient()){
            System.out.println("결제를 요청합니다");
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }
}
