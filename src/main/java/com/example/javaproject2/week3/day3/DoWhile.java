package com.example.javaproject2.week3.day3;

public class DoWhile {
    public static void main(String[] args) {
        int cnt = 10;
        do {
            System.out.println("do 구간에서 실행");
        }while (cnt < 10); // do 구간에서 무조건 1번은 실행되므로 조건이 바로 틀려도 실행된다.
    }
}
