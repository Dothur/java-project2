package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int res = 0;
        for(int i=1; i<=count; i++){
            if(i % 2 == 0){
                res += i;
            }
        }
        System.out.println(res);
    }
}
