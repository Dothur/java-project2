package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        String time = "";
        switch(day) {
            case "월", "화", "수", "목", "금": time = "08:00-17:00"; break;
            case "토", "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
