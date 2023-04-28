package com.example.javaproject2.week2.day5;

public class IFLogicalEx {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x > 0 && y > 0) {
            System.out.println("x y 는 모두 양수");
        }
        if (x > 0 || y > 0) {
            System.out.println("x 와 y 중 적어도 하나는 양수");
        }
        if (!(x > 0)) {
            System.out.println("x 는 음수 또는 0 입니다");
        }
    }
}
