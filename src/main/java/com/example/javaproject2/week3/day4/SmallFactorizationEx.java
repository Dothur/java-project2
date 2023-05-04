package com.example.javaproject2.week3.day4;

public class SmallFactorizationEx {
    public static void main(String[] args) {
        // set 를 활용하는 방법도 풀어보기
        // 시간복잡도 O(n)
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n+1];

        // 소인수분해 반복문
        while(n > 1){
            if (n % divisor == 0){
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }

        // arr 배열을 돌면서 배열에 0이 아닌값의 개수를 size 에 저장
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                size++;
            }
        }

        // size 크기의 배열을 선언하고
        // answer 배열의 0 부터 접근할수있도록 idx = 0 을 선언한다
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                answer[idx++] = arr[i];
            }
        }

        // 최종으로 중복값, 0 을 제외한 소인수가 담겨있는 배열을 출력
        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
