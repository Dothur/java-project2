package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("\\.");

        System.out.printf("%02d-%02d-%04d", Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
    }
}
