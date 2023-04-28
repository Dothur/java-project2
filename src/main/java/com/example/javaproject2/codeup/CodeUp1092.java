package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aVisit = sc.nextInt();
        int bVisit = sc.nextInt();
        int cVisit = sc.nextInt();
        int dayCount = 1;
        while (true){
            if(dayCount % aVisit == 0 && dayCount % bVisit == 0 && dayCount % cVisit == 0){
                System.out.println(dayCount);
                break;
            } else {
                dayCount++;
            }
        }
    }
}
