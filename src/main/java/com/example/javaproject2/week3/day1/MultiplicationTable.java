package com.example.javaproject2.week3.day1;

public class MultiplicationTable {
    public static void printGugudan(int num){
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d\n", num, j, num * j);
        }
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        printGugudan(2);
        printGugudan(4);
        printGugudan(7);
        printGugudan(9);
    }
}
