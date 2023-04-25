package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexaDecimal = sc.nextInt(16); // 16 진수로 입력받기
        System.out.printf("%o", hexaDecimal); // 8진수로 변환하여 출력
    }
}
