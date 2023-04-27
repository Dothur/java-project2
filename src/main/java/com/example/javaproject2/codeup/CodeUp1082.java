package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static String changeHexString(int val){
        return Integer.toHexString(val).toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexVal = sc.nextInt(16);
        int result = 0;
        for (int i = 1; i < 16; i++) {
            result = hexVal * i;
            System.out.printf("%s*%s=%s\n", changeHexString(hexVal), changeHexString(i), changeHexString(result));
        }
    }
}
