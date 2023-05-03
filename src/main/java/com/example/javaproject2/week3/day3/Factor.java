package com.example.javaproject2.week3.day3;

public class Factor {
    public static void main(String[] args) {
        // 36 의 약수를 구하려면?
        int n = 36;
        for (int i = 1; i <= n; i++) {
            // 36 을 i 로 나눈 나머지가 0 일 때 즉 딱 나누어 떨어질 때 그 수의 약수이다.
            if (n % i == 0) {
                System.out.printf("%d %% %d = %d\n", n, i, n % i);
            }
        }
    }
}
