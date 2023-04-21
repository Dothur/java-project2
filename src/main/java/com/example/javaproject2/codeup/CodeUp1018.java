package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split(":"); // : 로 구분하여 str 에 받음
        System.out.printf("%s:%s", str[0], str[1]);
    }
}
