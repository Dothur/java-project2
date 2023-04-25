package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        // 메모리 주소끼리 비교 하기 때문에 같다고 나옴.
        System.out.println("GOLD" == "GOLD");

        String str1 = "GOLD";
        String str2 = "G";
        System.out.println("GOLD 의 해시코드 = " + str1.hashCode());
        System.out.println("G 의 해시코드 = " + str2.hashCode());

        // str1 의 G와 str2 의 G 는 같은가??
        boolean isSame = str1.substring(0, 1) == str2;
        System.out.println("isSame = " + isSame);

        // str1 의 G와 str2 의 G 의 해시코드
        System.out.println("str1.substring(0, 1) 의 해시코드 = " + str1.substring(0, 1).hashCode());
        System.out.println("str2 의 해시코드 = " + str2.hashCode());
        // 그런데 위 코드는 서로 해시코드를 비교하면 서로 같게 나오는데 "G" 가 있으면
        // 새로 생성하지 않기 때문에 String@71 주소를 리턴합니다.
    }
}
