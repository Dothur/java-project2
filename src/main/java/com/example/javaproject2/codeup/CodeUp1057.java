package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boolIntValue1 = sc.nextInt();
        int boolIntValue2 = sc.nextInt();
        if(!(boolIntValue1 == 1 ^ boolIntValue2 == 1)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
