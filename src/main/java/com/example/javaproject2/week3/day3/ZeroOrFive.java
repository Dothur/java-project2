package com.example.javaproject2.week3.day3;

public class ZeroOrFive {
    public static boolean isZeroOfFive(int num){
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 550;
        System.out.printf("%b ", isZeroOfFive(num));
    }
}