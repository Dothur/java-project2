package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1671 {
    public static String rockPaperScissors(int userNum, int comNum){
        if (userNum == 0 && comNum == 1){
            return "win";
        } else if(userNum == 1 && comNum == 2) {
            return "win";
        } else if (userNum == 2 && comNum == 0){
            return "win";
        } else if (userNum == comNum){
            return "tie";
        } else {
            return "lose";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        int comNum = sc.nextInt();
        // 0 : 바위
        // 1 : 가위
        // 2 : 보
        System.out.println(rockPaperScissors(userNum, comNum));
    }
}
