package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dateArray = sc.next().split("\\.");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
