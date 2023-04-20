package com.example.javaproject2.week1.day4;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0;

        PrintHello printHello;
        printHello = new PrintHello(); // new를 이용해 인스턴스화 및 초기화

        System.out.println(iVal);
        printHello.print();
    }
}
