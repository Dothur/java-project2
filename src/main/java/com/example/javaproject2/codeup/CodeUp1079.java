package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char charValue = sc.next().charAt(0);
            if(charValue == 'q'){
                System.out.println(charValue);
                break;
            } else {
                System.out.println(charValue);
            }
        }
    }
}
